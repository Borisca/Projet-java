import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MatriceJeu {
	Controller control;
	private Byte[][] matrice;
	static int tracker=0;

	//TABLEAU QUI REPERTORIE PAR CASES DU SUDOKU LES DIFFERENTES POSSIBILITES QU'ELLES ONT. SI ELLES ONT 1 POSSIBILITE ON PLACE LE NOMBRE. 
	//SI ON A PLUSIEURS CHOIX. ON LES STOCKE DANS CETTE VARIABLE POUR LES COMPARER ENSUITE AVEC LES AUTRES LIST DU MEME SOUS TABLEAU POUR DETERMINER PAR DEDUCTION SI ON PEUT PLACER 
	//UN NUMERO QUI NAURAIT PAS PU ETRE PLACER UNIQUEMENT PAR ELIMINATIONS DES NON-POSSIBILITES
	//ON COMPARE LA LISTE DES POSSIBILITES DUN SOUS TABLEAU A CHACUNE DE SES LISTES ET SI UNE DENTRE ELLE A UNE SOLUTION NON-REPETEE ON SAIT QUE SEULE CETTE CASE POURRA ACCEPTER
	//CETTE SOLUTION.
	public List<Byte>[][] choix=new ArrayList[9][9]; 
	
	
	public MatriceJeu(Controller control) {
		
		this.control=control;
		matrice = new Byte[9][9];
		for (byte i = 0; i < matrice.length; i++) {
			for (byte j = 0; j < matrice.length; j++) {
				matrice[i][j] = 0;
			}

		}
		
		for (int i = 0; i < choix.length; i++) {
			for (int j = 0; j < choix.length; j++) {
				choix[i][j]=new ArrayList<>();
			}
		}

	}

	public Byte[][] getMatrice() {
		return matrice;
	}

	public void setMatrice(Byte[][] matrice) {
		this.matrice = matrice;
	}

	public boolean initMatrice(byte x, byte y, byte chiffre) {
		this.matrice[x][y] = chiffre;

		return true;

	}

	public Byte solve(byte i, byte j) {


		byte nbre=0;
		System.out.println(++tracker+" || "+i+" "+j);
		for (byte k = 1; k <= 9; k++) {

			if (test(i, j, k)) {
				nbre=k;
//				choix[i][j].add(k);	
			}
		}
		return nbre;
//		if (choix[i][j].size()>1) 
//			return 0;
//		else
//			return k;


	}

	public boolean test(byte x, byte y, byte chiffre) {

		// TEST LIGNE ET COLONNE
		for (byte i = 0; i < matrice.length; i++) {
			if (matrice[x][i] == chiffre) {
				System.out.println("False Line Valeur "+ chiffre);
				return false;
			}
			if (matrice[i][y] == chiffre) {
				System.out.println("False Column Valeur "+ chiffre);
				return false;
			}
		}

		// TestSousTableau
		for (byte i = testPositionSousTableau(x); i < testPositionSousTableau(x)+3; i++) {
			for (byte j = testPositionSousTableau(y); j < testPositionSousTableau(y)+3; j++) {
				if (matrice[i][j] == chiffre && (i != x && j != y)) {
					System.out.println("False SousTab Valeur "+ chiffre);
					return false;
				}
			}
		}

		return true;
	}

	private byte testPositionSousTableau(byte coordonnee) {

		byte byteervalle1 = 0;
		byte byteervalle2 = 3;
		byte byteervalle3 = 6;

		if (coordonnee <= 2)
			return byteervalle1;
		if (coordonnee <= 5)
			return byteervalle2;
		return byteervalle3;

	}
	
	
	public byte testSousTableau() {
		
		return 0;
	}
	public void resetGrid() {
		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice.length; j++) {
				this.matrice[i][j]=0;
			}
		}
	}

	public List<Byte>[][] getChoix() {
		return choix;
	}
	
	public void setMatrice (byte i,byte j,byte k) {
		this.matrice[i][j]=k;
	}
	public void setChoix(List<Byte>[][] choix) {
		this.choix = choix;
	}
	public void resetChoix (byte i,byte j) {
		this.choix[i][j]=new ArrayList<Byte>();
	}

}