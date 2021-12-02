package jeu_questions_reponses.src.jeu_questions_reponses;

import java.util.*;

public class Phase2 implements Phase{
    Joueurs selectionJoueurs;
    ArrayList<Joueur> participants;

    public Phase2(Joueurs joueurs){
        selectionJoueurs = joueurs;
    }

    @Override
    public void selectJoueurs(int nbJoueurs) throws java.lang.Exception{
        for (Joueur participant: participants) {
            if(participant.getStatus() =="�limin�")
                participants.remove(participant);
        }
        participants = selectionJoueurs.activeJoueurs(nbJoueurs);
        System.out.println(selectionJoueurs.getJoueurs());
    }

    @Override
    public void deroulePhase(int nbJoueurs)throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        Themes themeChoisi = new Themes();
        themeChoisi.themes_au_choix(6);
        themeChoisi.affich_themes_indicateurs();

        ArrayList<Joueur> participants = selectionJoueurs.activeJoueurs(nbJoueurs);

        for(int tour=0;tour<2;tour++){
            for(Joueur participant: participants){
                Theme themeEnCours = themeChoisi.select_1_theme();

                Questions listeQuestionsAPoser = themeEnCours.getListQuestions();
                Question questionAPoser = listeQuestionsAPoser.selectionQuestion("moyen");
                questionAPoser.affichQuestion(listeQuestionsAPoser,questionAPoser.getNumero());
                String entree = sc.nextLine();

                if(entree.equals(questionAPoser.getReponse())){
                    participant.refreshScoreJoueur(3);
                    System.out.println("Bonne r�ponse !");
                } else {
                    System.out.println("Mauvaise r�ponse");
                }
            }
        }
        //Comparaison des scores
        compareScore();
    }

    @Override
    public void compareScore(){
        List<Integer> listeScore = new ArrayList<>();
        for (int index=0; index<= participants.size(); index++)
            listeScore.add(participants.get(index).getScore());

        int min = Collections.min(listeScore);

        for(int indexJoueur=0; indexJoueur<= participants.size(); indexJoueur++){
            if(min == participants.get(indexJoueur).getScore())
                System.out.println("Le joueur " + listeScore.get(indexJoueur) + "est �limin�.");
            participants.get(listeScore.get(indexJoueur)).changeStatus("�limin�");
        }
    }
}
