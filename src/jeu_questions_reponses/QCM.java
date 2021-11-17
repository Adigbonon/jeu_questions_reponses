package jeu_questions_reponses;

public class QCM {
	
	private String texte;
	
	private String reponse1;
	private String reponse2;
	private String bonne_reponse;
	private int nb_reponses = 3;

	public String get_texte() {
		return this.texte;
	}
	
	public String get_reponse1() {
		return this.reponse1;
	}
	
	public String get_reponse2() {
		return this.reponse1;
	}
	
	public String get_bonne_reponse() {
		return this.bonne_reponse;
	}
	
	public void set_texte(String texte) {
		this.texte = texte;
	}
	
	public void set_reponse1(String reponse1) {
		this.reponse1 = reponse1;
	}
	
	public void set_reponse2(String reponse2) {
		this.reponse2 = reponse2;
	}
	
	public void set_bonne_reponse(String bonne_reponse) {
		this.bonne_reponse = bonne_reponse;
	}
}
