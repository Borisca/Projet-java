package heritage;

public class Stagiaire extends Personne {

	private int numInscription;

	public Stagiaire(String nom, String prenom, int numInscription) {
		super(nom, prenom);
		this.numInscription = numInscription;
	}

	public Stagiaire() {
		super();
	}

	public int getNumInscription() {
		return numInscription;
	}

	public void setNumInscription(int numInscription) {
		this.numInscription = numInscription;
	}

	public void chanter() {
		System.out.println("Be bop blank bem boom");
	}

	public void chanter(String intro) {
		System.out.println(intro + " " + "Be bop blank bem boom");
	}


	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numInscription;
		return result;
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stagiaire other = (Stagiaire) obj;
		if (numInscription != other.numInscription)
			return false;
		return true;
	}

	
}
