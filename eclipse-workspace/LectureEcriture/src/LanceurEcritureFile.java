import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class LanceurEcritureFile {

	
	public static void main(String[] args) {
		
		Path p = Paths.get("test2.Txt");
		StandardOpenOption[]options= {StandardOpenOption.CREATE,StandardOpenOption.APPEND,StandardOpenOption.CREATE		};
		try(BufferedWriter bw=Files.newBufferedWriter(p, options)){

			bw.write("1 2 3");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
