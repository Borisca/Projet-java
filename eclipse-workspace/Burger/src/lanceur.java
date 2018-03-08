
public class lanceur {

	public static void main(String[] args) {
		Burger b = Burger.CLASSIC;
		Burger c=Burger.HEALTHY_BURGER;
		Burger bd=Burger.DELUXE;
		
		
		bd.choisirIngredient();
		
		System.out.println(bd);

	}

}
