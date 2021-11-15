package jeu_questions_reponses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Themes {
	private static List <String> themes = new ArrayList<>();
	private static List  <Integer> indicateurs = new ArrayList<>();
	
	public static Scanner entree = new Scanner (System.in);
	
	public Themes() {
		themes.add("Histoire");
		themes.add("Sport");
		themes.add("Musique");
		themes.add("Culture générale");
		themes.add("Mathématiques");
		themes.add("Chimie");
		themes.add("Agriculture");
		themes.add("Informatique");
		themes.add("Anglais");
		themes.add("Jardinerie");
		themes.add("");
	}
	
	public int select_1_theme() {
		String theme_selectionne;
		int position = 0;
		List <String> themes_restants = new ArrayList<>();
		
		// liste des themes non selectionnes
		for(int i = 0; i < themes.size(); i++) {
			if(indicateurs.get(i) == 0) {
				themes_restants.add(themes.get(i));
			}
		}
		
		Random rand = new Random(); //chiffre random
		
		theme_selectionne =  themes_restants.get(rand.nextInt(themes.size()));
		
		for(int i = 0; i < themes.size(); i++) {
			if(themes.get(i).equals(theme_selectionne) == true) {
				position = i;
				indicateurs.add(i, 1);
			}
		}
		
		return position;		
	}
	
	
	public List <String> select_5_themes() {
		List <String> themes_selectionnes = new ArrayList<>();
		int position;
		List <String> themes_restants = new ArrayList<>();
		
		for(int t = 0; t < 5; t++) {
			String theme_selectionne;
			
			// liste des themes non selectionnes
			for(int i = 0; i < themes.size(); i++) {
				if(indicateurs.get(i) == 0) {
					themes_restants.add(themes.get(i));
				}
			}
			
			Random rand = new Random(); //chiffre random
			
			theme_selectionne =  themes_restants.get(rand.nextInt(themes.size()));
			
			for(int i = 0; i < themes.size(); i++) {
				if(themes.get(i).equals(theme_selectionne) == true) {
					position = i;
					indicateurs.add(i, 1);
					themes_selectionnes.add(themes.get(i));
				}
			}

		}
		
		return themes_selectionnes;
	}
	
	public String toString() {
		String a_retourner="";
		
		for(int i = 0; i < themes.size(); i++) {
			String tmp = a_retourner;
			a_retourner = tmp + themes.get(i) + " - " + indicateurs.get(i) + "\n";
		}
		
		return a_retourner;
	}
	
	
}
