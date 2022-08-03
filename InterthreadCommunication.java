
public class InterthreadCommunication {
	public static void main(String[] args) {
		
		FoodItem food = new FoodItem("Pizza"); //eat(), serve()
		
		Eater e = new Eater(food); // invokes eat()
		Server s = new Server(food); // invokes serve()
		
		s.start(); //run() - serve() - sequence???
		e.start(); //run() - eat() -  sequence???
	}
}
interface Eating
{
	void eat();
}
interface Serving
{
	void serve();
}

class FoodItem implements Eating, Serving
{
	String name;
	boolean itemServed; // default false
	
	FoodItem(String item) {
		name = item;
	}
	
	//it is possible that multiple threads can invoke this method
	//so how do we allow only one thread to invoke this method???
	
	public synchronized void eat() { // Eater thread would be calling this
		if(itemServed==false) {
			System.out.println("eat() : Waiting for the food item to be served...");
			try {
				wait(); //waits till being notified / while this thread is awaiting, other thread would 
				//get a chance to run
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//the below line would execute if the wait() is over..
		System.out.println("eat() : Food is eaten..."+name);
	}
	
	
	public synchronized void serve() { // Server thread would be calling this
		if(itemServed==false) {
			System.out.println("serve() :  Food is being served....");
			itemServed=true;
			notify(); //wake up the waiting thread
		}
	}
}

class Eater extends Thread 
{	
	FoodItem foodRef;
	
	Eater(FoodItem fi) {
		foodRef = fi;
	}
	
	public void run() {
		foodRef.eat();
	}
}
class Server extends Thread
{
	FoodItem foodRef;
	
	Server(FoodItem fi) {
		foodRef = fi;
	}
	public void run() {
		foodRef.serve();
	}
}

/*

		  Object
		  | wait(), notify()
		  --------------------
		  |					|
		  |  Runnable		|
		  |  |				FoodItem
		  Thread
 	        |       
     	+-----------+  
	    |			|  
	 Eater		   Server


*/