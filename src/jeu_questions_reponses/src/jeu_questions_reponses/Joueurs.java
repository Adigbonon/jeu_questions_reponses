package jeu_questions_reponses.src.jeu_questions_reponses;

import java.util.*;

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
            throw new Exception("Il y a un problème dans le choix des joueurs actifs pour le round.");
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

    public static ArrayList<Joueur> compareScore(ArrayList<Joueur> participants){
        System.out.println("joueur size " + participants.size());
        List<Integer> listeScore = new ArrayList<>();

        for (int index=0; index<= participants.size()-1; index++){
            // System.out.println("joueur " + index + " " + participants.get(index).getName());
            listeScore.add(participants.get(index).getScore());
        }

        int min = Collections.min(listeScore);

        for(int indexJoueur=0; indexJoueur<= participants.size(); indexJoueur++){
            if(min == participants.get(indexJoueur).getScore()) {
                System.out.println("\n\nLe joueur " + (listeScore.get(indexJoueur)+1) + " est éliminé.\n");
                participants.get(listeScore.get(indexJoueur)).changeStatus("éliminé");
                break;
            }
        }

        return participants;
    }
}

