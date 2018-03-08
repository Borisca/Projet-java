package Set;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class LanceurSet {

	public static void main(String[] args) {
		Set<String> strings = new LinkedHashSet<>();

		Collections.addAll(strings, "un", "deux", "trois");
		for (String string : strings) {
			System.out.println(string);
		}
	}

}
