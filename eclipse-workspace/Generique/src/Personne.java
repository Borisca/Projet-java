
public class Personne<T extends Number> {

	private String nom;
	
	private T nb;
	

	public Personne(String nom, T nb) {
		super();
		this.nom = nom;
		this.nb = nb;
	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public T getNb() {
		return nb;
	}

	public void setNb(T nb) {
		this.nb = nb;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", nb=" + nb + "]";
	}

	
}
