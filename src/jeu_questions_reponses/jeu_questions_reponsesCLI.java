package jeu_questions_reponses.src.jeu_questions_reponses;

import java.io.IOException;
import java.lang.Exception;
import java.util.Scanner;

public class jeu_questions_reponsesCLI {
    public static void main(String[] args) throws IOException, java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        //Création des joueurs
        System.out.println("Combien de joueurs êtes-vous ? (max 20)");
        String answer = sc.nextLine();
        int nbJoueurs = Integer.parseInt(answer);
        if (nbJoueurs > 20)
            throw new Exception("Trop de joueurs.");
        Joueurs selectJoueurs = new Joueurs();

        for(int i=0; i<=nbJoueurs -1;i++)
        {
            Joueur j = new Joueur();
            j.Saisie(); //Nom du joueur
            selectJoueurs.addToJoueurs(j);
            i++;
        }
        System.out.println("Nous pouvons commencer la partie ! Voici les joueurs participants : ");
        selectJoueurs.getJoueurs();

        //Phases de jeu
        Phase1 phase1 = new Phase1(selectJoueurs);

        Phase2 phase2 = new Phase2(selectJoueurs);

        Phase3 phase3 = new Phase3(selectJoueurs);

    }
}
