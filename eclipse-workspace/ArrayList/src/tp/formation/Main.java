package tp.formation;

public class Main {

	public static void main(String[] args) {
		Stagiaire sag1=new Stagiaire("Bob","Den1",4466545);
		Stagiaire sag2=new Stagiaire("Bill","joe",4466546);
		Stagiaire sag3=new Stagiaire("Jin","Jack",4466547);
		Stagiaire sag4=new Stagiaire("Flo","Ken",4466548);
		Stagiaire sag5=new Stagiaire("Bob","Cat",4466549);
		Stagiaire sag6=new Stagiaire("Jack","Gille",44665410);
		Stagiaire sag7=new Stagiaire("Fil","Anto",44665411);
		
		Formation form=new Formation("Java");
		
		
		form.addStagiaire(sag1);
		form.addStagiaire(sag2);
		form.addStagiaire(sag3);
		form.addStagiaire(sag4);
		form.addStagiaire(sag5);
		form.addStagiaire(sag6);
		form.addStagiaire(sag7);
		
		form.removeStagiaire(sag1);
		
		
		System.out.println(form.displayStagiaire());
		
	}

}
