
public class ThreadTest1 {
	public static void main(String[] args) {
		
		Bike b1 = new Bike();
		Car car = new Car();
		Train train = new Train();
		Aircraft airCraft = new Aircraft();
		
		b1.start();
		car.start();
		train.start();
		airCraft.start();
		
	}
}
class Bike extends Thread
{
	public void run() {
		for (int i = 1; i < 50; i++) {
			System.out.println("Bike is running..."+i);
		}
	}
}

class Car extends Thread
{
	public void run() {
		for (int i = 1; i < 150; i++) {
			System.out.println("\tCar is running..."+i);
		}
	}
}

class Train extends Thread
{
	public void run() {
		for (int i = 1; i < 550; i++) {
			System.out.println("\t\tTrain is running..."+i);
		}
	}
}

class Aircraft extends Thread
{
	public void run() {
		for (int i = 1; i < 1550; i++) {
			System.out.println("\t\t\tAircraft is flying..."+i);
		}
	}
}

