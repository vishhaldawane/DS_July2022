
public class FundTransferTest {
	public static void main(String[] args) {

		Current ca = new Current(101,"DS",50000,1.5f);
		ca.print();

		Savings sa = new Savings(102,"Sachin",2000,3.5f);
		sa.print();

		FundTransferService.transfer(ca, sa, 6000);

		ca.print();
		sa.print();
		
		
		Cricketer cricketer1 = new Cricketer();
		cricketer1.bat();
		
		Batting b = new Batsman();
		b.eat();
		b.act();
		b.proact();
		b.bat();
		b.hitSixer();
		b.hitFourRuns();
		
		
		Bowler bb = new Bowler();
		bb.bowl();
		bb.howIsThat();
		
	}
}

class FundTransferService {
	public static void transfer(Withdrawing c, Depositing s, float amtToTransact) {
		System.out.println("--- Fund Transfer -- initiated...");

		if(c.getBalance() > amtToTransact) {
			c.withdraw(amtToTransact);
			s.deposit(amtToTransact);
			System.out.println("---fund transferred --- success!!!!");
		}
		else {
			throw new RuntimeException("Insufficiet funds at source account....");
		}

		}
}

interface BalanceEnquiry
{
	float getBalance();
}

interface Withdrawing extends BalanceEnquiry {
	public void withdraw(float amt);
}

interface Depositing extends BalanceEnquiry {
	public void deposit(float amt);
}

abstract class Account {
	int accno;
	String acHolderName;
	float balance = 30000;

	public Account(int accno, String acHolderName, float balance) {
		super();
		this.accno = accno;
		this.acHolderName = acHolderName;
		this.balance = balance;
	}
	
	void print() {
		System.out.println("acno  : "+accno);
		System.out.println("acnm  : "+acHolderName);
		System.out.println("acbal : "+balance);
		
	}

}

class Savings extends Account implements Withdrawing, Depositing {

	float rate;

	public Savings(int accno, String acHolderName, float balance, float rate) {
		super(accno, acHolderName, balance);
		this.rate = rate;
	}

	public float getBalance() {
		return balance;
	}
	
	public void deposit(float amt) {
		System.out.println("Savings:Depositing...." + amt);
		balance = balance + amt;
	}

	public void withdraw(float amt) {
		System.out.println("Savings:Withdrawing...." + amt);
		balance = balance - amt;
	}

	void print() {
		super.print();
		System.out.println("Savings : Rate  : " + rate);
	}

}

class Current extends Account implements Withdrawing, Depositing
{
	float overdraft = 0.5f;

	public Current(int accno, String acHolderName, float balance, float overdraft) {
		super(accno, acHolderName, balance);
		this.overdraft = overdraft;
	}

	public float getBalance() {
		return balance;
	}
	public void withdraw(float amt) {
		System.out.println("Current:Withdrawing...." + amt);
		balance = balance - amt;
	}

	public void deposit(float amt) {
		System.out.println("Current:Depositing...." + amt);
		balance = balance + amt;
	}

	void print() {
		super.print();
		System.out.println("Current : Overdf : " + overdraft);
	}
}






//The height of your success
//cannnot exceed the height of your
//personal development 1-100 - 60 

//6 - 				1 2 3 4 5 6 




class A
{
	
}

class B 
{
	
}

// class  extends class
class C extends A
{
	
}

interface P { }
interface Q { }

interface R extends P,Q
{
	
}

class Z extends C implements R
{
	
}


abstract class Player extends Person
{
	abstract void play();
}

class Cricketer extends Player
{
	void playCricket() {
		System.out.println("Playing cricket....");
	}
	void play() {
		System.out.println("Enjoying cricket.....");
	}
}

interface Batting
{
	void bat();
	int hitSixer();
	int hitFourRuns();
}
interface Bowling
{
	void bowl();
}
interface WicketKeeping
{
	void keepWicket();
}

class Team
{
	
}
class CricketTeam extends Team
{
	Cricketer cricketer1 = new Cricketer();
	Cricketer cricketer2 = new Cricketer();
	Cricketer cricketer3 = new Cricketer();
	Cricketer cricketer4 = new Cricketer();
	Cricketer cricketer5 = new Cricketer();
	Cricketer cricketer6 = new Cricketer();
	Cricketer cricketer7 = new Cricketer();
	Cricketer cricketer8 = new Cricketer();
	Cricketer cricketer9 = new Cricketer();
	Cricketer cricketer10 = new Cricketer();
	Cricketer cricketer11 = new Cricketer();
	
	
}

class Stadium
{
	
}

class CricketStadium
{
	CricketTeam teamIndia = new CricketTeam();
	CricketTeam teamAus =  new CricketTeam();
	
}

class Bat
{
	
}

class Batsman extends Cricketer implements Batting
{
	Bat b = new Bat(); //hasA
	
	public void bat() {
		System.out.println("The batsman is batting....");
	}
	
	public int hitSixer() {
		System.out.println("hitting sixer....");
		return 6;
	}
	
	public int hitFourRuns() {
		System.out.println("hitting...four runs...");
		return 4;
	}
	
}

class WicketKeeper extends Cricketer implements WicketKeeping
{
	public void keepWicket() {
		System.out.println("Wicket keeper is keeping the wicket...");
	}
	public void stumpOut() {
		System.out.println("Stump out....");
	}
}
class Bowler extends Cricketer implements Bowling
{
	public void bowl() {
		System.out.println("Bowler is bowling...");
	}
	public void throwYorker() {
		System.out.println("throwing yorker....");
	}
	boolean howIsThat() {
		System.out.println("how is that??????");
		return true;
	}
}
interface Spinning
{
	void spin();
}

class Spinner extends Bowler implements Spinning
{
	public void spin() {
		System.out.println("Spinner is spinning....");
	}
}






