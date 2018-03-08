package fluxtextez;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LanceurLectureFlux {

	public static void main(String[] args) {

		
		try(BufferedReader br=new BufferedReader(new FileReader("yeats.txt"))){
			
			String str;
			while((str=br.readLine())!=null)
			
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
