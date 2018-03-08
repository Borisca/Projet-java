import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LanceurTest {

	public static void main(String[] args) {
		
		Path newFile=Paths.get("C:","test.txt");
		
		
		if (!newFile.toFile().exists()) {
			try {
				Files.createFile(newFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
