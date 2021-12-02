package jeu_questions_reponses.src.jeu_questions_reponses;


import java.util.ArrayList;

public interface Phase {
    abstract void selectJoueurs(int nbJoueurs) throws java.lang.Exception;
    abstract ArrayList<Joueur>  deroulePhase(int nbJoueurs) throws java.lang.Exception;
}
