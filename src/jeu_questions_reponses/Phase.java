package jeu_questions_reponses.src.jeu_questions_reponses;
import java.lang.Exception;

public interface Phase {
    abstract void selectJoueur(int i);
    abstract void deroulePhase(int num)  throws java.lang.Exception;
}
