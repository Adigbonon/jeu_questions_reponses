package jeu_questions_reponses.src;

import java.util.List;
import java.util.Scanner;

public class Questions {
	public static Scanner entree = new Scanner (System.in);
	
	public Questions() {
		
	}

	public void addQuestion(List <String> liste_questions) {
		String quest;
		
		System.out.println("Entrez une question : ");
		quest = entree.nextLine();
		liste_questions.add(quest);		
	}
	
	public void deleteQuestion(List <String> liste_questions, int rang) {
		liste_questions.remove(rang-1);
	};
	
	public void selectQuestion() {; //public void selectQuestion(joueur);
	
	
	}
	
	public void affich_themes_questions(List <String> liste_themes, List <String> liste_questions) {
		for(int i = 0; i < liste_themes.size(); i++) {
			for(int q = 0; q < liste_questions.size(); q++) {
				
			}
		}		
	}
}
