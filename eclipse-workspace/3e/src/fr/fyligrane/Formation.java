package fr.fyligrane;

public class Formation {

	private String intitule;
	private Stagiaire stagiaire;
	
	
	public Formation(String intitule, Stagiaire stagiaire) {
		this.intitule = intitule;
		this.stagiaire = stagiaire;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public Stagiaire getStagiaire() {
		return stagiaire;
	}
	public void setStagiaire(Stagiaire stagiaire) {
		this.stagiaire = stagiaire;
	}
	
	
	
}
