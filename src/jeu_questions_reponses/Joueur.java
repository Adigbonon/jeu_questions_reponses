package jeu_questions_reponses.src.jeu_questions_reponses;

import java.util.Scanner;

public class Joueur{
        //Attributs
        private int numeroJoueur;
        private int score;
        private String name;
        private String status;

        //Constructeur
        public Joueur(){
                this.name = "";
                this.status= "en attente";
                this.numeroJoueur= 100;
                this.score =0;
        }

        public void Saisie(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Your name :");
                this.name = sc.nextLine();
        }

        public void refreshScoreJoueur(int addPoints){
                this.score += addPoints;
        }

        public void changeStatus(String result) {
                String[] TabStatus = {"selectionne","gagnant", "super-gagnant", "elimine", "en attente"};
                for(int i=0; i< TabStatus.length; i++){
                        if(result == TabStatus[i])
                                this.status= result;
                }
        }

        public String getJoueur(){
                return("Name : "+ name + " - Score : " + score + " - Numero du joueur : "+ numeroJoueur  + " - Statut : " + status +" \n");
        }

        public int getScore(){
                return this.score;
        }

        public String getStatus(){
                return this.status;
        }

        public void setName(String Name){
                this.name= Name;
        }

        public int incrementNumero(int i){
                return this.numeroJoueur+= i*10;
        }
}
