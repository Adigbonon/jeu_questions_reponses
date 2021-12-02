package jeu_questions_reponses.src.jeu_questions_reponses;
import java.util.*;

public class Phase3 implements Phase{
    Joueurs selectionJoueurs;
    ArrayList<Joueur> participants;

    public Phase3(Joueurs joueurs){
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
    public ArrayList<Joueur>  deroulePhase(int nbJoueurs) throws java.lang.Exception{
        System.out.println("Phase 3");
        Scanner sc = new Scanner(System.in);
        Themes themeChoisi = new Themes();
        themeChoisi.themes_au_choix(3);
        themeChoisi.affich_themes_indicateurs();

        for(int tour=0;tour<2;tour++){
            for(Joueur participant: participants){
                Theme themeEnCours = themeChoisi.select_1_theme();

                Questions listeQuestionsAPoser = themeEnCours.getListQuestions();
                Question questionAPoser = Questions.selectionQuestion("Difficile", listeQuestionsAPoser.getListe());
                questionAPoser.affichQuestion(listeQuestionsAPoser,questionAPoser.getNumero());
                String entree = sc.nextLine();

                if(entree.equals(questionAPoser.getReponse())){
                    participant.refreshScoreJoueur(5);
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
