package com.ds.bank.serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import com.ds.bank.BankAccount;

public class ObjectSerializationTest {

		public static void main(String[] args) {
			
			BankAccount ba = new BankAccount(101,"Julie",50000,1234,"Savings");
			System.out.println("Object created...");
			
			try {
				FileOutputStream fout  = new FileOutputStream("/Users/apple/bank.dat");
				System.out.println("File is ready...");
				
				ObjectOutputStream oos = new ObjectOutputStream(fout);
				System.out.println("Object stream is ready....");
				
				System.out.println("Trying to store the object...");
				oos.writeObject(ba);
				System.out.println("Object stored....");
				
				oos.close();
				fout.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
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
