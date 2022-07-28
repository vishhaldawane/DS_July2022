import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileHandlingTest {
	public static void main(String[] args) {
		try {
			System.out.println("Trying to open the file....");
			FileInputStream fin = new FileInputStream("/Users/apple/empty.txt");
			System.out.println("File is open...");
			
			byte b = (byte) fin.read(); //A bhishek - read 1st letter, ie A
			
			System.out.println("[");
			while(b!=-1) { // -1 means EOF
				System.out.print((char)b);
				b = (byte) fin.read(); // read successive letters from pos 2
				Thread.sleep(10); //pause 100 ms
			}
			System.out.println("]");

			System.out.println("Trying to close the file....");
			fin.close();
			System.out.println("File is closed....");
			
		} catch (FileNotFoundException e) {
			System.out.println("Problem1 : "+e);
		} catch (IOException e) {
			System.out.println("Problem2 : "+e);
		} catch (InterruptedException e) {
			System.out.println("Problem3 : "+e);
		}
		
	
	}
}

/*


package = java.io

	stadard input									standard output 
	device											device
	|													|
	System.in										System.out
	|													|
	|													|
	|					Your Java Program				|
	|						|							|
	+-->->input-->-->-->data + functions -->->output->->+
							 ||
							 ||
					incoming || outgoing
					---------------------
					|		|		|
					HDD		RAM		NETWORK
					|
					FILE
						
						
						input - read
						
						output - write
						
						
						
						
==============================================================================												
BYTE BASED STREAM					||				CHARACTER BASED STREASM
		|							||				|				
		ASCII						||				UNICODE
		1 byte = 256				||				1 char = 2 bytes = 65535
=================================================================================	
InputStream     | OutputStream	    || 	  Reader         |  Writer
  read();       |   write();		||		read();		 |   write();
-----------------------------------------------------------------------------
FileInputStream | FileOutputStream  ||  FileReader		 | FileWriter
-----------------------------------------------------------------------------				
						
						
			AMIT							AMIT
			1111							2222
				
						
			65
			
	BYTE BASED		- ASCII
		<--65-->   <--77---> <---73 -->	<---84-->
		0100 0001  0100 1101  0100 1001 0101 0100  
		A		   M          I	        T
			
	CHARACTER BASED		
		<-------------65-->   <-----------77--->  <-----------73 ---> <--------84------->
		0000 0000 0100 0001  0000 0000 0100 1101  0000 0000 0100 1001 0000 0000 0101 0100  
		A		             M                    I	                  T

						
	A 65
	B 66
	C 67
	D 68
	E 69
	F 70
	G 71
	H 72
	I 73
	J 74
	K 75
	L 76
	M 77
	N 78
	O 79
	P 80
	Q 81
	R 82
	S 83
	T 84
			
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
	


*/