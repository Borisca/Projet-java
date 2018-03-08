import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LanceurFile {

	public static void main(String[] args) {

		File fichier = new File("C:/Users/Administrator/eclipse-workspace/LectureEcriture/personnes.bin");

		
		try(FileInputStream fis = new FileInputStream(fichier.getPath())){
			int i;
			while((i=fis.read())!=-1) {
				System.out.println(i);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		
		// Lecture Binaire V1
		// try {
		// fis=new FileInputStream(fichier.getPath());
		//
		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// }finally {
		// try {
		// fis.close();
		// } catch (IOException e) {
		//
		// e.printStackTrace();
		// }
		// }

		// Suppression fichier etc
		// for (File file : fichier.listFiles()) {
		// if (file.getName().contains("odt"))
		// file.delete();
		//
		//
		// }
		// for (File file : fichier.listFiles()) {
		// System.out.println(file.getName());
		// }
		// System.out.println(fichier.getPath());
		// fichier.delete();
		// try {
		// fichier.createNewFile();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

	}

}
