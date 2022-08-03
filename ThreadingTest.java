
public class ThreadingTest {
	public static void main(String[] args) {
		//1. extend from java.lang.Thread class
		//2. override public void run()  method
		//3. create the object of your sub class
		//4. invoke the start() method of it, which would 
		// execute the run() method of it
		
		MyMessage m1 = new MyMessage("ping"); //3
		MyMessage m2 = new MyMessage("\tpong"); //3
		MyMessage m3 = new MyMessage("\t\tpang"); //3
		MyMessage m4 = new MyMessage("\t\t\tpung"); //3

		m1.start();
		m2.start();
		m3.start();
		m4.start();
		
		
	}
}

class MyMessage extends Thread //1
{
	String msg;
	
	MyMessage(String m) {
		msg = m;
	}
	
	public void run() { //2. overriridng is always optional
		for (int i = 1; i < 100; i++) {
			System.out.println(msg+ " "+i);
		}
	}
}

/*
 		Bank Cash Deposit Counter
  
A/c Book  
 101  Dinesh 55000
 102  Ramesh 60000
 103  Naresh 70000
 104  Rajesh 80000
 ..
 ..
  
  		Teller1				Teller2			Teller3
  		 |					|				|
 1 		getBalance			getBalance		getBalance
  		|					|				|
 2 		calcAmt				calcAmt			calcAmt
  		|					|				|
 3 		setBalance			setBalance		setBalance
  		|					|				|
 who?	Customer1 / 3mnts	Customer2		Customer3
 a/c	101					102				103
 cash?	5000				7000			8000
 deno?	100/-				500/-			2000/-
 time	10.30am 			10.30am			10.30am
 notes? 50					14				4
 

 		Customer5
 		
 		
 						Eatable [i] <- interface
 						|eat();
 				--------------------+
 				|				    |isA
 			FoodItem [c]			|	
 			| serve() {			   	|	Stone [c]
 			|   ...				   	|	|
 			|   eat();			   	|	|
 			| }					   	|	|isA
 			| eat() { }				|	|
 		-----------					Chalk [c]
 		|							|
 	  Pizza	[c]						eat() { } mandate
 		
 		
  						Runnable
  						| run();
  			--------------------+
  			|					|
  			Thread				|isA
  			| start() {			|
			|  ...				|		JFrame
 			|  run();			|		|
 			| }					|		| isA
 			| run() { }			|		|
 	--------------				BikeFrame
 	|							| run() {
 	MyMessage					|  ...
 	Bike						|
 	Train						|
 								| }
 								
 		Thread
 		  - Thread(Runnable r)
 		  - Thread(String s)
 		  - Thread()
 		  
 */ 
