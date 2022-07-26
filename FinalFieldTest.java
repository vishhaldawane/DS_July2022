
public class FinalFieldTest {
	public static void main(String[] args) {

		//lets see a final local data
		
		final double PI=3.14;
		
		System.out.println("PI : "+PI);
		
		//PI=3.17;
		
		Circle c1 = new Circle(45);
		Circle c2 = new Circle(415);
		Circle c3 = new Circle(435);

		c1.findArea();
		c2.findArea();
		c3.findArea();

		
		System.out.println("PI : "+PI);
		
	}
}

class Circle
{
	final static double PI=3.14;
	double radius;
	
	Circle(double r) {
		radius = r;
	}
	
	void findArea() {
		double area = PI * radius * radius;
		System.out.println("AREA : "+area);
	}
}


