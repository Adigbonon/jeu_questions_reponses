package jeu_questions_reponses.src.jeu_questions_reponses;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Phase1 implements Phase{
    Joueurs selectionJoueurs;
    ArrayList<Joueur> participants;

    public Phase1(Joueurs joueurs) {
        selectionJoueurs = joueurs;
    }

    @Override
    public void selectJoueurs(int nbJoueurs) throws java.lang.Exception {
        participants = selectionJoueurs.activeJoueurs(nbJoueurs);
        System.out.println(selectionJoueurs.getJoueurs());
    }

    @Override
    public ArrayList<Joueur> deroulePhase(int nbJoueurs) throws java.lang.Exception{
        System.out.println("Phase 1");
        Scanner sc = new Scanner(System.in);
        Themes themeChoisi = new Themes();
        themeChoisi.themes_au_choix(10);
        System.out.println("Liste des thèmes :");
        themeChoisi.affich_themes_indicateurs();

        for (int indexJoueur= 0; indexJoueur< participants.size(); indexJoueur++ ) {
            System.out.println("\n\n");
            System.out.println("Joueur " + (indexJoueur+1));
            Theme themeEnCours = themeChoisi.select_1_theme();
            Joueur joueur_choisi = participants.get(indexJoueur);
            joueur_choisi.getJoueur();
            Questions listeQuestionsAPoser = themeEnCours.getListQuestions();
            Question questionAPoser = Questions.selectionQuestion("Facile", listeQuestionsAPoser.getListe());
            questionAPoser.affichQuestion(listeQuestionsAPoser,questionAPoser.getNumero());
            String entree = sc.nextLine();

            if(entree.equals(questionAPoser.getReponse())){
                participants.get(indexJoueur).refreshScoreJoueur(2);
                System.out.println("Bonne réponse !");
                System.out.println("Score : "+participants.get(indexJoueur).getScore());
            } else {
                System.out.println("Mauvaise réponse");
                System.out.println("Score : "+participants.get(indexJoueur).getScore());
            }
        }

        //Comparaison des scores
        return Joueurs.compareScore(participants);
    }
}
