package exmatrice;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		int[][] tableau = new int[2][2];

		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau.length; j++) {
//				tableau[i][j] = Integer.parseInt((JOptionPane.showInputDialog(null, "rentrer Valeur", "rentrer valeur")));
				tableau[i][j]=(random(100,1));
			}
		}
		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau.length; j++) {
				System.out.print(tableau[i][j]+" ");
			}
			System.out.println();
		}

	}

	private static int random(int max, int min) {
		return (int) (min + (Math.random() * (max - min)));
	}

	
}
