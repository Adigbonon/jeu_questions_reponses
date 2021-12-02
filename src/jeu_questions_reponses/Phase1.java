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
    public void deroulePhase(int nbJoueurs) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        Themes themeChoisi = new Themes();
        themeChoisi.themes_au_choix(10);
        themeChoisi.affich_themes_indicateurs();
        Theme themeEnCours = themeChoisi.select_1_theme();

        for (int indexJoueur= 0; indexJoueur< participants.size(); indexJoueur++ ) {
            participants.get(indexJoueur);
            Questions listeQuestionsAPoser = themeEnCours.getListQuestions();
            Question questionAPoser = listeQuestionsAPoser.selectionQuestion("facile");
            questionAPoser.affichQuestion(listeQuestionsAPoser,questionAPoser.getNumero());
            String entree = sc.nextLine();

            if(entree.equals(questionAPoser.getReponse())){
                participants.get(indexJoueur).refreshScoreJoueur(2);
                System.out.println("Bonne réponse !");
                System.out.println(" Score : "+participants.get(indexJoueur).getScore());
            } else {
                System.out.println("Mauvaise réponse");
                System.out.println(" Score : "+participants.get(indexJoueur).getScore());
            }
        }

        //Comparaison des scores
        compareScore();
    }

    @Override
    public void compareScore(){
        List<Integer> listeScore = new ArrayList<>();
        for (int index=0; index<= participants.size(); index++)
            listeScore.add(participants.get(index).getScore());

        int min = Collections.min(listeScore);

        for(int indexJoueur=0; indexJoueur<= participants.size(); indexJoueur++){
            if(min == participants.get(indexJoueur).getScore())
                System.out.println("Le joueur " + listeScore.get(indexJoueur) + "est éliminé.");
            participants.get(listeScore.get(indexJoueur)).changeStatus("éliminé");
        }
    }
}
