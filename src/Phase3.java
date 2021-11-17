package jeu_questions_reponses.src;

import java.util.ArrayList;
import java.util.Random;

public class Phase3 implements Phase{
    Joueurs selectionJoueurs;

    public Phase3(Joueurs joueurs){
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
    public void deroulePhase(int i){

    }
}
