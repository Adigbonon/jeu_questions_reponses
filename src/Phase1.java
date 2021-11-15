package jeu_questions_reponses.src;

public class Phase1  implements Phase {

    public Phase1(Joueurs joueurs)
    {
    }

    @Override
    public void selectJoueurs(){

    }

    @Override
    public void deroulePhase(int i){
        Themes themeChoisi = new Themes();
        themeChoisi.select_1_theme();
        Questions serieQuestions("facile");

    }
}
