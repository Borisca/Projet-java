package calcul.salaire;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Employe> emp=new ArrayList<>();
		
		emp.add(new Permanent("Vladimir", "Dostoievski", "356546564", 4500));
		emp.add(new Permanent("Vladimir", "Dostoievski", "356546564", 4500));
		emp.add(new Permanent("Vladimir", "Dostoievski", "356546564", 4500));
		emp.add(new Permanent("Vladimir", "Dostoievski", "356546564", 4500));
		emp.add(new Permanent("Vladimir", "Dostoievski", "356546564", 4500));
		emp.add(new Permanent("Vladimir", "Dostoievski", "356546564", 4500));
		emp.add(new Permanent("Vladimir", "Dostoievski", "356546564", 4500));
		emp.add(new Permanent("Vladimir", "Dostoievski", "356546564", 4500));
		emp.add(new Permanent("Vladimir", "Dostoievski", "356546564", 4500));
		emp.add(new Permanent("Loco", "Dostoievski", "356546564", 4500));
		
		Employe perm = new Permanent("Bond", "James", "154165656541", 2500);
		Employe vac=null;
		Employe com = new Commercial("Joe", "Escobar", "564654656598", 4500000, 0.05);

		try {
			vac = new Vacataire("Jacky", "Patate", "486468487878", 45, 150);
		} catch (TropHeuresException e1) {
			e1.printStackTrace();
		}

		System.out.println(perm);
		System.out.println(vac);
		System.out.println(com);
		
		
		for(int i=0;i<emp.size();i++) {
			if (emp.get(i).getNom().equals("Vladimir")) {
				emp.remove(i);
				i--;
			}
		}

		emp.forEach(System.out::println);

	}

}
