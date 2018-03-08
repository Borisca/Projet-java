
public enum Ingredient {

	PAIN("Pain", 1), VIANDE("Viande", 4.95), SALADE("Salade", 1), TOMATE("Tomate", 1), NAVET("Navet", 1), CONCOMBRE("Concombre", 1), CORNICHON("Cornichon", 1),PAINSEIGLE("Pain au Seigle", 1);

	String nom;
	double prix;

	private Ingredient(String nom, double prix) {
		this.nom = nom;
		this.prix = prix;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.nom);
		builder.append(" a ");
		builder.append(this.prix);
		builder.append("�");

		return builder.toString();
	}

}
