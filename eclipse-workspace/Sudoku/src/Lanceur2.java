import javax.swing.JOptionPane;

public class Lanceur2 {

	public static void main(String[] args) {
		int nbre=0;
		
		while(nbre<=5 || nbre>=7) {
			nbre = Integer.parseInt(JOptionPane.showInputDialog("Entrer nombre"));
			if(nbre<5)
				System.out.println("Le nombre doit etre plus grand");
			else if (nbre>7)
				System.out.println("Le nombre doit etre plus petir");
			else
				System.out.println("Vous avez rentrer le nbre  "+ nbre);
		}
		
	}
}
