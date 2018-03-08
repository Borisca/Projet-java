package calcul.salaire;

public class Vacataire extends Employe {

	private double tauxHoraire;
	private int heures;

	public Vacataire() {
		super();
	}

	public Vacataire(String nom, String prenom, String numSS, int tauxHoraire, int heures) throws TropHeuresException {
		super(nom, prenom, numSS);
		this.tauxHoraire = tauxHoraire;

		if (heures > 150)
			throw new TropHeuresException("Trop d'heures");
		this.heures = heures;
	}

	@Override
	public double calculerSalaire() {

		return this.heures * this.tauxHoraire;
	}

	public double getTauxHoraire() {
		return tauxHoraire;
	}

	public void setTauxHoraire(int tauxHoraire) {
		this.tauxHoraire = tauxHoraire;
	}

	public int getHeures() {
		return heures;
	}

	public void setHeures(int heures) {
		this.heures = heures;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + heures;
		long temp;
		temp = Double.doubleToLongBits(tauxHoraire);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vacataire other = (Vacataire) obj;
		if (heures != other.heures)
			return false;
		if (Double.doubleToLongBits(tauxHoraire) != Double.doubleToLongBits(other.tauxHoraire))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + "\nTaux horaire: " + this.getTauxHoraire() + "\nPay�: " + this.calculerSalaire()
				+ "\n";
	}

}
