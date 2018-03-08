package fluxtextez;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LanceurEcritureFlux {
	public static void main(String[] args) {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("Joe.txt"))) {

			bw.write("Bonjour");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try (BufferedReader br = new BufferedReader(new FileReader("Joe.txt"))) {

			String str;
			while ((str = br.readLine()) != null)

				System.out.println(str);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
