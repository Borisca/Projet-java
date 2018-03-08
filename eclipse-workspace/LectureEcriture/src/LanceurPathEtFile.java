import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class LanceurPathEtFile {

	public static void main(String[] args) {
		
		BufferedWriter writer = null;
		Path p=Paths.get("machin","truc");
		Path fichier = Paths.get(p.toAbsolutePath().toString(),"text.txt");
		try {
			Files.createDirectories(p);
			if(!fichier.toFile().exists())
				Files.createFile(fichier);
			writer=Files.newBufferedWriter(fichier,StandardCharsets.UTF_8,StandardOpenOption.APPEND);

			writer.write("Blablalbalbla");

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
