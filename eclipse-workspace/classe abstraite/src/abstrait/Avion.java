package abstrait;

public class Avion extends Vehicule{

	
	private String modele;
	
	
	


	public Avion(int nombrePlaces, String modele) {
		super(nombrePlaces);
		this.modele = modele;
	}

	public Avion() {
		super();
	}

	public void seDeplacer() {
		
		System.out.println("Je vole en  "+ this.modele+" avec "+nombrePlaces+" places." );
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((modele == null) ? 0 : modele.hashCode());
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
		Avion other = (Avion) obj;
		if (modele == null) {
			if (other.modele != null)
				return false;
		} else if (!modele.equals(other.modele))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Avion [modele=" + modele + "]";
	}



	public String getModele() {
		return modele;
	}



	public void setModele(String modele) {
		this.modele = modele;
	}






}
