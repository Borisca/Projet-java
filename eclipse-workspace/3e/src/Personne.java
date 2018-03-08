
public class Personne {
	public static final int NBR_ADRESSE=3;
	private int  i=0;
	
	private String nom,prenom;
	private int age;
	private Adresse[] adresses = new Adresse[NBR_ADRESSE];
	
	
	
	public Personne(String nom, String prenom, int age) {

		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}


	public Personne(String nom, String prenom, int age, Adresse adressePrincipale) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;

	}


	public Personne() {
		super();
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void ajouterAdresse(Adresse ad) {
		
		adresses[i]=ad;
		i++;
	}

	public void afficherAdresses() {
		
		for (int i=0;i<this.i;i++) {
			System.out.println(adresses[i].getRue() + " "+ adresses[i].getVille());
		}
		
	}
	
	
}
