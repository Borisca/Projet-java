package fr.m2iformation;

public class Dedoublonnage {

	public static void main(String[] args) {

		int[] tab = { 12, 45, 45, 12, 13, 16, 18, 19, 20, 24, 25 };
		int comparaison = 0;

		for (int i = 0; i < tab.length; i++) {
			comparaison = tab[i];
			for (int j = i+1; j < tab.length; j++) {

				if (comparaison == tab[j]) {
					tab[i] = 0;
					tab[j] = 0;

				}

			}
		}

		for (int j : tab) {
			System.out.println(j);
		}

	}
}
