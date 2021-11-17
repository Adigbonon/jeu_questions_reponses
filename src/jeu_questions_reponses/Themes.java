package jeu_questions_reponses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Themes {
	private static List <Theme> themes = new ArrayList<>();
	//private static List  <Integer> indicateurs = new ArrayList<>();
	
	public static Scanner entree = new Scanner (System.in);
	
	public Themes() {		
		// theme1
		Theme theme1 = new Theme("Histoire", 5, 0); 
		// questions du theme1
		Questions questions1 = new Questions(); 
		// liste reponses question 1
		List<String> liste1_theme1 = new ArrayList<>(); 
	    liste1_theme1.add("A l'apparition de l'homme"); 
	    //question1
		Question question1_theme1 = new Question(1, "RC", "Facile", "Histoire", "La pr�histoire d�bute :", liste1_theme1); 
		// liste reponses question 2
		List<String> liste2_theme1 = new ArrayList<>(); 
		liste2_theme1.add("Vrai"); 
		liste2_theme1.add("Faux"); 
		Question question2_theme1 = new Question(2, "VF", "Moyen", "Histoire", "Les dinosaures ont disparu :", liste2_theme1);
		// liste reponses question 3
		List<String> liste3_theme1 = new ArrayList<>(); 
		liste3_theme1.add("700 av J.C."); 
		liste3_theme1.add("1500 av J.C."); 
		liste3_theme1.add("200 av J.C."); 
		Question question3_theme1 = new Question(3, "QCM", "Difficile", "Histoire", "On situe l��ge de fer � :", liste3_theme1);		
		Question question4_theme1 = new Question(4, "VF", "Facile", "Histoire", "La pr�histoire d�bute :", liste2_theme1);		
		Question question5_theme1 = new Question(5, "RC", "Moyen", "Histoire", "La pr�histoire d�bute :", liste1_theme1);		
		questions1.getListe().add(question1_theme1);
		questions1.getListe().add(question2_theme1);
		questions1.getListe().add(question3_theme1);
		questions1.getListe().add(question4_theme1);
		questions1.getListe().add(question5_theme1);
		theme1.setQuestions(questions1);
		
		// theme2
		Theme theme2 = new Theme("Sport", 5, 0); 
		// questions du theme2
		Questions questions2 = new Questions(); 
		// liste reponses question 1
		List<String> liste1_theme2 = new ArrayList<>(); 
	    liste1_theme2.add("Ronaldo Dos Santos Aveiro"); 
	    //question1
		Question question1_theme2 = new Question(1, "RC", "Facile", "Sport", "Le nom de famille de Christiano :", liste1_theme2); 
		// liste reponses question 2
		List<String> liste2_theme2 = new ArrayList<>(); 
		liste2_theme1.add("Vrai"); 
		liste2_theme1.add("Faux"); 
		Question question2_theme2 = new Question(2, "VF", "Moyen", "Sport", "La France a d�j� remport� une coupe du monde:", liste2_theme2);
		// liste reponses question 3
		List<String> liste3_theme2 = new ArrayList<>(); 
		liste3_theme1.add("Lionel Messi"); 
		liste3_theme1.add("Neymar"); 
		liste3_theme1.add("Zidane"); 
		Question question3_theme2 = new Question(3, "QCM", "Difficile", "Sport", "Quel footballeur a �t� �lu Ballon d�or 2015 :", liste3_theme2);		
		Question question4_theme2 = new Question(4, "VF", "Facile", "Sport", "La France a d�j� remport� une coupe du monde:", liste2_theme2);		
		Question question5_theme2 = new Question(5, "RC", "Moyen", "Sport", "Le nom de famille de Christiano :", liste1_theme2);		
		questions1.getListe().add(question1_theme2);
		questions1.getListe().add(question2_theme2);
		questions1.getListe().add(question3_theme2);
		questions1.getListe().add(question4_theme2);
		questions1.getListe().add(question5_theme2);
		theme1.setQuestions(questions2);
		
		Theme theme3 = new Theme("Musique", 5, 0);
		// questions du theme3
		Questions questions3 = new Questions(); 
		// liste reponses question 1
		List<String> liste1_theme3 = new ArrayList<>(); 
	    liste1_theme3.add("Mozart"); 
	    //question1
		Question question1_theme3 = new Question(1, "RC", "Facile", "Musique", "Quel est le compositeur de la s�r�nade \"une petite musique de nuit\" ?", liste1_theme3); 
		// liste reponses question 2
		List<String> liste2_theme3 = new ArrayList<>(); 
		liste2_theme3.add("Vrai"); 
		liste2_theme3.add("Faux"); 
		Question question2_theme3 = new Question(2, "VF", "Moyen", "Musique", "Le groupe sud-cor�en BTS est le plus grand groupe de l'histoire.", liste2_theme3);
		// liste reponses question 3
		List<String> liste3_theme3 = new ArrayList<>(); 
		liste3_theme3.add("Tina Turner"); 
		liste3_theme3.add("Aretha Franklin"); 
		liste3_theme3.add("Cher"); 
		Question question3_theme3 = new Question(3, "QCM", "Difficile", "Musique", "What's Love Got to do With It !", liste3_theme3);		
		Question question4_theme3 = new Question(4, "VF", "Facile", "Musique", "Le groupe sud-cor�en BTS est le plus grand groupe de l'histoire.", liste2_theme3);		
		Question question5_theme3 = new Question(5, "RC", "Moyen", "Musique", "Quel est le compositeur de la s�r�nade \"une petite musique de nuit\" ?", liste1_theme3);		
		questions3.getListe().add(question1_theme3);
		questions3.getListe().add(question2_theme3);
		questions3.getListe().add(question3_theme3);
		questions3.getListe().add(question4_theme3);
		questions3.getListe().add(question5_theme3);
		theme3.setQuestions(questions3);
		
		Theme theme4 = new Theme("Culture g�n�rale", 5, 0);
		// questions du theme4
		Questions questions4 = new Questions(); 
		// liste reponses question 1
		List<String> liste1_theme4 = new ArrayList<>(); 
	    liste1_theme4.add("Juillet et ao�t"); 
	    //question1
		Question question1_theme4 = new Question(1, "RC", "Facile", "Culture g�n�rale", "Quels mois successifs de la m�me ann�e ont chacun 31 jours ?", liste1_theme4); 
		// liste reponses question 2
		List<String> liste2_theme4 = new ArrayList<>(); 
		liste2_theme4.add("Faux"); 
		liste2_theme4.add("Vrai"); 
		Question question2_theme4 = new Question(2, "VF", "Moyen", "Culture g�n�rale", "Le point culminant des montagnes du Jura est le Reculet", liste2_theme4);
		// liste reponses question 3
		List<String> liste3_theme4 = new ArrayList<>(); 
		liste3_theme4.add("Claude Monet"); 
		liste3_theme4.add("Paul C�zanne"); 
		liste3_theme4.add("Auguste Renoir"); 
		Question question3_theme4 = new Question(3, "QCM", "Difficile", "Culture g�n�rale", "Qui a peint le tableau Les Coquelicots (ou Coquelicots, la promenade) � Argenteuil en 1873 ?:", liste3_theme4);		
		Question question4_theme4 = new Question(4, "VF", "Facile", "Culture g�n�rale", "Le point culminant des montagnes du Jura est le Reculet", liste2_theme4);		
		Question question5_theme4 = new Question(5, "RC", "Moyen", "Culture g�n�rale", "Quels mois successifs de la m�me ann�e ont chacun 31 jours ?", liste1_theme4);		
		questions4.getListe().add(question1_theme4);
		questions4.getListe().add(question2_theme4);
		questions4.getListe().add(question3_theme4);
		questions4.getListe().add(question4_theme4);
		questions4.getListe().add(question5_theme4);
		theme4.setQuestions(questions4);

		Theme theme5 = new Theme("Math�matiques", 5, 0);
		// questions du theme5
		Questions questions5 = new Questions(); 
		// liste reponses question 1
		List<String> liste1_theme5 = new ArrayList<>(); 
	    liste1_theme5.add("9"); 
	    //question1
		Question question1_theme5 = new Question(1, "RC", "Facile", "Math�matiques", "la suite de : 1, 3, 5, 7, ?", liste1_theme5); 
		// liste reponses question 2
		List<String> liste2_theme5 = new ArrayList<>(); 
		liste2_theme5.add("Vrai"); 
		liste2_theme5.add("Faux"); 
		Question question2_theme5 = new Question(2, "VF", "Moyen", "Math�matiques", "la suite est logique : 25, 36, 49, 64", liste2_theme5);
		// liste reponses question 3
		List<String> liste3_theme5 = new ArrayList<>(); 
		liste3_theme5.add("d'une multiplication"); 
		liste3_theme5.add("d'une soustraction"); 
		liste3_theme5.add("d'une addition"); 
		Question question3_theme5 = new Question(3, "QCM", "Difficile", "Math�matiques", "Le produit est le r�sultat :", liste3_theme5);		
		Question question4_theme5 = new Question(4, "VF", "Facile", "Math�matiques", "la suite est logique : 25, 36, 49, 64", liste2_theme5);		
		Question question5_theme5 = new Question(5, "RC", "Moyen", "Math�matiques", "la suite de : 1, 3, 5, 7, ?", liste1_theme5);		
		questions5.getListe().add(question1_theme5);
		questions5.getListe().add(question2_theme5);
		questions5.getListe().add(question3_theme5);
		questions5.getListe().add(question4_theme5);
		questions5.getListe().add(question5_theme5);
		theme5.setQuestions(questions5);
		
		Theme theme6 = new Theme("Chimie", 5, 0);
		// questions du theme6
		Questions questions6 = new Questions(); 
		// liste reponses question 1
		List<String> liste1_theme6 = new ArrayList<>(); 
	    liste1_theme6.add("coulomb"); 
	    //question1
		Question question1_theme6 = new Question(1, "RC", "Facile", "Chimie", "Quelle unit� utilise-t-on pour mesurer la charge d'une particule ?", liste1_theme6); 
		// liste reponses question 2
		List<String> liste2_theme6 = new ArrayList<>(); 
		liste2_theme6.add("Vrai"); 
		liste2_theme6.add("Faux"); 
		Question question2_theme6 = new Question(2, "VF", "Moyen", "Chimie", "La masse d'un �lectron est n�gligeable en comparaison de celle d'un proton.", liste2_theme6);
		// liste reponses question 3
		List<String> liste3_theme6 = new ArrayList<>(); 
		liste3_theme6.add("l'hydrog�ne"); 
		liste3_theme6.add("l'azote"); 
		liste3_theme6.add("l'oxyg�ne"); 
		Question question3_theme6 = new Question(3, "QCM", "Difficile", "Chimie", " L'�l�ment qui est le plus pr�sent dans la composition de l'univers est", liste3_theme6);		
		Question question4_theme6 = new Question(4, "VF", "Facile", "Chimie", "La masse d'un �lectron est n�gligeable en comparaison de celle d'un proton.", liste2_theme6);		
		Question question5_theme6 = new Question(5, "RC", "Moyen", "Chimie", "Quelle unit� utilise-t-on pour mesurer la charge d'une particule ?", liste1_theme6);		
		questions6.getListe().add(question1_theme6);
		questions6.getListe().add(question2_theme6);
		questions6.getListe().add(question3_theme6);
		questions6.getListe().add(question4_theme6);
		questions6.getListe().add(question5_theme6);
		theme6.setQuestions(questions6);
		
		Theme theme7 = new Theme("Agriculture", 5, 0);
		// questions du theme7
		Questions questions7 = new Questions(); 
		// liste reponses question 1
		List<String> liste1_theme7 = new ArrayList<>(); 
	    liste1_theme7.add("La Politique Agricole Commune"); 
	    //question1
		Question question1_theme7 = new Question(1, "RC", "Facile", "Agriculture", "La PAC est  ?", liste1_theme7); 
		// liste reponses question 2
		List<String> liste2_theme7 = new ArrayList<>(); 
		liste2_theme7.add("Faux"); 
		liste2_theme7.add("Vrai"); 
		Question question2_theme7 = new Question(2, "VF", "Moyen", "Agriculture", "Chef de cultures est un synonyme d�agriculteur ?", liste2_theme7);
		// liste reponses question 3
		List<String> liste3_theme7 = new ArrayList<>(); 
		liste3_theme7.add("40 cours de Wimlbledon"); 
		liste3_theme7.add("Un seul terrain de golf"); 
		liste3_theme7.add("La moiti� du terrain du Stade de France"); 
		Question question3_theme7 = new Question(3, "QCM", "Difficile", "Agriculture", "Un pr� d'un hectare a la surface de ?", liste3_theme7);		
		Question question4_theme7 = new Question(4, "VF", "Facile", "Agriculture", "Chef de cultures est un synonyme d�agriculteur ?", liste2_theme7);		
		Question question5_theme7 = new Question(5, "RC", "Moyen", "Agriculture", "La PAC est  ?", liste1_theme7);		
		questions7.getListe().add(question1_theme7);
		questions7.getListe().add(question2_theme7);
		questions7.getListe().add(question3_theme7);
		questions7.getListe().add(question4_theme7);
		questions7.getListe().add(question5_theme7);
		theme7.setQuestions(questions7);
		
		Theme theme8 = new Theme("Informatique", 5, 0);
		// questions du theme8
		Questions questions8 = new Questions(); 
		// liste reponses question 1
		List<String> liste1_theme8 = new ArrayList<>(); 
	    liste1_theme8.add(" Moniteur"); 
	    //question1
		Question question1_theme8 = new Question(1, "RC", "Facile", "Informatique", "Comment appelle-t-on l��cran de l�ordinateur ?", liste1_theme8); 
		// liste reponses question 2
		List<String> liste2_theme8 = new ArrayList<>(); 
		liste2_theme8.add("Vrai"); 
		liste2_theme8.add("Faux"); 
		Question question2_theme8 = new Question(2, "VF", "Moyen", "Informatique", " Une fois l'ordinateur allum�, et que l'on se connecte � sa session, on arrive sur le bureau", liste2_theme8);
		// liste reponses question 3
		List<String> liste3_theme8 = new ArrayList<>(); 
		liste3_theme8.add("HTML (Hypertext Markup Language)"); 
		liste3_theme8.add("Java"); 
		liste3_theme8.add("C++"); 
		Question question3_theme8 = new Question(3, "QCM", "Difficile", "Informatique", "Quel est le langage informatique le plus courant utilis� pour �crire les pages web ?", liste3_theme8);		
		Question question4_theme8 = new Question(4, "VF", "Facile", "Informatique", " Une fois l'ordinateur allum�, et que l'on se connecte � sa session, on arrive sur le bureau", liste2_theme8);		
		Question question5_theme8 = new Question(5, "RC", "Moyen", "Informatique", "Comment appelle-t-on l��cran de l�ordinateur ?", liste1_theme8);		
		questions8.getListe().add(question1_theme8);
		questions8.getListe().add(question2_theme8);
		questions8.getListe().add(question3_theme8);
		questions8.getListe().add(question4_theme8);
		questions8.getListe().add(question5_theme8);
		theme8.setQuestions(questions8);
		
		Theme theme9 = new Theme("Anglais", 5, 0);
		// questions du theme9
		Questions questions9 = new Questions(); 
		// liste reponses question 1
		List<String> liste1_theme9 = new ArrayList<>(); 
	    liste1_theme9.add("I am handsome."); 
	    //question1
		Question question1_theme9 = new Question(1, "RC", "Facile", "Anglais", "Traduire la phrase : Je suis beau.", liste1_theme9); 
		// liste reponses question 2
		List<String> liste2_theme9 = new ArrayList<>(); 
		liste2_theme9.add("Faux"); 
		liste2_theme9.add("Vrai"); 
		Question question2_theme9 = new Question(2, "VF", "Moyen", "Anglais", "Cuill�re en anglais c'est knife:", liste2_theme9);
		// liste reponses question 3
		List<String> liste3_theme9 = new ArrayList<>(); 
		liste3_theme9.add("Land"); 
		liste3_theme9.add("Take off"); 
		liste3_theme9.add("Drop off"); 
		Question question3_theme9 = new Question(3, "QCM", "Difficile", "Anglais", "You�re at the airport, getting ready to leave on vacation. Your plane is about to", liste3_theme9);		
		Question question4_theme9 = new Question(4, "VF", "Facile", "Anglais", "Cuill�re en anglais c'est knife:", liste2_theme9);		
		Question question5_theme9 = new Question(5, "RC", "Moyen", "Anglais", "Traduire la phrase : Je suis beau.", liste1_theme9);		
		questions9.getListe().add(question1_theme9);
		questions9.getListe().add(question2_theme9);
		questions9.getListe().add(question3_theme9);
		questions9.getListe().add(question4_theme9);
		questions9.getListe().add(question5_theme9);
		theme9.setQuestions(questions9);
		
		Theme theme10 = new Theme("Jardinerie", 5, 0);
		// questions du theme10
		Questions questions10 = new Questions(); 
		// liste reponses question 1
		List<String> liste1_theme10= new ArrayList<>(); 
	    liste1_theme10.add("Engrais naturels"); 
	    //question1
		Question question1_theme10 = new Question(1, "RC", "Facile", "Jardinerie", "Nourrir les plantes : quels engrais choisir ?", liste1_theme10); 
		// liste reponses question 2
		List<String> liste2_theme10 = new ArrayList<>(); 
		liste2_theme10.add("Faux"); 
		liste2_theme10.add("Vrai"); 
		Question question2_theme10 = new Question(2, "VF", "Moyen", "Jardinerie", "On ne vend que des v�g�taux dans les jardineries.", liste2_theme10);
		// liste reponses question 3
		List<String> liste3_theme10 = new ArrayList<>(); 
		liste3_theme10.add("En fonction des types de l�gumes en organisant une rotation des cultures"); 
		liste3_theme10.add("En fonction des dates de semis et/ou plantation des l�gumes"); 
		liste3_theme10.add("Comme bon me semble"); 
		Question question3_theme10 = new Question(3, "QCM", "Difficile", "Jardinerie", "Comment organiser les semis et plantations des l�gumes dans un potager ?", liste3_theme10);		
		Question question4_theme10 = new Question(4, "VF", "Facile", "Jardinerie", "On ne vend que des v�g�taux dans les jardineries.", liste2_theme10);		
		Question question5_theme10 = new Question(5, "RC", "Moyen", "Jardinerie", "Nourrir les plantes : quels engrais choisir ?", liste1_theme10);		
		questions10.getListe().add(question1_theme10);
		questions10.getListe().add(question2_theme10);
		questions10.getListe().add(question3_theme10);
		questions10.getListe().add(question4_theme10);
		questions10.getListe().add(question5_theme10);
		theme1.setQuestions(questions10);

		Theme theme11 = new Theme("Electronique", 5, 0); 
		// questions du theme11
		Questions questions11 = new Questions(); 
		// liste reponses question 1
		List<String> liste1_theme11= new ArrayList<>(); 
	    liste1_theme11.add("ohms . m�tres"); 
	    //question1
		Question question1_theme11 = new Question(1, "RC", "Facile", "Electronique", "Quelle unit� mesure la r�sistivit� ?", liste1_theme11); 
		// liste reponses question 2
		List<String> liste2_theme11 = new ArrayList<>(); 
		liste2_theme1.add("Faux"); 
		liste2_theme1.add("Vrai"); 
		Question question2_theme11 = new Question(2, "VF", "Moyen", "Electronique", "Une pile a trois bornes:", liste2_theme11);
		// liste reponses question 3
		List<String> liste3_theme11 = new ArrayList<>(); 
		liste3_theme11.add("(R1 x R2) // (R1 + R2)"); 
		liste3_theme11.add("R1 + R2"); 
		liste3_theme11.add("(R1 + R2) // 2"); 
		Question question3_theme11 = new Question(3, "QCM", "Difficile", "Electronique", "Quelle est la r�sistance de R1 et R2 mont�es en parall�le ?", liste3_theme11);		
		Question question4_theme11 = new Question(4, "VF", "Facile", "Electronique", "Une pile a trois bornes:", liste2_theme11);		
		Question question5_theme11 = new Question(5, "RC", "Moyen", "Electronique", "Quelle unit� mesure la r�sistivit� ?", liste1_theme11);		
		questions11.getListe().add(question1_theme11);
		questions11.getListe().add(question2_theme11);
		questions11.getListe().add(question3_theme11);
		questions11.getListe().add(question4_theme11);
		questions11.getListe().add(question5_theme11);
		theme1.setQuestions(questions11);
		
		themes.add(theme1);
		themes.add(theme2);
		themes.add(theme3);
		themes.add(theme4);
		themes.add(theme5);
		themes.add(theme6);
		themes.add(theme7);
		themes.add(theme8);
		themes.add(theme9);
		themes.add(theme10);
		themes.add(theme11);
	}
	
	public Theme select_1_theme(Themes themes_liste) {
		Theme theme_selectionne;

		boolean theme_deja_selectionne = false;
		do {
			Random rand = new Random(); //chiffre random
			
			theme_selectionne =  themes.get(rand.nextInt(themes_liste.themes.size()));
			
			if(theme_selectionne.getIndicateur() == 0) {
				theme_selectionne.setIndicateur(1);
				theme_deja_selectionne = true;
			}
		} while(theme_deja_selectionne == false);
		
		return theme_selectionne;	
	}
	
	
	public List <Theme> select_5_themes(Themes themes_liste) {
		List <Theme> themes_selectionnes = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			themes_selectionnes.add(select_1_theme(themes_liste));
		}
		
		return themes_selectionnes;
	}
	
	public void affich_themes_indicateurs(Themes themes_liste) {
		String a_retourner="";
		
		for(int i = 0; i < themes_liste.themes.size(); i++) {
			Theme a_afficher = themes_liste.themes.get(i);
			String tmp = a_retourner;
			a_retourner = "\n" + tmp +  "Th�me " + (i+1) + " : " +  a_afficher.getDesignation() + " : " + a_afficher.getIndicateur();
		}
		
		System.out.println(a_retourner);
	}
	
	
}
