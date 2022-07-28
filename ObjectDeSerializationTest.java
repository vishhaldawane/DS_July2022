package com.ds.bank.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import com.ds.bank.BankAccount;

public class ObjectDeSerializationTest {

		public static void main(String[] args) {
			
			BankAccount ba = null;
			System.out.println("Object is null...");
			
			try {
				FileInputStream fin  = new FileInputStream("/Users/apple/bank.dat");
				System.out.println("File is ready..for reading.....");
				
				ObjectInputStream ois = new ObjectInputStream(fin);
				System.out.println("Object stream is ready...for reading object.");
				
				System.out.println("Trying to retrieve the object...");
				ba = (BankAccount) ois.readObject();
				System.out.println("Object retrieved....");
				
				System.out.println("ba is : "+ba);
				
				ois.close();
				fin.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				
			
		}
	
	/*	public static void main(String[] args) throws IOException {
		
		
		BankAccount ba = new BankAccount(101,"Julie",50000,1234,"Savings");
		
		System.out.println("ba "+ba.balance);
		
		FileWriter fout  = new FileWriter("/Users/apple/bank.txt");
		PrintWriter pw = new PrintWriter(fout);
		
		pw.println(ba.accountNumber);
		pw.println(ba.accountHolder);
		pw.println(ba.balance);
		
		pw.close();
		fout.close();
		
	}
	*/
}
