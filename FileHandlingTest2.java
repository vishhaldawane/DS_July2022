import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class MyFileReader
{
	FileInputStream fin;

	MyFileReader(String filename) {
		System.out.println("Trying to open the file....");
		try {
			fin = new FileInputStream(filename);
		} catch (FileNotFoundException e) {
			System.out.println("Problem1 : "+e);
		}
		System.out.println("File is open...");
	}
	
	void readFileData() {
		try {
			byte b = (byte) fin.read(); //A bhishek - read 1st letter, ie A
			System.out.println("[");
			while(b!=-1) { // -1 means EOF
				System.out.print((char)b);
				b = (byte) fin.read(); // read successive letters from pos 2
				Thread.sleep(10); //pause 100 ms
			}
			System.out.println("]");
		} 
		catch (IOException e) {
			System.out.println("Problem2 : "+e);
		}
		catch (InterruptedException e) {
			System.out.println("Problem3 : "+e);
		}
	}
	
	void closeTheFile() {
		System.out.println("Trying to close the file....");
		try {
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("File is closed....");

	}
}

public class FileHandlingTest2 {
	public static void main(String[] args) {
				
		MyFileReader mfr1 = new MyFileReader("/Users/apple/king.txt");
		MyFileReader mfr2 = new MyFileReader("/Users/apple/queen.txt");
		MyFileReader mfr3 = new MyFileReader("/Users/apple/princess.txt");
		
		mfr1.readFileData();
		mfr2.readFileData();
		mfr3.readFileData();
		
		mfr1.closeTheFile();
		mfr2.closeTheFile();
		mfr3.closeTheFile();
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