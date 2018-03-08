import javax.swing.JOptionPane;

public class DeluxeBurger extends Hamburger{

	
	public DeluxeBurger() {
		super();
		this.setNom("Deluxe Burger");
		this.addIngredients(Ingredient.VIANDE,Ingredient.FROMAGE,Ingredient.FRITES,Ingredient.CORNICHON,Ingredient.BOISSON,Ingredient.PAINSEIGLE);
		this.setPrixTotal(this.getPrixTotal()-2);
	}

	@Override
	public void choisirIngredient() {
		JOptionPane.showMessageDialog(null, String.format("Vous ne pouvez pas acheter de suppléments pour le %s",this.nom));
		
	}
	
	
}
