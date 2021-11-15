package jeu_questions_reponses.src;
import java.lang.Exception;

public interface Phase {
    abstract void selectJoueurs();
    abstract void deroulePhase(int num);
}