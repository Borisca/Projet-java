package fr.m2iformation.tableaumulti;

public class Palindrome {

	public static void main(String[] args) {

		boolean test = true;
		String str1 = "Kayak";
		int[] nom = new int[str1.length()];

		for (int i = 0; i < str1.length(); i++) {
			nom[i] = (int) str1.charAt(i);
		}

		for (int j = str1.length() - 1, i = 0; i < str1.length() / 2; i++, j--) {

			if (nom[i] != nom[j] && !(nom[i] + 32 == nom[j] || nom[i] - 32 == nom[j]))
				test = false;

		}

		System.out.println(test);
	}
}
