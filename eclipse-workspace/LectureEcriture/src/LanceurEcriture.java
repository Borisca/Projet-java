import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class LanceurEcriture {

	public static void main(String[] args) {

		String fileName="test.bin";
		


		
		
		try (DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream(fileName,false)))) {

			String nom="Boris";

			char[]tab =Arrays.copyOf(nom.toCharArray(), 25);
			dos.writeInt(456);
			for (char c : tab) {
				dos.writeChar(c);
			}
			
			dos.writeDouble(12355555.654);
			dos.flush();

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)))){
			
			String donne;
			StringBuilder builder=new StringBuilder();
			
			builder.append(dis.readInt());
			builder.append(" ");
			donne=builder.toString();
			builder.setLength(0);
			for(int i=0;i<25;i++) {

				builder.append(dis.readChar());
			}
			
			donne+=builder.toString().trim();
			builder.setLength(0);
			builder.append(dis.readDouble());
			donne+=" "+builder;
			System.out.println(donne);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}
}
