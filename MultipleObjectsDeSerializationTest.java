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

public class MultipleObjectsDeSerializationTest {

		public static void main(String[] args) {
			
		
			
			BankAccount bankAccArray[] = new BankAccount[5];
			
			System.out.println("Objects array is created...");
			
			try {
				FileInputStream fin  = new FileInputStream("/Users/apple/bank2.dat");
				System.out.println("File is ready...reading...");
				
				ObjectInputStream ois = new ObjectInputStream(fin);
				System.out.println("Object stream is ready....for reading...");
				
				System.out.println("Trying to read the object...");

				bankAccArray = (BankAccount[]) ois.readObject();
				
				for (int i = 0; i < bankAccArray.length; i++) {
					System.out.println("bankAccArray : "+bankAccArray[i]);
				}
					
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
