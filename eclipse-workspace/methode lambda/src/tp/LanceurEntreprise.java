package tp;

public class LanceurEntreprise {

	public static void main(String[] args) {
		Employe e1 = new Employe("E1", 100);
		Employe e2 = new Employe("E2", 150);
		Employe e3 = new Employe("E3", 175);
		;
		Employe e4 = new Employe("E4", 200);

		Entreprise ent = new Entreprise("Entreprise");

		ent.addEmploye(e1, e2, e3, e4);
		IActionEmploye act = new ActionEmploye();
		// Methode Lambda
		// INTERFACE IACTIONEMPLOYE A UNE METHODE ABSTRAITE QUI PREND UN EMPLOYE EN
		// PARAMETRE
		// ICI ON REDEFINI LA METHODE GRACE A CA

		IActionEmploye act3 = e -> {
			e.setSolde(1000);
		};

		ent.parcourir(act3);
		
		//DEUXIEME METHODE ON FAIT REFERENCE A UNE METHODE QUI A LES MEMES ARGUMENTS
		ent.parcourir(Entreprise::doubleSalaire);
		System.out.println(ent);

	}
}
