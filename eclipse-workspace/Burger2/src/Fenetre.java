import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre extends JFrame{

	private static final long serialVersionUID = 1L;
	
	String[]nomBouton= {"Classique Burger","Healthy Burger","Deluxe Burger"};
	String[]nomBoutonPayer= {"Payer","Ajouter Ingredients"};
	JPanel panBoutonHamburger=new JPanel();
	JButton[]boutonHamburger=new JButton[3];
	JButton[] boutonPayer=new JButton[2];
	JPanel payerIngredients=new JPanel();
	JPanel note=new JPanel();
	static JLabel noteEcrite=new JLabel();
	JPanel recapitulatif=new JPanel();
	static JLabel recap=new JLabel();
	
	
	Fenetre (){
		this.setVisible(true);
		this.setSize(800, 600);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(new BorderLayout());
		this.setTitle("Restaurant");
		placerButtonHamburger();
		placerButtonPayer();
		recapitulatif.setBackground(Color.WHITE);
		recapitulatif.add(recap);
		this.add(panBoutonHamburger,BorderLayout.NORTH);
		this.add(payerIngredients,BorderLayout.SOUTH);
		this.add(recapitulatif, BorderLayout.EAST);
		note.setBackground(Color.WHITE);		
		note.add(noteEcrite);
		this.add(note,BorderLayout.CENTER);
		
	}

	private void placerButtonPayer() {
	
		for (int i = 0; i < nomBoutonPayer.length; i++) {
			boutonPayer[i]=new JButton(nomBoutonPayer[i]);
			payerIngredients.add(boutonPayer[i]);
			boutonPayer[i].addActionListener(new MyAction());
		}
		payerIngredients.setBackground(Color.WHITE);
		
	}

	private void placerButtonHamburger() {
		for (int i = 0; i < boutonHamburger.length; i++) {
			boutonHamburger[i]=new JButton(nomBouton[i]);
			panBoutonHamburger.add(boutonHamburger[i]);
			boutonHamburger[i].addActionListener(new MyAction());
		}
		panBoutonHamburger.setBackground(Color.white);
	}

	static void updateAffichage(List<Hamburger>ham) {
		StringBuilder builder=new StringBuilder();
		double prixTot=0;
		for (Hamburger hamburger : ham) {
			builder.append(hamburger);
			prixTot+=hamburger.getPrixTotal();
		}
		builder.append(String.format("<br>Le prix total est de : %.2f", prixTot));
		noteEcrite.setText("<html>"+builder.toString()+"</html>");

		
	}
	static void updateAffichage(Hamburger ham) {
		StringBuilder builder=new StringBuilder();			
		builder.append(ham);	
		
		noteEcrite.setText("<html>"+builder.toString()+"</html>");

		
	}
	static void updateRecap(List<Hamburger>ham) {
		StringBuilder nom =new StringBuilder();
		nom.append("Recapitulatif de la commande : <br>");
		for (Hamburger hamburger : ham) {
			
			nom.append(String.format("<br>%s <br>%.2f<br>_______________",hamburger.getNom(),hamburger.getPrixTotal() ));
		}
		recap.setText("<html>"+nom.toString()+"</html>");
	}
	
	
}