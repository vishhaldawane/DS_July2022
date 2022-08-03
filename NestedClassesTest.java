import java.time.LocalDate;

public class NestedClassesTest {
	public static void main(String[] args) {
		
		BankAccount acc = new BankAccount(101,"Jack",50000);
		
		BankAccount.Statement bankStatement1 = new BankAccount.Statement();
		BankAccount.Statement bankStatement2 = new BankAccount.Statement();
		BankAccount.Statement bankStatement3 = new BankAccount.Statement();
		BankAccount.Statement bankStatement4 = new BankAccount.Statement();
		
		acc.activateWithdrawl(true);
		
		double transAmt1=500;
		acc.withdraw(transAmt1);
		bankStatement1.setSerialId(1);
		bankStatement1.setTransactionAmount(transAmt1);
		bankStatement1.setTransactionDate(LocalDate.now());
		bankStatement1.setTransactionType("Debit");
		bankStatement1.setRemaniningBalance(acc.getBalance() - transAmt1);
		
		
		double transAmt2=500;
		acc.withdraw(transAmt2);
		bankStatement2.setSerialId(1);
		bankStatement2.setTransactionAmount(transAmt2);
		bankStatement2.setTransactionDate(LocalDate.now());
		bankStatement2.setTransactionType("Debit");
		bankStatement2.setRemaniningBalance(acc.getBalance() - transAmt2);
		
			
		double transAmt3=700;
		acc.withdraw(transAmt3);
		bankStatement3.setSerialId(3);
		bankStatement3.setTransactionAmount(transAmt3);
		bankStatement3.setTransactionDate(LocalDate.now());
		bankStatement3.setTransactionType("Debit");
		bankStatement3.setRemaniningBalance(acc.getBalance() - transAmt3);
		
		double transAmt4=800;
		acc.withdraw(transAmt4);
		bankStatement4.setSerialId(4);
		bankStatement4.setTransactionAmount(transAmt4);
		bankStatement4.setTransactionDate(LocalDate.now());
		bankStatement4.setTransactionType("Debit");
		bankStatement4.setRemaniningBalance(acc.getBalance() - transAmt4);
		
		
		System.out.println(bankStatement1);
		System.out.println(bankStatement2);
		System.out.println(bankStatement3);
		System.out.println(bankStatement4);
		
		acc.deActivateWithdrawl(false);
		
		acc.withdraw(6000);
		
		//BankPermission bankP = new BankPermission();
		//acc.bankPerm
	}
}

class BankAccount
{
	private int acno;
	private String acname;
	private double balance;
	private BankPermission bankPerm = new BankPermission(false,true,true);
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	void activateWithdrawl(boolean activate)
	{
		System.out.println("Activating the withdrawal....");
		bankPerm.setWithdraw(activate);
	}
	
	void deActivateWithdrawl(boolean deActivate)
	{
		System.out.println("de-Activating the withdrawal....");
		bankPerm.setWithdraw(deActivate);
	}
	public BankAccount(int acno, String acname, double balance) {
		super();
		this.acno = acno;
		this.acname = acname;
		this.balance = balance;
	}

	void withdraw(double amt) {
		if(bankPerm.isWithdraw()==false) {
			throw new RuntimeException("Withdraw is not yet allowed...");
		}
		else {
			
			balance = balance - amt;
			System.out.println("Withdraw is done...");
		}
	}
	
	public static class Statement // can be referred via BankAccount.Statement
	{
		int serialId;
		LocalDate transactionDate;
		String transactionType;
		double transactionAmount;
		double remaniningBalance;
		public int getSerialId() {
			return serialId;
		}
		public void setSerialId(int serialId) {
			this.serialId = serialId;
		}
		public LocalDate getTransactionDate() {
			return transactionDate;
		}
		public void setTransactionDate(LocalDate transactionDate) {
			this.transactionDate = transactionDate;
		}
		public String getTransactionType() {
			return transactionType;
		}
		public void setTransactionType(String transactionType) {
			this.transactionType = transactionType;
		}
		public double getTransactionAmount() {
			return transactionAmount;
		}
		public void setTransactionAmount(double transactionAmount) {
			this.transactionAmount = transactionAmount;
		}
		public double getRemaniningBalance() {
			return remaniningBalance;
		}
		public void setRemaniningBalance(double remaniningBalance) {
			this.remaniningBalance = remaniningBalance;
		}
		@Override
		public String toString() {
			return "Statement [serialId=" + serialId + ", transactionDate=" + transactionDate + ", transactionType="
					+ transactionType + ", transactionAmount=" + transactionAmount + ", remaniningBalance="
					+ remaniningBalance + "]";
		}
		
		
	}
	
	private class BankPermission //private nested class
	{
		boolean withdraw; //false
		boolean deposit ;// false;
		boolean transfer; //false
		
		
		public BankPermission(boolean withdraw, boolean deposit, boolean transfer) {
			super();
			this.withdraw = withdraw;
			this.deposit = deposit;
			this.transfer = transfer;
		}


		public boolean isWithdraw() {
			return withdraw;
		}


		public void setWithdraw(boolean withdraw) {
			this.withdraw = withdraw;
		}


		public boolean isDeposit() {
			return deposit;
		}


		public void setDeposit(boolean deposit) {
			this.deposit = deposit;
		}


		public boolean isTransfer() {
			return transfer;
		}


		public void setTransfer(boolean transfer) {
			this.transfer = transfer;
		}


		
	}
}

class Tree
{
	Nest sparrowNest = new Nest();
	class Nest
	{
		
	}	
	
}

class River
{
	//Nest crocodileNest = new Nest();
}