package jeu_questions_reponses.src;

import java.util.ArrayList;
import java.util.Random;

public class Joueurs {
    //Attributs
    private int Joueur1, Joueur2, Joueur3, Joueur4;
    private static int JoueurSelectionne;
    private ArrayList<Joueur> ArrayJoueurs = new ArrayList<Joueur>(20);
    private ArrayList<Joueur> activeJoueurs = new ArrayList<Joueur>(4);
    private String infos="";

    //Constructeur
    public Joueurs(){ }

    //Méthodes
    public void addToJoueurs(Joueur joueur){
        ArrayJoueurs.add(joueur);
    }

    public static Joueur selectJoueur(ArrayList<Joueur> listeAParcourir){
        Random rnd = new Random();
        try {
            do {
                JoueurSelectionne = rnd.nextInt(listeAParcourir.size());
            } while(listeAParcourir.get(JoueurSelectionne) != null);
        } catch(Exception e){}
        return listeAParcourir.get(JoueurSelectionne);
    }

    public ArrayList activeJoueurs() throws java.lang.Exception{
        Random rnd = new Random();
        try {
            do {
                this.Joueur1 = rnd.nextInt(20);
                this.Joueur2 = rnd.nextInt(20);
                this.Joueur3 = rnd.nextInt(20);
                this.Joueur4 = rnd.nextInt(20);
            } while (Joueur1==Joueur2 || Joueur1== Joueur3 ||
                    Joueur1== Joueur4 || Joueur2== Joueur3 ||
                    Joueur2 == Joueur4 || Joueur3==Joueur4 ||
                    ArrayJoueurs.get(Joueur1) == null ||
                    ArrayJoueurs.get(Joueur2) == null ||
                    ArrayJoueurs.get(Joueur3) == null ||
                    ArrayJoueurs.get(Joueur4) == null
            );
        } catch(Exception e) {
            throw new Exception("Il y a un problème dans le choix des joueurs actifs pour le round.");
        }
        finally {
            //Changement de statut
            ArrayJoueurs.get(Joueur1).changeStatus("sélectionné");
            ArrayJoueurs.get(Joueur2).changeStatus("sélectionné");
            ArrayJoueurs.get(Joueur3).changeStatus("sélectionné");
            ArrayJoueurs.get(Joueur4).changeStatus("sélectionné");

            activeJoueurs.add(ArrayJoueurs.get(Joueur1));
            activeJoueurs.add(ArrayJoueurs.get(Joueur2));
            activeJoueurs.add(ArrayJoueurs.get(Joueur3));
            activeJoueurs.add(ArrayJoueurs.get(Joueur4));
        }
        return activeJoueurs;
    }

    public String getJoueurs() {
        infos+= "Joueurs actifs : ";
        for (int i=0; i<= 4;i++)
            infos += activeJoueurs.get(i).getJoueur();
        return(infos);
    }
}

