package objet;

public class Lanceur {

	public static void main(String[] args) {

		Rectangle rec = new Rectangle(50, 50);

		rec.afficherPerimetre();
		rec.afficherSurface();

		System.out.println(Rectangle2.calculerPerimetre(10, 20));

	}

}
