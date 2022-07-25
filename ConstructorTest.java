
public class ConstructorTest {

	public static void main(String[] args) {
		
		
		Flight flightObj1  = new Flight(101, "Lufthansa", "Mumbai","Germany");
		Flight flightObj2  = new Flight(102, "British Airways", "Mumbai","London");
		Flight flightObj3  = new Flight(103, "Air India", "Mumbai","New York");
		Flight flightObj4  = new Flight(104, "American Airlines", "Mumbai","Washington");
		Flight flightObj5  = new Flight(105, "Air France", "Mumbai","Paris");
		
		Flight flightObj6  = new Flight(106, "Air Lanka");
	
		Flight flightObj7  = new Flight();
		
		flightObj1.printFlight();
		flightObj2.printFlight();
		flightObj3.printFlight();
		flightObj4.printFlight();
		flightObj5.printFlight();

		flightObj6.printFlight();
		flightObj7.printFlight();
		
		
		flightObj1.fly();
		flightObj2.fly();
		flightObj3.fly();
		flightObj4.fly();
		flightObj5.fly();
		
		System.out.println("==============");
		
		Flight flightObj8 = new Flight(108, "Indigo", "Mumbai","Varanasi");
		flightObj8.printFlight();
		
		System.out.println("flightObj8 : "+flightObj8);
		
		flightObj8 = new Flight(118, "GoAir", "Bombay","GOA");
		flightObj8.printFlight();
		
		System.out.println("flightObj8 : "+flightObj8);
		
		
	}
}
//Object = state + behaviour
//       = data  + functionalities


//DEV=OPS

class Flight
{
	private int flightNumber;
	private String flightName;
	private String source;
	private String destination;
	

	Flight() {
		System.out.println("CONSTRUCTOR : Flight()...");
		
	}
	
	Flight(int a, String b, String c, String d) {
		System.out.println("CONSTRUCTOR : Flight(int,String,String,String)...");
		flightNumber=a;
		flightName=b;
		source=c;
		destination=d;
	}

	Flight(int a, String b) {
		System.out.println("CONSTRUCTOR : Flight(int,String)...");
		flightNumber=a;
		flightName=b;
	}

	
	void printFlight() {
		System.out.println("FLIGHT NUMBER : "+flightNumber);
		System.out.println("FLIGHT NAME   : "+flightName);
		System.out.println("SOURCE        : "+source);
		System.out.println("DESTIANTION   : "+destination);
		System.out.println("------------------------------");
	}
	void fly() {
		System.out.println(flightName+" is flying.....to "+destination);
	}
	void landing() {
		System.out.println(flightName+" is landing.....to "+destination);
	}
}
/*



		Stack							Heap
		
									FIELD
									
								flightNumber	flightName	source	destination
								-------------------------------------------------
								|	101		|Lufthansa		|Mumbai	|Germany	|
								--------------------------------------------------
			+------------------>100
			|					
			100	
		flightObj1						METHOD
										|
										Flight(int,String,String,String) { } <--- explicit parameterized ctor
										printFlight() { }
										fly() { }
										landing() { }

							flightNumber	flightName	source	destination
								-------------------------------------------------
								|	0		|null			|null	|null		|
								--------------------------------------------------
			+------------------>200
			|					
			200	
		flightObj2						
	
	
								flightNumber	flightName	source	destination
								-------------------------------------------------
								|	0		|null			|null	|null		|
								--------------------------------------------------
			+------------------>300
			|					
			300	
		flightObj3
	
	
								flightNumber	flightName	source	destination
								-------------------------------------------------
								|	0		|null			|null	|null		|
								--------------------------------------------------
			+------------------>400
			|					
			400	
		flightObj4						
	
	
								flightNumber	flightName	source	destination
								-------------------------------------------------
								|	0		|null			|null	|null		|
								--------------------------------------------------
			+------------------>500
			|					
			500	
		flightObj5						
	

		Flight flightObj8 = new Flight(108, "Indigo", "Mumbai","Varanasi");
		
		158						flightNumber	flightName	source	destination
								-------------------------------------------------
								|	108		|Indigo		|Mumbai	|Varanasi		|
								--------------------------------------------------
			+------------------>800
			|					
			800	
			
		flightObj8 = new Flight(118, "GoAir", "Bombay","GOA");
			
			
		flightObj8						
			|900
			|		168		flightNumber	flightName	source	destination
			|					-------------------------------------------------
			|					|	118		|GoAir		|Bombay	|GOA		|
			|					--------------------------------------------------
			+------------------>900
				
	
	
*/