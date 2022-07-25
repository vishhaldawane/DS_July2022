
/*
class Employee
{
	
	void opeartor +() {
		
	}
}

Employee e1,e2,e3;

e1+ e2
*/
public class FunctionOverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tiger tigerObj = new Tiger();
		
		tigerObj.jump();
		tigerObj.jump(12);  //compile time binding - early binding - eager loading
		tigerObj.jump(4.6f);
		tigerObj.jump(12, 4);
		tigerObj.jump(12.5f, 4.5f);
		tigerObj.jump(12, 4.5f);
		tigerObj.jump(12.5f, 4);
		
		System.out.println(10+20+" the sum is "+(10+20) );
		
		/* 
		  
		   10 + 20  +  " the sum is " + 10  + 20
		  int | int 
		      30    +  " the sum is " + 10 + 20
		            |
		      int   |      String
		      
		  	String.valueOf(30) + "10" +  "20"
		  			|
		  			"30"
		  			|
		  	String.concat("30")
		  			|
		  	"30 the sum is 1020"
		  
		 */
	}

}
/*
  We can define functions with same name 
  but they should be differentiated on the following terms
  
  	a. type of parameter
    b. number of parameters
    c. sequence of type of parameters
    
 */
class Tiger
{
	void jump() {
		System.out.println("jump():  Tiger is jumping....");
	}
	
	void jump(int length) {
		System.out.println("jump(int) : Tiger is jumping....at "+length+" feet");
		
	}

	void jump(int length,int height) {
		System.out.println("jump(int,int) : Tiger is jumping....at "+length+" feet and "+height+" feet height");
		
	}

	void jump(float length) {
		System.out.println("jump(float) : Tiger is jumping....at "+length+" feet");
		
	}
	
	void jump(int length,float height) {
		System.out.println("jump(int,float) : Tiger is jumping....at "+length+" feet and "+height+" feet height");
		
	}
	
	void jump(float length,float height) {
		System.out.println("jump(float,float) : Tiger is jumping....at "+length+" feet and "+height+" feet height");
		
	}

	void jump(float length,int height) {
		System.out.println("jump(float,int) : Tiger is jumping....at "+length+" feet and "+height+" feet height");
		
	}

}
