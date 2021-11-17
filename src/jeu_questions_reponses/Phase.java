package jeu_questions_reponses.src.jeu_questions_reponses;


public interface Phase {
    abstract Joueur selectJoueurs() throws java.lang.Exception;
    abstract void deroulePhase() throws java.lang.Exception;
}
