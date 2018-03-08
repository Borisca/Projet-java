package tpmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lanceur {

	public static void main(String[] args) {
		
		
		Formation form = new Formation("Java");
		Formation form2 = new Formation("C++");
		
		Stagiaire stag=new Stagiaire ("Bob","Den",65465454);
		Stagiaire stag1=new Stagiaire ("Joe","Jack",64654984);
		Stagiaire stag2=new Stagiaire ("Billy","Ben",987987);
		Stagiaire stag3=new Stagiaire ("Bob","Dylan",1232323211);
		
		form.add(stag,stag1,stag2,stag3);
		
		form2.add(stag2,stag3);

		
		Map<Formation,List<Stagiaire>>list=new HashMap<>();
		
		list.put(form, form.getListe());
		list.put(form2, form2.getListe());
		
		for (Formation formation : list.keySet()) {
			System.out.print(formation.display());
			
		}
		
		
		

		
		
		
		
		
	}

}
