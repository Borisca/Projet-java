import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LanceurBinaire {

	public static void main(String[] args) {

		File fichier = new File("C:/Users/Administrator/eclipse-workspace/LectureEcriture/personnes.bin");

		try (DataInputStream dis = new DataInputStream(new FileInputStream(fichier.getPath()))) {

			StringBuilder builder = new StringBuilder();

			for (int j = 0; j < fichier.length() / 104; j++) {

				for (int i = 0; i < 25; i++) {
					builder.append(dis.readChar());

				}

				String nom = builder.toString().trim();

				builder.setLength(0);

				for (int i = 0; i < 25; i++) {
					builder.append(dis.readChar());

				}
				String prenom = builder.toString().trim();

				builder.setLength(0);
				int age = dis.readInt();

				System.out.println(nom + " " + prenom + " " + age);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
