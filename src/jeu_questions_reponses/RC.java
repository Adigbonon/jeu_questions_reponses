package jeu_questions_reponses.src.jeu_questions_reponses;

public class RC {
	private String texte;
	private String bonne_reponse;
	private int nb_reponses = 1;

	public RC(){
		this.texte="";
		this.bonne_reponse="";
		this.nb_reponses=1;
	}
	
	public String get_texte() {
		return this.texte;
	}
	
	public String get_bonne_reponse() {
		return this.bonne_reponse;
	}
	
	public void set_texte(String texte) {
		this.texte = texte;
	}
	
	public void set_bonne_reponse(String bonne_reponse) {
		this.bonne_reponse = bonne_reponse;
	}

}
