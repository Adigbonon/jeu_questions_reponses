package jeu_questions_reponses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question {

	private int numero;	
	private String type;
	private String theme;
	private String niveau;
	private String enonce;
	private List <String> reponses = new ArrayList<>();
	
	public static String table_difficultes[] = {"Facile", "Moyen", "Difficile"};

	public static Scanner entree = new Scanner (System.in);
	
	public Question() {
		
	}
	
	public Question(int numero, String type, String theme, String niveau, String enonce, List <String> reponses) {
		this.numero = numero;
		this.type = type;
		this.theme = theme;
		this.niveau = niveau;
		this.enonce = enonce;
		this.reponses = reponses;
	}
	
	public void affichQuestion(Questions questions, int numero) {
		Question question_a_afficher = questions.getListe().get(numero - 1);		
		
		System.out.println("Thème : " + question_a_afficher.theme + "\nNiveau : " +  
						   question_a_afficher.niveau + "\nQuestion " + (numero - 1) + " : "
						   + question_a_afficher.enonce);
		for(int i = 0;  i < question_a_afficher.reponses.size(); i++) {
				System.out.println((i+1) + " - " + question_a_afficher.reponses.get(i));
		}
	}
	
	public static Question saisieQuestion(String theme_quest) {
		Question question_a_retourner = new Question();
		
		int numero_type;
		int numero_niveau;
		String bonne_reponse;
		String autre_reponse;
		
		question_a_retourner.theme = theme_quest;
		System.out.println("Quel est le type de la question? : \n1- VF\n2- RC\n3- QCM");
		numero_type = entree.nextInt();
		
		if(numero_type == 1 || numero_type == 2 || numero_type == 3) { 
			System.out.println("Entrez l'énoncé de la question : ");
			question_a_retourner.enonce = entree.nextLine();
			
			System.out.println("Quel est le niveau de la difficulté?");
			for(int i = 0; i < table_difficultes.length; i++) {
				System.out.println((i+1) + " - " + table_difficultes[i]);
			}
			numero_niveau = entree.nextInt();
			
			if(numero_niveau > table_difficultes.length - 1 || numero_niveau < 0) {
				System.out.println("Choisissez le niveau dans la liste ci-dessus");
			} else {
				question_a_retourner.niveau = table_difficultes[numero_niveau + 1];
				
				System.out.println("Entrez l'énoncé de la question :");
				question_a_retourner.enonce = entree.nextLine();
				
				System.out.println("Entrez la bonne réponse :");
				bonne_reponse = entree.nextLine();
				
				question_a_retourner.reponses.add(bonne_reponse);
				
				if(numero_type == 1) {
					question_a_retourner.type = "VF";
				} else if(numero_type == 2){
					question_a_retourner.type = "RC";
				} else {
					question_a_retourner.type = "QCM";
				}
				
				if(numero_type == 1) {					
					System.out.println("Entrez la mauvaise réponse :");
					autre_reponse = entree.nextLine();
					question_a_retourner.reponses.add(autre_reponse);
				} else if(numero_type == 3) {					
					System.out.println("Entrez une mauvaise réponse :");
					autre_reponse = entree.nextLine();
					question_a_retourner.reponses.add(autre_reponse);
					
					System.out.println("Entrez une autre mauvaise réponse :");
					autre_reponse = entree.nextLine();
					question_a_retourner.reponses.add(autre_reponse);
				}		
			}
		} else  {
			System.out.println("Choisissez un type dans la liste ci-dessus");
		}
		
		return question_a_retourner;
	}
	
}
