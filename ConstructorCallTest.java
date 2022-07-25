
public class ConstructorCallTest {
	public static void main(String[] args) {

		
		GrandFather gf = new GrandFather();
		gf.farming();
		
		System.out.println("----------");
		
		Father fa = new Father();
		fa.banking();
		fa.farming();
//		fa.netting();
		System.out.println("----------");
		Child ch = new Child();
		ch.banking();
		ch.farming();
		ch.netting();
		System.out.println("---------------");
	}
}


class GrandFather // extends Object
{
	GrandFather() {
		//super()
		System.out.println("GrandFather() ctor.....");
	}
	void farming() {
		System.out.println("GrandFather is farming...in an old way using the Bulls.");
	}
}
class Father extends GrandFather
{
	Father() {
		//super(); its a default line of every constructor, implicit/explicit
						// and it is the very FIRST line inside a ctor
		
		System.out.println("\tFather() ctor.....");
	}
	void banking() {
		System.out.println("Father is banking...by going into the Bank...");
	}
	void farming() { //OVERRIDING
		System.out.println("Father is farming using a Tractor....");
	}
}
class Child extends Father
{
	Child() {
		//super();
		System.out.println("\t\tChild() ctor.....");
	}
	void netting() {
		System.out.println("Child is netting....");
	}
	void farming() {
		System.out.println("Child is farming...via Modern way...Automated Tractor...of John Deere....");
	}
	void banking() {
		System.out.println("Child is banking...via internet.....");
	}
}
