package jeu_questions_reponses.src.jeu_questions_reponses;

import java.util.Scanner;

public class Joueur{
        //Attributs
        private int numeroJoueur = 90;
        private int score =0;
        private String name;
        private String status;

        //Constructeur
        public Joueur(){
                this.status= "en attente";
                this.numeroJoueur+=10;
        }

        //Méthodes
        private void Saisie(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Your name :");
                this.name = sc.nextLine();
        }

        private String getJoueur(){
                return("Name : "+ name + " - Score : " + score + " - Numéro du joueur : "+ numeroJoueur  + " - Statut : " + status);
        }

        private void refreshScoreJoueur(int addPoints){
                this.score += addPoints;
        }

        private void changeStatus(String result) {
                String[] TabStatus = {"sélectionné","gagnant", "super-gagnant", "éliminé", "en attente"};
                for(int i=0; i<= TabStatus.length; i++){
                        if(result == TabStatus[i])
                                this.status= result;
                }
        }
}
