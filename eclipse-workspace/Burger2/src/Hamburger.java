import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public abstract class Hamburger {

	protected String nom;
	protected final Ingredient[] listIngredients = { Ingredient.CESTTOUT, Ingredient.PAIN, Ingredient.VIANDE,
			Ingredient.SALADE, Ingredient.TOMATE, Ingredient.CORNICHON, Ingredient.NAVET };
	protected List<Ingredient> ingredients = new ArrayList<>();
	private double prixTotal;
	protected int compteurInstance;

	public Hamburger() {

	}

	
	public void choisirIngredient() {
		Ingredient ing;
		while (compteurInstance < 4) {
			ing = (Ingredient) JOptionPane.showInputDialog(null,
					String.format("Choisir un ingredient pour l'%s", this.nom), "Choix d'un ingredient",
					JOptionPane.QUESTION_MESSAGE, null, listIngredients, listIngredients[0]);
			if (ing == null || ing.equals(Ingredient.CESTTOUT))
				break;
			this.getIngredients().add(ing);
			this.prixTotal += ing.getPrix();
			compteurInstance++;
			Fenetre.updateAffichage(this);
		}
		;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public double getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCompteurInstance() {
		return compteurInstance;
	}

	public void setCompteurInstance(int compteurInstance) {
		this.compteurInstance = compteurInstance;
	}

	public void removeIngredients(Ingredient ing) {
		this.getIngredients().remove(ing);
	}

	public void addIngredients(Ingredient... ing) {
		for (Ingredient ingredient : ing) {
			this.getIngredients().add(ingredient);
			prixTotal += ingredient.getPrix();
		}

	}

	public String toString() {

		StringBuilder burger = new StringBuilder();
		burger.append(String.format("<br>Dans mon %s il y a :", this.getNom()));

		for (Ingredient ingredient : this.getIngredients()) {
			burger.append(String.format("<br>%s", ingredient));
		}
		burger.append(String.format("<br>Le prix total est de %.2f<br> ________________________________", prixTotal));

		return burger.toString();
	}

}