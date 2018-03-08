package heritage;

public class Main {

	
	public static void main(String[] args) {
		Personne p = new Personne("Holmes","Sherlock");
		p.chanter();
		Stagiaire s=new Stagiaire("Bond","James",50);
		s.chanter("Bop");
		Administratif adm = new Administratif("Boon","Danny","Postier");
		
		adm.administrer();
		
	}
}
