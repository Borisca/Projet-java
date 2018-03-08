package comparateur;

import java.util.Comparator;

public class PersonneComparator2 implements Comparator<Personne> {

	
	public int compare(Personne pers1, Personne pers2) {

		if(!pers1.getPrenom().equals(pers2.getPrenom()))
			return pers1.getPrenom().compareTo(pers2.getPrenom());		
		if(!pers1.getNom().equals(pers2.getNom()))
			return pers1.getNom().compareTo(pers2.getNom());

		return pers1.getAge()-pers2.getAge();

	}

	
}
