package jeu_questions_reponses;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Theme {
	
	private static String designation;
	private static int nb_questions;
	private static int indicateur;
	private static Questions liste_questions = new Questions();	

	public Theme() {
		Random r = new Random();
		this.nb_questions = r.nextInt(10-5) + 5;
	}
	
	public Theme(String designation, int nb_questions, int indicateur) {
		this.designation = designation;
		this.nb_questions = nb_questions;
		this.indicateur = indicateur;
	}
	
	public int getIndicateur(){
		return this.indicateur;
	}
	
	public String getDesignation(){
		return this.designation;
	}
	
	public void setDesignation(String designation){
		this.designation = designation;
	}
	
	public void setNbQuestions(int nb_questions){
		this.nb_questions = nb_questions;
	}
	
	public void setIndicateur(int indicateur){
		this.indicateur = indicateur;
	}
	
	public void setQuestions(Questions liste){
		this.liste_questions = liste;
	}
}
