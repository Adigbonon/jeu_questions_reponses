package jeu_questions_reponses.src.jeu_questions_reponses;

import java.lang.Exception;
import java.util.ArrayList;
import java.util.Scanner;

public class jeu_questions_reponsesCLI {
    public static void main(String[] args) throws Exception, IndexOutOfBoundsException {
        Scanner sc = new Scanner(System.in);

        //Création des joueurs
        System.out.println("Combien de joueurs etes-vous ? (min 4 | max 20)");
        String answer = sc.nextLine();
        int nbJoueurs = Integer.parseInt(answer);
        if (nbJoueurs > 20 || nbJoueurs<4)
            throw new Exception("Nombre de joueurs incorrect.");
        Joueurs selectJoueurs = new Joueurs();

        for(int i=0; i<nbJoueurs;i++)
        {
            Joueur j = new Joueur();
            j.incrementNumero(i);
            j.Saisie(); //Nom du joueur
            selectJoueurs.addToJoueurs(j);
        }
        System.out.println("Nous pouvons commencer la partie !");

        //Phases de jeu
        Phase1 phase1 = new Phase1(selectJoueurs);
        phase1.selectJoueurs(4);
        ArrayList<Joueur> gagnants_phase1 = phase1.deroulePhase(nbJoueurs);

        Phase2 phase2 = new Phase2(selectJoueurs);
        phase2.selectJoueurs(3);
        ArrayList<Joueur> gagnants_phase2 = phase2.deroulePhase(nbJoueurs);

        Phase3 phase3 = new Phase3(selectJoueurs);
        phase3.selectJoueurs(2);
        ArrayList<Joueur> gagnants_phase3 = phase3.deroulePhase(nbJoueurs);
    }
}
