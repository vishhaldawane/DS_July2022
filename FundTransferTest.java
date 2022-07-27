
public class FundTransferTest {
	public static void main(String[] args) {
		
		Current ca  = new Current();
		ca.print();
		
		Savings sa  = new Savings();
		sa.print();
		
		FundTransferService.transfer(ca, sa, 100000);
		
		ca.print();
		sa.print();
		
		
	}
}

class FundTransferService
{
	public static void transfer(Current c, Depositing s, float amtToTransact)
	{
		System.out.println("--- Fund Transfer -- initiated...");
		c.
		s.deposit(amtToTransact);
		
		System.out.println("---fund transferred --- success!!!!");
	}
}
interface Withdrawing
{
	public void withdraw(float amt);
}

interface Depositing
{
	public void deposit(float amt);
}

class Savings implements Withdrawing, Depositing
{
	float balance=30000;
	
	public void deposit(float amt) {
		System.out.println("Savings:Depositing...."+amt);
		balance  = balance +amt;
	}
	public void withdraw(float amt) {
		System.out.println("Savings:Withdrawing...."+amt);
		balance  = balance -amt;
	}
	void print() {
		System.out.println("Savings : Balance : "+balance);
	}

}

class Current implements Withdrawing, Depositing
{
	float balance=5000000;
	
	public void withdraw(float amt) {
		System.out.println("Current:Withdrawing...."+amt);
		balance  = balance -amt;
	}
	
	public void deposit(float amt) {
		System.out.println("Current:Depositing...."+amt);
		balance  = balance +amt;
	}

	void print() {
		System.out.println("Current : Balance : "+balance);
	}
}
