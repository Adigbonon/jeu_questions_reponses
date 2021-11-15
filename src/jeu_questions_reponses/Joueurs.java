package jeu_questions_reponses.src.jeu_questions_reponses;

import java.util.ArrayList;
import java.util.Random;

public class Joueurs {
    //Attributs
    private int Joueur1, Joueur2, Joueur3, Joueur4;
    private ArrayList<Joueur> Joueurs = new ArrayList<Joueur>(20);
    private ArrayList<Joueur> activeJoueurs = new ArrayList<Joueur>(4);
    private String infos="";

    //Constructeur
    public Joueurs(){}


    private String getJoueurs(){
        infos+= "Joueurs actifs : ";
        for (int i=0; i<= 4;i++)
            infos+= activeJoueurs.get(i);
        return(infos);
    }

    //Méthodes
    public void selectJoueur(int i){
        Joueurs.add(new Joueur());
    }


    public void activeJoueurs() throws java.lang.Exception{
        Random rnd = new Random();
        try {
            do {
                this.Joueur1 = rnd.nextInt(20);
                this.Joueur2 = rnd.nextInt(20);
                this.Joueur3 = rnd.nextInt(20);
                this.Joueur4 = rnd.nextInt(20);
            } while (Joueur1==Joueur2 || Joueur1== Joueur3 ||
                    Joueur1== Joueur4 || Joueur2== Joueur3 ||
                    Joueur2 == Joueur4 || Joueur3==Joueur4);
        } catch(Exception e) {
            throw new Exception("Il y a un problème dans le choix des joueurs actifs pour le round.");
        }
        finally {
            //activeJoueurs.add(Joueurs[Joueur1]);
            //activeJoueurs.add(Joueurs[Joueur2]);
            //activeJoueurs.add(Joueurs[Joueur3]);
            //activeJoueurs.add(Joueurs[Joueur4]);
        }
    }

    void suppressJoueur(int numJoueur){
        activeJoueurs.clear();
    }
}

