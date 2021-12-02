package jeu_questions_reponses.src.jeu_questions_reponses;

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

    public Joueur selectJoueur(ArrayList<Joueur> listeAParcourir){
        Random rnd = new Random();
        try {
            do {
                JoueurSelectionne = rnd.nextInt(listeAParcourir.size());
            } while(listeAParcourir.get(JoueurSelectionne) != null);
        } catch(Exception e){}
        return listeAParcourir.get(JoueurSelectionne);
    }

    public ArrayList activeJoueurs(int nombreJoueurs) throws java.lang.Exception{
        try
        {
            for (int n =0; n<nombreJoueurs;n++) {
                Joueur joueur =selectJoueur(ArrayJoueurs);
                joueur.changeStatus("selectionne");
                activeJoueurs.add(joueur);
            }
        } catch(Exception e) {
            throw new Exception("Il y a un probleme dans le choix des joueurs actifs pour le round.");
        }


        Random rnd = new Random();
        if(nombreJoueurs == 4)
        {
            this.Joueur1 =0;
            this.Joueur2=1;
            this.Joueur3=2;
            this.Joueur4=3;
        } else {
            try {
                do {
                    this.Joueur1 = rnd.nextInt(nombreJoueurs);
                    this.Joueur2 = rnd.nextInt(nombreJoueurs);
                    this.Joueur3 = rnd.nextInt(nombreJoueurs);
                    this.Joueur4 = rnd.nextInt(nombreJoueurs);
                } while (Joueur1==Joueur2 || Joueur1== Joueur3 ||
                        Joueur1== Joueur4 || Joueur2== Joueur3 ||
                        Joueur2 == Joueur4 || Joueur3==Joueur4
                );
            } catch(Exception e) {
                throw new Exception("Il y a un probleme dans le choix des joueurs actifs pour le round.");
            }
        }
        //Changement de statut
        ArrayJoueurs.get(Joueur1).changeStatus("selectionne");
        ArrayJoueurs.get(Joueur2).changeStatus("selectionne");
        ArrayJoueurs.get(Joueur3).changeStatus("selectionne");
        ArrayJoueurs.get(Joueur4).changeStatus("selectionne");

        activeJoueurs.add(ArrayJoueurs.get(Joueur1));
        activeJoueurs.add(ArrayJoueurs.get(Joueur2));
        activeJoueurs.add(ArrayJoueurs.get(Joueur3));
        activeJoueurs.add(ArrayJoueurs.get(Joueur4));
        return activeJoueurs;
    }

    public String getJoueurs() {
        infos+= "Joueurs actifs : \n";
        for (int i=0; i< 4;i++)
            infos += activeJoueurs.get(i).getJoueur();
        return(infos);
    }
}

