package fr.fyligrane;

public class Stagiaire {

	private String nom,prenom;
	private int numInscription;
	
	
	public Stagiaire(String nom, String prenom, int numInscription) {
		this.nom = nom;
		this.prenom = prenom;
		this.numInscription = numInscription;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getNumInscription() {
		return numInscription;
	}
	public void setNumInscription(int numInscription) {
		this.numInscription = numInscription;
	}
	
	
}
