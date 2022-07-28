package com.ds.bank;

import java.io.Serializable;

public class BankAccount implements Serializable {
	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	private transient int pinNumber; //never serialized 
	private static String accountType; //NEVER SERIALIZED
	
	public BankAccount(int accountNumber, String accountHolder, double balance, int pinNumber, String accountType) {
		super();
		System.out.println("BankAccount(....) ctor...");
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
		this.pinNumber = pinNumber;
		this.accountType = accountType;
	}
	
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", balance="
				+ balance + ", pinNumber=" + pinNumber + ", accountType=" + accountType + "]";
	}
	
	
	
}
