package abstrait;

public abstract class Vehicule {
	
	protected int nombrePlaces = 0;

	public Vehicule() {
		super();
	}

	public Vehicule(int nombrePlaces) {
		super();
		this.nombrePlaces = nombrePlaces;
	}

	
	public abstract void seDeplacer();
	
	public int getNombrePlaces() {
		return nombrePlaces;
	}

	public void setNombrePlaces(int nombrePlaces) {
		this.nombrePlaces = nombrePlaces;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nombrePlaces;
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
		Vehicule other = (Vehicule) obj;
		if (nombrePlaces != other.nombrePlaces)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vehicule [nombrePlaces=" + nombrePlaces + "]";
	}
	
	
}
