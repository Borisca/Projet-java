package fr.m2iformation;

import javax.swing.JOptionPane;

public class TpTableau {

	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("Taille du tableau"));
		int valeurTest;
		int[] tab = new int[n];
		boolean test = true;

		for (int i = 0; i < tab.length; i++) {

			valeurTest = Integer.parseInt(JOptionPane.showInputDialog("Rentrer la valeur " + i + " du tableau"));

			for (int j : tab) {
				if (j == valeurTest) {
					test = false;
					i--;
					JOptionPane.showMessageDialog(null, "Cette valeur existe deja", "Doublon",
							JOptionPane.INFORMATION_MESSAGE);
					break;
				} else
					test = true;

			}

			if (test == true)
				tab[i] = valeurTest;

		}


		for (int i : tab) {
			System.out.println(i);
		}

	}

}
