
public class PassingObjectAndReturningObjectTest {
	public static void main(String[] args) {
		
		Kite kiteObj1 = new Kite("Red",20,"Rishabh",true);
		Kite kiteObj2 = new Kite("Green",30,"Satish",true);
		Kite kiteObj3 = new Kite("Yellow",40,"Kuldeep",true);
		

		kiteObj1.kiteFight(kiteObj2, kiteObj3);
	}

}

class Kite
{
	String color;
	int length;
	String owner;
	boolean flyingStatus;
	
	public Kite(String color, int length, String owner, boolean flyingStatus) {
		super();
		this.color = color;
		this.length = length;
		this.owner = owner;
		this.flyingStatus = flyingStatus;
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






