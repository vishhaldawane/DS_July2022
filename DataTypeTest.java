
public class DataTypeTest {
	public static void main(String[] args) {
		
		//-128   0   127
		
		byte b = 28;
		System.out.println("b is "+b);
		System.out.println("min value for a byte  : "+Byte.MIN_VALUE);
		System.out.println("max value for a byte  : "+Byte.MAX_VALUE);
		System.out.println("size of byte variable : "+Byte.SIZE+" bits");
		System.out.println("--------------");
		
		short s = 228;
		System.out.println("s is "+s);
		System.out.println("min value for a short  : "+Short.MIN_VALUE);
		System.out.println("max value for a short  : "+Short.MAX_VALUE);
		System.out.println("size of short variable : "+Short.SIZE+" bits");
		System.out.println("--------------");

		int i = 123228;
		System.out.println("i is "+i);
		System.out.println("min value for an integer  : "+Integer.MIN_VALUE);
		System.out.println("max value for an integer  : "+Integer.MAX_VALUE);
		System.out.println("size of int variable      : "+Integer.SIZE+" bits");
		System.out.println("--------------");

		long l = 13223228;
		System.out.println("l is "+l);
		System.out.println("min value for a long  : "+Long.MIN_VALUE);
		System.out.println("max value for an long : "+Long.MAX_VALUE);
		System.out.println("size of long variable : "+Long.SIZE+" bits");
		System.out.println("--------------");

	}
}


