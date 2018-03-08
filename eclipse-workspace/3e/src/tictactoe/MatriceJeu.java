package tictactoe;

public class MatriceJeu {

	public int[][] ticTacToe = new int[3][3];

	public MatriceJeu() {

		for (int i = 0; i < ticTacToe.length; i++) {
			for (int j = 0; j < ticTacToe.length; j++) {
				ticTacToe[i][j] = -1;
			}
		}
	}

	public void setCoup(int numeroJoueur, int positionX, int positionY) {

		ticTacToe[positionX][positionY] = numeroJoueur;
		// for (int[] is : ticTacToe) {
		// for (int i : is) {
		// System.out.print(i);
		//
		// }
		// System.out.println();
		// }

	}

	public int[][] getPlateau() {
		return ticTacToe;
	}

	public boolean chercherPerdant() {
		int compteur1 = 0, compteur2 = 0, x = 0, y = 0;
		boolean perdant = false;

		// MAT HORIZONTAL
		for (int i = 0; i < ticTacToe.length; i++) {
			for (int j = 0; j < ticTacToe.length; j++) {
				if (compteur1 == 0)
					x = ticTacToe[i][j];

				if (x == ticTacToe[i][j] && ticTacToe[i][j] != -1)
					compteur1++;

			}
			if (compteur1 == 3) {
				perdant = true;
				break;
			} else
				compteur1 = 0;

		}

		// MAT VERTICAL
		for (int i = 0; i < ticTacToe.length; i++) {
			for (int j = 0; j < ticTacToe.length; j++) {
				if (compteur1 == 0)
					x = ticTacToe[j][i];

				if (x == ticTacToe[j][i] && ticTacToe[j][i] != -1)
					compteur1++;

			}
			if (compteur1 == 3) {
				perdant = true;
				break;
			} else
				compteur1 = 0;

		}

		// MAT DIAGONALE
		for (int i = 0; i < ticTacToe.length; i++) {

			if (compteur1 == 0)
				x = ticTacToe[i][i];
			if (x == ticTacToe[i][i] && ticTacToe[i][i] != -1)
				compteur1++;

			if (compteur1 == 3) {
				perdant = true;
				break;
			}

			if (compteur2 == 0)
				y = ticTacToe[i][ticTacToe.length - i - 1];
			if (y == ticTacToe[i][ticTacToe.length - i - 1] && ticTacToe[i][ticTacToe.length - i - 1] != -1)
				compteur2++;

			if (compteur2 == 3) {
				perdant = true;
				break;
			}
		}

		return perdant;

	}

	public boolean grilleComplete() {

		boolean test = true;
		boolean sortie=false;
		
			for (int i = 0; i < ticTacToe.length; i++) {
				for (int j = 0; j < ticTacToe.length; j++) {
					if (ticTacToe[i][j] == -1) {
						test = false;
						sortie=true;
						break;

					} else
						test = true;
				}
				if (sortie) {
					break;
				}
			
		}
		return test;
	}
}
