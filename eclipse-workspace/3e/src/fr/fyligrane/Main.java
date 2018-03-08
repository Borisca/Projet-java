package fr.fyligrane;

public class Main {

	public static void main(String[] args) {
		
		
		Stagiaire stag=new Stagiaire("Den","Bob",1);
		Formation form=new Formation("Java",stag);
		
		System.out.println(form.getStagiaire().getPrenom());
		
		
		
	}
		
 
	
	
}
