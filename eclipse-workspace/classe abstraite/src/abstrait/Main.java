package abstrait;

public class Main {

	public static void main(String[] args) {
		
		Vehicule velo = new Velo(10, "Renault");
		Vehicule avion= new Avion(151, "Airbus A 380");
		
		velo.seDeplacer();
		avion.seDeplacer();

	}

}
