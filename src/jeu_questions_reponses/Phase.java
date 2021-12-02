package jeu_questions_reponses.src.jeu_questions_reponses;


public interface Phase {
    abstract void selectJoueurs(int nbJoueurs) throws java.lang.Exception;
    abstract void deroulePhase(int nbJoueurs) throws java.lang.Exception;
    abstract void compareScore();
}
