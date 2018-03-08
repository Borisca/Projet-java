package fr.m2iformation;

import javax.swing.JOptionPane;

public class InsererDonnee {

	public static void main(String[] args) {

		int[] tab = { 1, 7, 8, 9 };

		boolean test = false;
		int nbrInserer = Integer.parseInt(JOptionPane.showInputDialog("Nombre a inserer"));

		int[] tab2 = new int[tab.length + 1];

		for (int i = 0; i < tab2.length; i++) {

			
			if (i < tab.length) {
				
				//INSERTION DE VALEUR SI INFERIEUR A VALEUR DANS TABLEAU
				if (nbrInserer < tab[i] && test == false) {
					tab2[i] = nbrInserer;
					test = true;
					i++;
					
				//SI INSERTION PAS ENCORE FAITE ON REMPLI LE TABLEAU NORMALEMENT
				} else if (test == false)
					tab2[i] = tab[i];
			}
			
			//SI ON A DEJA INSERER ON REMPLI LE TAB2 EN DECALE AVEC LE TAB
			if (test == true)
				tab2[i] = tab[i - 1];
			
			//SI ON A PAS INSERER LA VALEUR ON LA PLACE A LA FIN
			if (i == tab.length && test == false)
				tab2[i] = nbrInserer;
		}

		for (int i : tab2) {
			System.out.println(i);
		}
	}
}
