package fr.m2iformation;

public class InverserTableau {

	public static void main(String[] args) {

		int[] tab = { 1, 2, 3, 4, 5 };
		int x = 0;

		for (int i = 0; i < tab.length / 2; i++) {

			x = tab[i];
			tab[i] = tab[tab.length - i - 1];
			tab[tab.length - i - 1] = x;
		}

		for (int i : tab) {
			System.out.println(i);
		}

	}
}
