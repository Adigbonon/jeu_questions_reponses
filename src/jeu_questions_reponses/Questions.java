package jeu_questions_reponses.src.jeu_questions_reponses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questions {
	public static Scanner entree = new Scanner (System.in);
	private static List<Question> liste = new ArrayList<>();
	private String theme;
	
	public Questions() {
		
	}
	
	public List<Question> getListe() {		
		return this.liste;
	}

	public void addQuestion() {
		Question question_a_ajouter = Question.saisieQuestion(theme);
		liste.add(question_a_ajouter);
	}
	
	public void deleteQuestion(List <String> liste_questions, int rang) {
		liste_questions.remove(rang-1);
	}
	
	public Question selectionQuestion(String niveau) {
		Question question_a_afficher = liste.get(0);	// todo : modifier la ligne
		// methode round robin
		
		return question_a_afficher;
	}

	
	public void affich_themes_questions(List <Themes> liste_themes) {
		for(int i = 0; i < liste_themes.size(); i++) {
			
		}		
	}
}
