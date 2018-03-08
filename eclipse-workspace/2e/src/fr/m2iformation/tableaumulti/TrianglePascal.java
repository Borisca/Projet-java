package fr.m2iformation.tableaumulti;

import javax.swing.JOptionPane;

public class TrianglePascal {

	public static void main(String[] args) {

		int nombreEtage = Integer.parseInt(JOptionPane.showInputDialog("Nombre etage pascal"));

		int[][] trianglePascal = new int[nombreEtage][];

		for (int i = 0; i < trianglePascal.length; i++) {
			trianglePascal[i] = new int[i + 1];
			for (int j = 0; j < trianglePascal[i].length; j++) {

				if (j == 0 || j == trianglePascal[i].length - 1)
					trianglePascal[i][j] = 1;
				else {
					trianglePascal[i][j] = trianglePascal[i - 1][j] + trianglePascal[i - 1][j - 1];
				}
			}

		}

		for (int[] tab : trianglePascal) {
			for (int i : tab) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
