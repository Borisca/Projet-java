package fr.m2iformation;

import javax.swing.JOptionPane;

public class ChiffreDeCesar {

	public static void main(String[] args) {

		int decalage = Integer.parseInt(JOptionPane.showInputDialog("Decalage de l'alphabet"));
		String messageACoder = JOptionPane.showInputDialog("Message a coder");
		
		int minMinuscule=96;
		int minMajuscule=64;
		int maxMajuscule=90;
		int maxMinuscule=122;
		
		
		char[] lettre = new char[messageACoder.length()];

		for (int i = 0; i < messageACoder.length(); i++) {

			lettre[i] = messageACoder.charAt(i);
			System.out.println("Lettre d'origine : " + lettre[i]);

			if ((lettre[i] + decalage) > maxMajuscule && lettre[i] <= maxMajuscule) {
				System.out.println("Lettre codée " + (char) (lettre[i] + decalage -maxMajuscule + minMajuscule));
			} else if ((lettre[i] + decalage) > maxMinuscule) {
				System.out.println("Lettre codée " + (char) (lettre[i] + decalage - maxMinuscule +  minMinuscule));
			} else
				System.out.println("Lettre codée " + (char) (lettre[i] + decalage));
		}

	}
}
