package objet;

public class Rectangle2 {

	private int largeur, hauteur;

	public Rectangle2(int largeur, int hauteur) {
		this.largeur = largeur;
		this.hauteur = hauteur;
	}

	public static int calculerPerimetre(int hauteur, int largeur) {
		return (largeur + hauteur) * 2;

	}

	public static int calculerSurface(int hauteur, int largeur) {
		return largeur * hauteur;

	}

	public int calculerPerimetre() {
		return (this.largeur + this.hauteur) * 2;
	}

	public int calculerSurface() {
		return this.largeur * this.hauteur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

}
