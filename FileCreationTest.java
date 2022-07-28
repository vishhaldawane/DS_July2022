import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCreationTest {
	public static void main(String[] args) {

		try {
			System.out.println("Trying to create a file...");
			FileOutputStream fout = new FileOutputStream("/Users/apple/prince.txt", true);
			System.out.println("File is created....");
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your data : ");
			String str = scan.nextLine();
			
			byte b[] = {10,20,30,40};
			
	//		String str = "This is the data";
			System.out.println("Got the string data...");
			
			byte byteArray [] = str.getBytes();
			System.out.println("Converted the string into the byte array....");

			fout.write(byteArray);
			System.out.println("byte array is written to the file....");
			
			fout.close();
			System.out.println("File is closed....");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


