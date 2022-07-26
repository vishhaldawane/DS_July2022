/*
 * Abstract Class = instance cannot be created
 * 
 * but a ref to it can be created
 * 
 * 
 * 
 */
public class AbstractTest {
	public static void main(String[] args) {
		
			GeometricalShape gs ;
			
			Circle2 c  = new Circle2();
		
			Rectangle rect = new Rectangle();
			
			Hexagon hex = new Hexagon();
			
			c.draw();
			rect.draw();
			hex.draw();
		
	}
}
//abstract = incomplete = partial
//Vishhal
abstract class GeometricalShape // 
{
	abstract void draw(); //no-body - partial - incomplete 
	abstract void calcArea();
	abstract void calcPerimeter();
}

//Shital
class Hexagon extends GeometricalShape
{
	void draw() {
		System.out.println("Drawing a hexagon..");
	}

	@Override
	void calcArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void calcPerimeter() {
		// TODO Auto-generated method stub
		
	}
}

class Circle2 extends GeometricalShape
{
	void draw() {
		System.out.println("Drawing a Circle...");
	}

	@Override
	void calcArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void calcPerimeter() {
		// TODO Auto-generated method stub
		
	}
}
class Square extends GeometricalShape
{
	int side;

	

	@Override
	void calcArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void calcPerimeter() {
		// TODO Auto-generated method stub
		
	}
	
	void draw() {
		System.out.println("Drawing a sqaure....");
	}
}

class Rectangle extends Square //isA
{
	int side2;
	/*
	void draw() {
		System.out.println("Drawing...a Rectangle...");
	}*/
}



	class Doctor
	{
		void diagnose() { //1. exclusive
		
		}
		void prescribe() { //1. exclusive
			
		}
	}

	class Surgeon extends Doctor
	{
		// now it is 2. inherited here 
		
		void doSurgery() //1. exclusive
		{
			
		}
		void diagnose() { //2. overriding
			
		}
		//3. inherited - prescribe()
	}
	class HeartSurgeon extends Surgeon
	{
		void doHeartSurgery() { 
			
		}
	}

	
	
	/*
	 * 1. exclusive
	 * 2. inherited
	 * 3. overidding
	 * 4. implemented - abstract classes/interfaces
	 */
	
	
abstract class MusicalInstrument
{
	abstract void play();
}

abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings();
}

class Guitar extends StringBasedMusicalInstrument
{
	void tuneStrings() {
		
	}
	void play() {
		
	}
}
class ElectronicGuitar extends Guitar
{
	
}
	
	
	
	
	












