import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public enum Burger {

	CLASSIC("Classic"),
	HEALTHY_BURGER("Healthy"), 
	DELUXE("Deluxe",Ingredient.TOMATE, Ingredient.SALADE);

	Ingredient [] listIngredients= {Ingredient.PAIN,Ingredient.VIANDE,Ingredient.SALADE,Ingredient.TOMATE,Ingredient.CORNICHON,Ingredient.NAVET};
	
	private String nom;
	private int compteurInstance = 2;

	private List<Ingredient> ingredients;

	private double prixTotal;

	private Burger(String nom,Ingredient... ing) {

		if(nom.equals("Healthy")) {
			this.compteurInstance=0;
		}		
			ingredients = new ArrayList<>();
			ingredients.add(Ingredient.PAIN);
			ingredients.add(Ingredient.VIANDE);
			this.nom=nom;
			for (Ingredient ingredient : ing) {
				ingredients.add(ingredient);
			}	
		
	}

	public void choisirIngredient() {
		Ingredient ing;
		do {
		ing=(Ingredient)JOptionPane.showInputDialog(null,"Choisir un ingredient","Choix d'un ingredient",JOptionPane.QUESTION_MESSAGE,null,listIngredients,listIngredients[2]);
		if(ing==null||compteurInstance > 4)
			break;
		this.getIngredients().add(ing);
		compteurInstance++;
		}while(true);
	}
	
//	public void addIngredient(Ingredient ing) {
//		if (compteurInstance < 4&& this.nom.equals("Classic")) {
//			this.getIngredients().add(ing);
//		}else if(compteurInstance < 6&& this.nom.equals("Healthy")) {
//			this.getIngredients().add(ing);
//		}else System.err.println("Vous ne pouvez plus rajouter d'ingredients!!");
//		compteurInstance++;
//	}

	public void removeIngredients(Ingredient ing) {
		this.getIngredients().remove(ing);
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {

		StringBuilder burger = new StringBuilder();
		burger.append("Dans mon burger il y a \n");

		for (Ingredient ingredient : this.getIngredients()) {
			burger.append(ingredient.toString());
			burger.append("\n");
			prixTotal += ingredient.getPrix();
		}
		burger.append("Le prix total est de ");
		burger.append(prixTotal);
		burger.append("€\n");

		return burger.toString();
	}

}
