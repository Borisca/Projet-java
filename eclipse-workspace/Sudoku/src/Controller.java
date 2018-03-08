
public class Controller {

	private AffichageMatrice display;
	private MatriceJeu matrice;
	private Action listener;

	
	public Controller() {

		display = new AffichageMatrice(this);
		matrice = new MatriceJeu(this);
		listener = new Action(this);

	}

	public void controlSolve() {


		byte nbre=0;
		for (byte i = 0; i < 9; i++) {
			for (byte j = 0; j < 9; j++) {
				if (matrice.getMatrice()[i][j] == 0) {
					if ((nbre=matrice.solve(i, j))!=0) {
						updateAffichage(i, j,nbre);
						matrice.setMatrice(i, j, nbre);
						matrice.resetChoix(i, j);
						controlSolve();
					}
				}
			}
		}

	}

	public void resetGrid() {
		matrice.resetGrid();
		display.resetGrid();
	}
	public void updateAffichage(byte x, byte y, byte chiffre) {
		display.update(x, y, chiffre);

	}

	public AffichageMatrice getDisplay() {
		return display;
	}

	public void setDisplay(AffichageMatrice display) {
		this.display = display;
	}

	public MatriceJeu getMatrice() {
		return matrice;
	}

	public void setMatrice(MatriceJeu matrice) {
		this.matrice = matrice;
	}

	public Action getListener() {
		return listener;
	}

	public void setListener(Action listener) {
		this.listener = listener;
	}

}