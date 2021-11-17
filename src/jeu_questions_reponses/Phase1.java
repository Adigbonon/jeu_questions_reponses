package jeu_questions_reponses.src.jeu_questions_reponses;


import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Phase1 implements Phase{
    Joueurs selectionJoueurs;

    public Phase1(Joueurs joueurs) {
        selectionJoueurs = joueurs;
    }

    @Override
    public Joueur selectJoueurs() throws java.lang.Exception{
        Random rnd = new Random();
        ArrayList<Joueur> participants = selectionJoueurs.activeJoueurs();
        int index = rnd.nextInt(participants.size());

        Joueur joueurChoisi = participants.get(index);
        return joueurChoisi;
    }

    @Override
    public void deroulePhase() throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        Themes themeChoisi = new Themes();
        themeChoisi.themes_au_choix(10);
        themeChoisi.affich_themes_indicateurs();
        Theme themeEnCours = themeChoisi.select_1_theme();

        ArrayList<Joueur> participants = selectionJoueurs.activeJoueurs();
        System.out.println(selectJoueurs().getJoueur());

        for (int indexJoueur= 0; indexJoueur<= participants.size(); indexJoueur++ ) {
            participants.get(indexJoueur);
            Questions listeQuestionsAPoser = themeEnCours.getListQuestions();
            Question questionAPoser = listeQuestionsAPoser.selectionQuestion("facile");
            questionAPoser.affichQuestion(listeQuestionsAPoser,questionAPoser.getNumero());
            String entree = sc.nextLine();

            if(entree.equals(questionAPoser.getReponse())){
                participants.get(indexJoueur).refreshScoreJoueur(2);
                System.out.println("Bonne r�ponse !");
            } else {
                System.out.println("Mauvaise r�ponse");
            }
        }

        //Comparaison des scores
        List<Integer> listeScore = new ArrayList<>();
        for (int index=0; index<= participants.size(); index++)
            listeScore.add(participants.get(index).getScore());

        int min = Collections.min(listeScore);

        for(int indexJoueur=0; indexJoueur<= participants.size(); indexJoueur++){
            if(min == participants.get(indexJoueur).getScore())
                System.out.println("Le joueur " + listeScore.get(indexJoueur) + "est �limin�.");
                participants.get(listeScore.get(indexJoueur)).changeStatus("�limin�");
        }


    }
}
