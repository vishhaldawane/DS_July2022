
/*
 * Any.cpp
 * -------
 * 
 * class BankAccount {
 * 		private:
 * 			int acno;
 * 
 * 		public:
 * 		void withdraw() {
 * 			cout<<"\nacno : "<<acno;	
 * 		}
 * }
 * 
 * int main() 
 * {
 * 		BankAccount
 * }
 * 
 * 
 * 
 * 
 * 
 */


public class Bank { //just a test program

	public static void main(String[] args) {
	
		System.out.println("Banking started....");
		
		BankAccount baObj1  = new BankAccount();
		BankAccount baObj2  = new BankAccount();
		
	//	baObj1.setBankAccount(101, "Vedangi", 45000L);

	//	baObj1.accountHolderName="Janet";
		
	//	baObj1.accountNumber=369;
		
		baObj2.setBankAccount(102,"Shital",45300);


		baObj1.printBankAccount();
		baObj2.printBankAccount();

		System.out.println("Transfer initiated....");
		float transAmt = 6000;
		baObj1.withdraw(transAmt);
		baObj2.deposit(transAmt);
		System.out.println("Transferred....");
		
		baObj1.printBankAccount();
		baObj2.printBankAccount();

		
		int i1=10;
	    i1=20;
		
		Singer s1 = new Singer("Rafi");
		s1 = new Singer(200);
		
		
		
		Singer s3 = new Singer(3.5f);
		
		Singer s4 = new Singer(100000,2.5f,"Lata");
		
	}

}
/*
 * 		physical		mental		emotional		spiritual
 * 		|				|			|				|
 * 							
 * 
 * 
 */
class Singer
{
	void sing() { }
	void dance() { }
	void act() { }
	
	Singer(int i) { }
	Singer(float i) { }
	Singer(String i) { }
	Singer(int i, float j, String k) {
		
	}
}


class BankAccount //business entity - primary key
{
	 private int accountNumber; //PK
	 private String accountHolderName;
	 private double balance; //FIELD / global data / data member
	 
	void setBankAccount(int x, String y, double z)
	{
		System.out.println("setBankAccount(int,String,double)....");
		accountNumber = x;
		accountHolderName = y;
		
		if(z > 50000) {
			throw new RuntimeException("Please supply income proof...PAN");
		}
		else {
			balance = z;
		}
	}
	
	double calculateSimpleInterest(float rateOfInterest, int period) //3
	{
		double simpleInterest  = (balance*rateOfInterest*period)/100.0f;
		return simpleInterest;
	}
	
	void withdraw(double amountToWithdraw) //member method 2
	{
		System.out.println("withdrawing...."+amountToWithdraw);
		balance = balance - amountToWithdraw;
	}
	void deposit(double amountToDeposit) //member method 2
	{
		System.out.println("depositing...."+amountToDeposit);
		balance = balance + amountToDeposit;
	}
	double getBalance() { //4	
		return balance;
	}
	void printBankAccount() { //1
		System.out.println("ACNO   : "+accountNumber);
		System.out.println("ACNAME : "+accountHolderName);
		System.out.println("ACBAL  : "+balance);
		System.out.println("--------------");
	}
}
//ostream_withassign cout;
		
/*
 * class ostream_withassign
 * {
 * 		operator <<() {
 * 		
 * 		}
 * }
 * 
 * class PrintStream
 * {
 *    println()
 *    {
 *    }
 * }
 * class System
 * {
 * 			static PrintStream out;
 * }
 * 
 * class Tiger
 * {
 * 		roar() {
 * 		
 * 		}
 * }
 * 
 * class Jungle
 * {
 * 		static Tiger sherKhan = new Tiger();
 * 
 * }
 * 
 * Jungle.sherKhan.roar();
 * 
 */
		
	//	cout<<"ACNO   : "<<accountNumber;
		
/*

C++		BankAccount *baObj1  = new BankAccount();
C++		delete baObj1
		
		BankAccount baObj1  = new BankAccount();
		BankAccount baObj2  = new BankAccount();
		1			2			3		4
		|			|			|		|
		TYPE		ref		allocator	constructor
		

		STACK									HEAP (free store)

										FIELD AREA
										
									accountNumber  accountHolderName   balance
									--------------------------------------------
									|	0		| null				| 0.0	   |
									---------------------------------------------
	+------------------------------>100
	|									
	100									METHOD AREA
	baObj1
										withdraw() { }
										deposit() { }
										getBalance() {}
										printBankAccount() { }
										calcSI() { }
										
										
										
									accountNumber  accountHolderName   balance
									--------------------------------------------
									|	0		| null				| 0.0	   |
									---------------------------------------------
	+------------------------------>200
	|									
	200								
	baObj2
										
						
										
						baObj1.withdraw(5000); //developer line
							|
					BankAccount.withdraw(baObj1,5000); <--internal call		
							
						baObj2.withdraw(7000);
							|
					BankAccount.withdraw(baObj2,7000); <--internal call		
					
							
							
										
										
										
										
										
										
										
















*/