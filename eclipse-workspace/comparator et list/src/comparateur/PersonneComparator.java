package comparateur;

import java.util.Comparator;

public class PersonneComparator implements Comparator<Personne> {


	public int compare(Personne pers1, Personne pers2) {

		return pers1.getAge()-pers2.getAge();
	}

}
