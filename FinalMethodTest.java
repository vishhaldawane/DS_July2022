
public class FinalMethodTest {
	public static void main(String[] args) {
		
		BathroomSinger bathSinger = new BathroomSinger();
		
		bathSinger.singInsideBathroom();
	}
}

//LOVE

class Singer
{
	void sing() {
		System.out.println("Singing....");
	}
}

class ClassicalSinger extends Singer
{
	final void sing() {
		System.out.println("Classical singer...in a much better way...");
	}
}

class BathroomSinger extends ClassicalSinger
{
	void singInsideBathroom() {
		super.sing();
		System.out.println("Bathroom singer...in a much worst way...");
	}
}


class Chess
{

	final void moveKnite() {
		System.out.println("L shape way 2.5 steps");
	}
}

class GraphicalChess extends Chess
{

	void moveKnite() {
		System.out.println("I shape way N steps");
	}
}





class Account
{
}

class Savings extends Account
{

}
final class Fixed extends Savings
{
	
}
class FlexiFixed extends Fixed
{
	
}