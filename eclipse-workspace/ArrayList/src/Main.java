import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List <String> parfums=new ArrayList <>();
		
		parfums.add("Fraise");
		parfums.add("Framboise");
		parfums.add("Gateau");
		parfums.add("Gateau");
		parfums.add("Vanille");
		parfums.add("Chocolat");
		

		for (int i = 0; i < parfums.size(); i++) {
			
			if (parfums.get(i).equals("Gateau")) 
				parfums.remove(i);
			
			
		}
		parfums.forEach(System.out::println);

	}

}
