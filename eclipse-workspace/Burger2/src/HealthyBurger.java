
public class HealthyBurger extends Hamburger {

	public HealthyBurger() {
		super();
		this.setCompteurInstance(-2);
		this.setNom("Healthy Burger");
		this.addIngredients(Ingredient.PAINSEIGLE);
	}

}
