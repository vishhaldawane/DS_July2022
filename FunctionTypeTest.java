// knowledge = apply = wisdom
public class FunctionTypeTest {
	public static void main(String[] args) {

		Calculator myCalci = new Calculator();
		
//		myCalci.findAverage1();
		
//		myCalci.findAverage2(45, 67);
		
//		float ans = myCalci.findAverage3(45, 78);
//		System.out.println("ans : "+ans);
		
		float ans1 = myCalci.findAverage4();
		System.out.println("ans1: "+ans1);
			
		
		/*myCalci.fun1();
		myCalci.fun2(10, 20.4f, 56.89);

		double output =  myCalci.fun3('A', 5,4);
		System.out.println("output "+output);
		
		double distanceBetweenTheEarthAndTheSun = myCalci.fun4();
		System.out.println("The distance between The Earth and The Sun : "+distanceBetweenTheEarthAndTheSun);
		*/
	}
}
// https://github.com/vishhaldawane/DS_July2022
// https://github.com/rdx16

//https://github.com/vedangi163
//https://github.com/mayankcp123


//https://github.com/SSatish2229


class Calculator {
	
	void findAverage1() {
		int x=10;		int y=21;
		float avg = (x+y) / 2.0f;
		System.out.println("average1 : "+avg);
	}
	void findAverage2(int x, int y) {
		float avg = (x+y) / 2.0f;
		System.out.println("average2 : "+avg);
	}

	float findAverage3(int x, int y) {
		System.out.println("average3 : ");
		return (x+y) / 2.0f;
	}
	
	float findAverage4() {
		System.out.println("average4 : ");
		return (23+45) / 2.0f;
	}

	void fun1()
	{
		System.out.println("fun1 is doing some activity");
		System.out.println("-------------");
	}
	void fun2(int x, float y, double z)
	{
		System.out.println("fun2 is doing some activity");
		System.out.println("x "+x +" y "+y +" z "+z);
		System.out.println("-------------");	
	}
	double fun3(char x, int y, float z)
	{
		System.out.println("fun3 is doing some activity");
		System.out.println("x "+x +" y "+y +" z "+z);
		System.out.println("-------------");
		return z+y+6;
	}	
	double fun4() {
		System.out.println("fun4 is doing some activity");
		System.out.println("Calculating the distance between The Earth and The Sun");
		System.out.println("-------------");
		return 186000.519 * 480;
	}
}
/*

functions are of FOUR types


	1. function without taking    arguments 
				without returning value

	2. function with    taking    arguments 
				without returning value

	
	3. function with    taking    arguments 
				with    returning value


	4. function without taking    arguments 
				with    returning value

*/


















