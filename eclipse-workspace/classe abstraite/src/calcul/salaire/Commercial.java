package calcul.salaire;

public class Commercial extends Employe{
	
	private double vente,pourcentage;

	public Commercial() {
		super();
	}

	public Commercial(String nom, String prenom, String numSS, double vente, double pourcentage) {
		super(nom, prenom, numSS);
		this.vente = vente;
		this.pourcentage = pourcentage;
	}
	

	public double calculerSalaire() {
		
		return vente*pourcentage;
	}
	

	public double getVente() {
		return vente;
	}

	public void setVente(double vente) {
		this.vente = vente;
	}

	public double getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(double pourcentage) {
		this.pourcentage = pourcentage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(pourcentage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(vente);
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
		Commercial other = (Commercial) obj;
		if (Double.doubleToLongBits(pourcentage) != Double.doubleToLongBits(other.pourcentage))
			return false;
		if (Double.doubleToLongBits(vente) != Double.doubleToLongBits(other.vente))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString()+"\nVente: "+ this.getVente()+" Pourcentage :"+this.getPourcentage()+"\nPay�: "+ this.calculerSalaire()+"\n";
	}

	


	


}