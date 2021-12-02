package jeu_questions_reponses.src.jeu_questions_reponses;

public class VF {
	private String texte;
	private boolean bonne_reponse;
	private int nb_reponses;

	public VF(){
		this.texte="";
		bonne_reponse=false;
		nb_reponses=2;
	}

	public String get_texte() {
		return this.texte;
	}
	
	public boolean get_bonne_reponse() {
		return this.bonne_reponse;
	}
	
	public void set_texte(String texte) {
		this.texte = texte;
	}
	
	public void set_bonne_reponse(boolean bonne_reponse) {
		this.bonne_reponse = bonne_reponse;
	}
	
}
