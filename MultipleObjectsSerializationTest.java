package com.ds.bank.serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import com.ds.bank.BankAccount;

public class MultipleObjectsSerializationTest {

		public static void main(String[] args) {
			
			/*
			int num[]= {10,20,30}; //array declaration-cum-initialization
			for(int i=0;i<num.length;i++) {
				System.out.println("i "+num[i]);
			}
			
			System.out.println("----------");
			int score[] = new int[11];
			score[0]=123;
			score[1]=323;
			score[2]=423;
			
			for(int i=0;i<score.length;i++) {
				System.out.println("score "+score[i]);
			}
			*/
			
			
			BankAccount bankAccArray[] = new BankAccount[5];
		
			bankAccArray[0]= new BankAccount(101,"Julie",50000,1234,"Savings");
			bankAccArray[1]= new BankAccount(102,"Julia",60000,2234,"Savings");
			bankAccArray[2]= new BankAccount(103,"Janet",70000,3234,"Savings");
			bankAccArray[3]= new BankAccount(104,"Jane",80000,4234,"Savings");
			bankAccArray[4]= new BankAccount(105,"Jeniffer",90000,5234,"Savings");
			
			
			System.out.println("Objects are created...");
			
			try {
				FileOutputStream fout  = new FileOutputStream("/Users/apple/bank2.dat");
				System.out.println("File is ready...");
				
				ObjectOutputStream oos = new ObjectOutputStream(fout);
				System.out.println("Object stream is ready....");
				
				System.out.println("Trying to store the object...");
				
				oos.writeObject(bankAccArray);
				
				/*for (int i = 0; i < bankAccArray.length; i++) {
					oos.writeObject(bankAccArray[i]);
					System.out.println("Object stored....");
				}*/
				
				
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
