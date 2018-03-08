
public enum Pirates implements Pirateable{

	RACKAM("Rackam", "John", 23){
		public void piller() {
			System.out.println("Je pille avec classe");
		}
	}, BARBE_NOIRE("Teach", "Edward", 28), BARBE_ROUSSE("Barbe Rousse", "Khayr Ad-Din",
			45), BARBE_Q("Foreman", "George", 68);

	private final String nom;
	private final String prenom;
	private final int age;

	private Pirates(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public int getAge() {
		return age;
	}

	public String toString() {

		return String.format("nom : %s , prenom: %s , age: %d%n", this.nom, this.prenom, this.age);
	}


	public void piller() {

		System.out.println("Je pille");
	}


	public void massacrer() {

		System.out.println("Je massacre");
	}

}
