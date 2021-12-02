package jeu_questions_reponses.src.jeu_questions_reponses;

import java.util.ArrayList;
import java.util.Random;

public class Joueurs {

    private int count=0;
    private static int JoueurSelectionne;
    private ArrayList<Joueur> ArrayJoueurs = new ArrayList<Joueur>(20);
    private ArrayList<Joueur> activeJoueurs = new ArrayList<Joueur>(5);
    private String infos="";
    private Joueur bidon = new Joueur();

    public Joueurs(){ }

    public void addToJoueurs(Joueur joueur){
        ArrayJoueurs.add(joueur);
    }

    public Joueur selectJoueur(ArrayList<Joueur> listeAParcourir){
        try {
            Random rnd = new Random();
            JoueurSelectionne = rnd.nextInt(listeAParcourir.size());
        } catch(Exception e){}
        return listeAParcourir.get(JoueurSelectionne);
    }

    public ArrayList activeJoueurs(int nombreJoueurs) throws java.lang.Exception{
        try
        {
            activeJoueurs.add(bidon); //Pour entrer dans la boucle de l'array activeJoueurs
            bidon.setName("bidon");

            while (count <nombreJoueurs) {
                Joueur joueur =selectJoueur(ArrayJoueurs);
                for (int index=0; index<activeJoueurs.size(); index++){
                    if (!activeJoueurs.contains(joueur))
                    {
                        joueur.changeStatus("selectionne");
                        activeJoueurs.add(joueur);
                        count++;
                        break;
                    } else {
                        continue;
                    }
                }
            }
        } catch(Exception e) {
            throw new Exception("Il y a un probleme dans le choix des joueurs actifs pour le round.");
        }
        activeJoueurs.remove(bidon);
        return activeJoueurs;
    }

    public String getJoueurs() {
        infos+= "Joueurs actifs : \n";
        for (int i=0; i< 4;i++)
            infos += activeJoueurs.get(i).getJoueur();
        return(infos);
    }
}

