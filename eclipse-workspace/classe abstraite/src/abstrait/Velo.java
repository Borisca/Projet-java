package abstrait;

public class Velo extends Vehicule {

	private String marque;

	
	
	
	
	
	public Velo(int nombrePlaces, String marque) {
		super(nombrePlaces);
		this.marque = marque;
	}



	public Velo() {
		super();
	}



	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nombrePlaces;
		return result;
	}



	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Velo other = (Velo) obj;
		if (nombrePlaces != other.nombrePlaces)
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Velo [marque=" + marque + "]";
	}



	@Override
	public void seDeplacer() {
		System.out.println("Je roule avec un velo de marque "+ this.marque+" avec "+nombrePlaces+" places." );

	}

}
