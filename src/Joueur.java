package jeu_questions_reponses.src;

import java.util.Scanner;

public class Joueur{
        //Attributs
        private int numeroJoueur = 90;
        private int score =0;
        private static String name;
        private String status;

        //Constructeur
        public Joueur(){
                this.status= "en attente";
                this.numeroJoueur+=10;
        }

        //Méthodes
        public static void Saisie(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Your name :");
                name = sc.nextLine();
        }

        public void refreshScoreJoueur(int addPoints){
                this.score += addPoints;
        }

        public void changeStatus(String result) {
                String[] TabStatus = {"sélectionné","gagnant", "super-gagnant", "éliminé", "en attente"};
                for(int i=0; i<= TabStatus.length; i++){
                        if(result == TabStatus[i])
                                this.status= result;
                }
        }

        public String getJoueur(){
                return("Name : "+ name + " - Score : " + score + " - Numéro du joueur : "+ numeroJoueur  + " - Statut : " + status);
        }
}
