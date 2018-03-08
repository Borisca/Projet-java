import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

public class MyAction implements ActionListener {

	static List<Hamburger> b = new ArrayList<>();;

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton bouton;
		bouton = (JButton) arg0.getSource();
		switch (bouton.getText()) {
		case "Classique Burger":
			b.add(new HamburgerClassic());
			Fenetre.updateAffichage(b.get(b.size()-1));
			Fenetre.updateRecap(b);
			break;
		case "Healthy Burger":
			b.add(new HealthyBurger());
			Fenetre.updateAffichage(b.get(b.size()-1));
			Fenetre.updateRecap(b);
			break;
		case "Deluxe Burger":
			b.add(new DeluxeBurger());
			Fenetre.updateAffichage(b.get(b.size()-1));
			Fenetre.updateRecap(b);
			break;
		case "Payer":
			Fenetre.updateAffichage(b);
			Fenetre.updateRecap(b);
			b=new ArrayList<>();
			break;
		case "Ajouter Ingredients":
			b.get(b.size() - 1).choisirIngredient();
			break;
		}

	}

}