package tictactoe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Fenetre extends JFrame{

	private String[][] nom = { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };
	private JPanel[][] bouton = new JPanel[3][3];
	private JLabel[][] label = new JLabel[3][3];
	private JPanel plateauJeu = new JPanel();
	protected int compteur = 0;
	private MatriceJeu mJ = new MatriceJeu();
	private  JFrame fen = new JFrame("TicTacToe");

	public Fenetre() {

		plateauJeu.setLayout(new GridLayout(3, 3));

		for (int i = 0; i < nom.length; i++) {
			for (int j = 0; j < bouton.length; j++) {
				bouton[i][j] = new JPanel();
				bouton[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK));
				bouton[i][j].setBackground(Color.WHITE);
				bouton[i][j].setLayout(new BorderLayout());

				label[i][j] = new JLabel(" ");
				label[i][j].setHorizontalAlignment(0);
				label[i][j].setFont(new Font("Arial", Font.PLAIN, 330));

				bouton[i][j].add(label[i][j], BorderLayout.CENTER);
				plateauJeu.add(bouton[i][j]);
			}

		}

		fen.setVisible(true);
		fen.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		fen.setSize(800, 800);
		fen.setLocationRelativeTo(null);
		fen.add(plateauJeu);
		ajoutActionListener();

	}

	private void ajoutActionListener() {

		for (int i = 0; i < nom.length; i++) {
			for (int j = 0; j < bouton.length; j++) {

				bouton[i][j].addMouseListener(new MouseListener() {

					public void mousePressed(MouseEvent e) {
						int buttonX = 0;
						int buttonY = 0;

						for (int x = 0; x < nom.length; x++) {
							for (int y = 0; y < bouton.length; y++) {

								if (e.getSource().equals(bouton[x][y])) {
									buttonX = x;
									buttonY = y;
								}

							}
						}

						JPanel button = (JPanel) e.getSource();
						button.setEnabled(false);

						if (compteur % 2 == 0) {
							if (mJ.getPlateau()[buttonX][buttonY] == -1) {
								mJ.setCoup(1, buttonX, buttonY);
								compteur++;
							}
						} else {
							if (mJ.getPlateau()[buttonX][buttonY] == -1) {
								mJ.setCoup(2, buttonX, buttonY);
								compteur++;
							}
						}

						updateAffichage();

					}

					public void mouseEntered(MouseEvent e) {
					}

					public void mouseExited(MouseEvent e) {
					}

					public void mouseClicked(MouseEvent e) {
					}

					public void mouseReleased(MouseEvent e) {
					}

				});
			}

		}
	}

	public void updateAffichage() {
		for (int i = 0; i < bouton.length; i++) {
			for (int j = 0; j < bouton.length; j++) {
				if (mJ.getPlateau()[i][j] == 1) {
					label[i][j].setText("X");
					bouton[i][j].setBackground(Color.RED);
				} else if (mJ.getPlateau()[i][j] == 2) {
					label[i][j].setText("O");
					bouton[i][j].setBackground(Color.GREEN);
				}else{
					label[i][j].setText(" ");
					bouton[i][j].setBackground(Color.WHITE);
				}
			}
		}
		if(mJ.chercherPerdant()|| mJ.grilleComplete()) {
			JOptionPane.showMessageDialog(null,"Fin Partie","Fin Partie",JOptionPane.WARNING_MESSAGE);
			mJ=new MatriceJeu();
			updateAffichage();
			compteur=0;
		}
		
		
	}

}
