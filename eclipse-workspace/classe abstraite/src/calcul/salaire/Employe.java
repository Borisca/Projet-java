package calcul.salaire;

public abstract class Employe implements Employable {
	
	protected String nom,prenom,numSS;

	public Employe() {
		super();
	}

	public Employe(String nom, String prenom, String numSS) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numSS = numSS;
	}

	
	
	public void chanter(String chanson) throws ChansonPenibleException, ChansonTropLongueException{
		if (chanson.equals("Baby")) {
			throw new ChansonPenibleException("Chanson penible");
		}
		if (chanson.length()>5)
			throw new ChansonTropLongueException("Chanson trop longue");
		
		System.out.println("lalala");
	}
	
	
	public abstract double calculerSalaire();
	
	
	
	
	
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

	public String getNumSS() {
		return numSS;
	}

	public void setNumSS(String numSS) {
		this.numSS = numSS;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName()+": "+ this.getPrenom()+" "+this.getNom()+"\nNumero de Secu : "+ getNumSS() ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((numSS == null) ? 0 : numSS.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (numSS == null) {
			if (other.numSS != null)
				return false;
		} else if (!numSS.equals(other.numSS))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}

	
	
}
