package comparateur;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LancePersonne {

	public static void main(String[] args) {
		
		Personne bach=new Personne("Bach","Johan",60);
		Personne bach2=new Personne("Bach","Sebastian",25);
		Personne bach3=new Personne("Bach","Sebastian",96);
		Personne beet=new Personne("Beethoven","Ludwig",32);
		Personne beet2=new Personne("Beethoven","Von",35);
		Personne beet3=new Personne("Beethoven","Von",20);
		Personne tchai=new Personne("Tchaikovsky","Piotr",45);
		Personne tchai2=new Personne("Tchaikovsky","Illitch",15);
		Personne tchai3=new Personne("Tchaikovsky","Illitch",105);
		
		
		List<Personne>compositeurs=new ArrayList<>();
		Collections.addAll(compositeurs,bach,beet,tchai,bach2,beet2,tchai2,bach3,beet3,tchai3);
		Collections.sort(compositeurs);

		
		Comparator<Personne>comparator=new PersonneComparator2();
		
		Collections.sort(compositeurs,comparator);
		System.out.println(compositeurs);

	}
	
	
	
}
