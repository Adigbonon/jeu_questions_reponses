package jeu_questions_reponses.src;
import java.lang.Exception;

public interface Phase {
    abstract Joueur selectJoueurs() throws java.lang.Exception;
    abstract void deroulePhase(int num) throws java.lang.Exception;
}