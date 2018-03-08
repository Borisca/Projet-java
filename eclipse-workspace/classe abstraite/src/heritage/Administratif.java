package heritage;

public class Administratif extends Personne {
	private String poste;




	public Administratif() {
		super();
	}

	public Administratif(String nom, String prenom, String poste) {
		super(nom, prenom);
		this.poste = poste;
	}

	public void administrer() {
		System.out.println("J'administre");
	}


	public void chanter() {
		System.out.println(".....");
	}

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

}
