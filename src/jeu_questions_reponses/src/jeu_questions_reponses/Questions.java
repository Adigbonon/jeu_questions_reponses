package jeu_questions_reponses.src.jeu_questions_reponses;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Questions {
	public static Scanner entree = new Scanner (System.in);
	private List<Question> liste = new ArrayList<>();
	private String theme;
	
	public Questions() {
		
	}
	
	public List<Question> getListe() {		
		return liste;
	}

	public void addQuestion() {
		Question question_a_ajouter = Question.saisieQuestion(theme);
		liste.add(question_a_ajouter);
	}
	
	public void deleteQuestion(List <String> liste_questions, int rang) {
		liste_questions.remove(rang-1);
	}

	public static Question selectionQuestion(String niveau, List<Question> liste_q) {
		// todo : modifier la  fonction pour appliquer la methode round robin
		Random rnd = new Random();
		List<Question> questions_du_niveau = new ArrayList<>();

		for(int i = 0; i < liste_q.size(); i++){
			if(liste_q.get(i).getNiveau().equals(niveau)){
				questions_du_niveau.add(liste_q.get(i));
			}
		}

		Question question_a_afficher = new Question();

		if(!questions_du_niveau.isEmpty()) {
			System.out.println("questions_du_niveau " + questions_du_niveau.size());
			int chiffre_random = 0;
			while(chiffre_random == 0)
				chiffre_random = rnd.nextInt(questions_du_niveau.size());
			System.out.println("random chiffre " + chiffre_random);
			question_a_afficher = questions_du_niveau.get(chiffre_random);
			return question_a_afficher;
		} else {
			System.out.println("La liste de questions est vide.");
			// selectionQuestion(niveau, liste_q);
		}
		return question_a_afficher;
	}

	
	public void affich_themes_questions(List <Themes> liste_themes) {
		for(int i = 0; i < liste_themes.size(); i++) {
			
		}		
	}
}
