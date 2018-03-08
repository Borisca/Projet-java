import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

public class Action implements ActionListener {

	private static JComboBox<Byte> [][] sudokuCase;
	private static Controller control;
	



	public Action(Controller controller) {

		control=controller;
		sudokuCase=control.getDisplay().getSudokuCase();
	}

	public Action() {	
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JComboBox<Byte> comboBox = (JComboBox<Byte>)arg0.getSource();
		byte x = 0,y = 0,chiffre=0;
		chiffre=(byte)comboBox.getSelectedIndex();
		
		//CHECK SI VALEUR EST DIFFERENT DE NULL
		if(chiffre!=-1) {
		for (byte i = 0; i < sudokuCase.length; i++) {
			for (byte j = 0; j < sudokuCase.length; j++) {
				if(comboBox.equals(sudokuCase[i][j])) {
					x=i;
					y=j;
				}
			}
		}
		control.getMatrice().initMatrice(x, y, chiffre);
		control.updateAffichage(x,y,chiffre);		
		}
	}

}
