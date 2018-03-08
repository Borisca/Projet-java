package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LanceurMap {

	public static void main(String[] args) {
		Map<String, Integer> listeCourse = new HashMap<>();

		listeCourse.put("Carotte", 5);
		listeCourse.put("Concombre", 10);
		listeCourse.put("Poireau", 15);
		listeCourse.put("Jambon", 3);
		listeCourse.put("Nutella", 12);
		listeCourse.put("Chocolat", 8);
		listeCourse.put("Creme", 50);

		Set<String> keys = listeCourse.keySet();
		System.out.println(keys);
		System.out.println(listeCourse);
		System.out.println(listeCourse.get("Concombre"));
		
		List<Integer>values =new ArrayList<>(listeCourse.values());


	}
}
