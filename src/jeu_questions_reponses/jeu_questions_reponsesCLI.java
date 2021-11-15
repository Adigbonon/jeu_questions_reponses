package jeu_questions_reponses.src.jeu_questions_reponses;

import java.io.IOException;
import java.lang.Exception;

public class jeu_questions_reponsesCLI implements Phase {
    public static void main(String[] args) throws IOException {
        //Phase 1
        //deroulePhase(1);
        //Phase 2

        //Phase 3

    }

    @Override
    public void selectJoueur(int i) {

    }

    @Override
    public void deroulePhase(int num) throws java.lang.Exception {
    switch (num){
        default:
            System.out.println("Echec du déroulement de la phase");
        case 1:
            Joueurs selectionJoueurs = new Joueurs();
            selectionJoueurs.activeJoueurs();
            //Themes selectionTheme = new Themes();
            //Niveau Question
            //Joueurs répondent à leurs questions
            //Joueurs score --> +2 si c'est bon
            //Suppression du 4ème joueurs
        case 2:
            //selectionJoueurs.selectJoueur();
        }
    }
}
