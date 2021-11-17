package jeu_questions_reponses.src.jeu_questions_reponses;

import java.lang.Exception;
import java.util.Scanner;

public class jeu_questions_reponsesCLI {
    public static void main(String[] args) throws Exception, IndexOutOfBoundsException {
        Scanner sc = new Scanner(System.in);

        //Création des joueurs
        System.out.println("Combien de joueurs êtes-vous ? (min 4 | max 20)");
        String answer = sc.nextLine();
        int nbJoueurs = Integer.parseInt(answer);
        if (nbJoueurs > 20|| nbJoueurs<4)
            throw new Exception("Trop de joueurs.");
        Joueurs selectJoueurs = new Joueurs();

        for(int i=0; i<nbJoueurs;i++)
        {
            Joueur j = new Joueur();
            j.Saisie(); //Nom du joueur
            selectJoueurs.addToJoueurs(j);
        }
        System.out.println("Nous pouvons commencer la partie ! Voici les joueurs participants : ");

        //Phases de jeu
        Phase1 phase1 = new Phase1(selectJoueurs);
        phase1.selectJoueurs();
        phase1.deroulePhase();

        Phase2 phase2 = new Phase2(selectJoueurs);
        phase2.selectJoueurs();
        phase2.deroulePhase();

        Phase3 phase3 = new Phase3(selectJoueurs);
        phase3.selectJoueurs();
        phase3.deroulePhase();
    }
}
