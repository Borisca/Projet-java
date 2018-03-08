
public class Main {

	public static void main(String[] args) {
		Adresse ad = new Adresse("Le Doyen", "Grenoble");
		Adresse ad2 = new Adresse("rue qazdazda", "Le Havre");
		Personne p = new Personne("Bob", "Den", 28);

		p.ajouterAdresse(ad);
		p.ajouterAdresse(ad2);
		p.afficherAdresses();


	}

}
