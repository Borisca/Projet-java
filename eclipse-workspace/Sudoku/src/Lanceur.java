import javax.swing.JOptionPane;

public class Lanceur {

	public static void main(String[] args) {

		double prixUnitaire, tVA, prixTTC,prixHT;
		int nbArticle;

		prixUnitaire = Double.parseDouble(JOptionPane.showInputDialog("Entrer prix unitaire"));
		nbArticle = Integer.parseInt(JOptionPane.showInputDialog("Entrer nombre d'article"));
		tVA = Double.parseDouble(JOptionPane.showInputDialog("Entrer TVA"));
		prixHT=prixUnitaire*nbArticle;
		prixTTC=(prixHT)*(1+tVA/100);
		
		System.out.println(String.format("Le prix unitaire de l'article est %.2f\nLe rpix total hors taxe est %.2f\nLa TVA est de %.2f %s . Le total TTC est de %.2f",prixUnitaire,prixHT,tVA,"%",prixTTC ));
	}

}
