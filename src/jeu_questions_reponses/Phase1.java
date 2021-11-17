package jeu_questions_reponses.src.jeu_questions_reponses;
import jeu_questions_reponses.Themes;

import java.lang.Exception;
import java.util.ArrayList;
import java.util.Random;

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
    public void deroulePhase(int i) throws java.lang.Exception{
        Themes themeChoisi = new Themes();
        themeChoisi.select_1_theme();
        //Questions serieQuestions("facile");

        ArrayList<Joueur> participants = selectionJoueurs.activeJoueurs();
        for (int indexJoueur= 0; indexJoueur<= participants.size(); indexJoueur++ ) {
            //Réponse question
            //if(bonne réponse)
            participants.get(indexJoueur);
        }
    }
}
