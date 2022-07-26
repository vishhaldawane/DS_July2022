

public class PassingObjectAndReturningObjectTest {


	public static void main(String[] args) {
		
		Kite.showKiteCount();
		
		Kite kite1 = new Kite("Green",50,"Rishabh",true);
		Kite kite2 = new Kite("Red",60,"Satish",true);
		Kite kite3 = new Kite("Yellow",70,"Kuldeep",true);


		Kite.showKiteCount();

	
		X x1 = new X();
		X x2 = new X();

		
	}

}

class X
{
	A a = new A();
	B b = new B();
	C c = new C();
}

class A { }
class B { }
class C { }


class Kite
{
	String color;
	int length;
	String owner;
	boolean flyingStatus;
	
	private static int kiteCount; //SHARED DATA - declare it here - default is zero/0
	
	public static void showKiteCount() {
		System.out.println("Total kites in the sky : "+kiteCount);

	}
	
	public Kite(String color, int length, String owner, boolean flyingStatus) {
		super();
		System.out.println("Kite constructed...");
		this.color = color;
		this.length = length;
		this.owner = owner;
		this.flyingStatus = flyingStatus;
		kiteCount++; //increment is as per the new kite 
	}

	void printKite() {
		System.out.println("Kite Color  : "+color);
		System.out.println("Kite Length : "+length);
		System.out.println("Kite Owner  : "+owner);
		System.out.println("Kite Status : "+flyingStatus);	
		System.out.println("-------------------------------");
	}

	void kiteFight(Kite kiteRef) {
		System.out.println(color+" kite initiated kite fight with "+kiteRef.color+" color kite ");
	}
	
	void kiteFight(Kite kiteRef1, Kite kiteRef2) {
		System.out.println(color+" kite initiated kite fight with "+kiteRef1.color+" color kite and "+kiteRef2.color+" color Kite");
	}

}






