package heritage;

public class Formateur extends Personne {

	private String specialite;

	public Formateur(String nom, String prenom, String specialite) {
		super(nom, prenom);
		this.specialite = specialite;
	}

	public Formateur() {
		super();
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}


	public void chanter() {
		System.out.println("Yo");
	}

}
