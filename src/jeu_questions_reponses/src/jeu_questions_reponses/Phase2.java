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
            if(participant.getStatus() =="éliminé")
                participants.remove(participant);
        }
        participants = selectionJoueurs.activeJoueurs(nbJoueurs);
        System.out.println(selectionJoueurs.getJoueurs());
    }

    @Override
    public ArrayList<Joueur>  deroulePhase(int nbJoueurs)throws java.lang.Exception{
        System.out.println("Phase 2");
        Scanner sc = new Scanner(System.in);
        jeu_questions_reponses.src.jeu_questions_reponses.Themes themeChoisi = new jeu_questions_reponses.src.jeu_questions_reponses.Themes();
        themeChoisi.themes_au_choix(6);
        themeChoisi.affich_themes_indicateurs();

        ArrayList<Joueur> participants = selectionJoueurs.activeJoueurs(nbJoueurs);

        for(int tour=0;tour<2;tour++){
            for(Joueur participant: participants){
                jeu_questions_reponses.src.jeu_questions_reponses.Theme themeEnCours = themeChoisi.select_1_theme();

                Questions listeQuestionsAPoser = themeEnCours.getListQuestions();
                Question questionAPoser = Questions.selectionQuestion("Moyen", listeQuestionsAPoser.getListe());
                questionAPoser.affichQuestion(listeQuestionsAPoser,questionAPoser.getNumero());
                String entree = sc.nextLine();

                if(entree.equals(questionAPoser.getReponse())){
                    participant.refreshScoreJoueur(3);
                    System.out.println("Bonne réponse !");
                } else {
                    System.out.println("Mauvaise réponse");
                }
            }
        }
        //Comparaison des scores
        return Joueurs.compareScore(participants);
    }
}
