
public class OOPSConcepts {
	public static void main(String[] args) {
		
	}
}
/*

	OOPS Concepts

	Procedure Oriented Programming System

	pops = procedure <--- data

	a b c d e f g ...70
	
	fun1() { }	fun2() { }	fun3() {} fun4() { } fun5() { } ..500
	
===========================================================
	Object Oriented Programming System

	oops = data <---- procedure

class X {
	a b c 						
	
	fun1() { }	fun2() { }	
}
	

	class Y {
		d e f g 
		fun3() {} fun4() { } 
	}
	
	class Z {
		h i j
		fun5() { } ..500
		fun6() { }
	}
	
	VAKOG
	
	OOPS
	
	1. Abstraction
				it is the "WHAT IS?" part of an object
				
				WHAT IS? AN ATM
				
				HIDING THE COMPLEXITY OF AN OBJECT
				
				PROVIDING THE USAGE OF THE OBJECT VIA SIMPLE ACCESSIBLE FUNCTIONS
				
				
	2. Encapsulation
			    it is the "HOW IS IT?" part of an object
			    
			    CODING FOR THE COMPLEXITY OF AN OBJECT
			     
			     
			     Kid <-- Person
			     
			     
			     			What is your father?
			     
			     
    3. Poly-morphism
    
    		ability of a business entity to have multiple forms
    		
    		a. class extension
    		
    		class Doctor
    		{
    		}
    		
    		class Surgeon extends Doctor
    		{
    		
    		
    		}
    		
    		b. function overloading
    		
    		
    		c. *function overriding
    		
    		d. operator overloading
    		
    					Doctor
    						|
    				-------------------
    				|
    				Surgeon
    				|
    			-------------
    			|
    	HeartSurgeon
    	
    	
    	
    							BankAccount
    								|
    					----------------------
    					|				|
    			SavingsAccount		CurrentAccount
    			|
    	----------------
    	|
    FixedDepositAccount
    
    
    
    
    		LivingBeing
    		|
    		----------------------
    		|			|		|
    		Animal		Tree	Stone
    		|
    		--------------------------
    		|			|			|
    		Mammal		
    		|
    		Human
    		|
    	----------------
    	|			|
    	Female		Male
    	|			|
    -----------		---------
    |					|
    Daughter			Son
    |					|
  ---------		-----------------
  |							|
  Mother					Father
  |								|
 -------				-----------------
 |									|
 GrandMother				GrandFather
 
    	
    	
    	
    	selfish
    	
    	self based reality
    	
    	object based realities
    
    	
    	
    	
    	C R P
    	| | |
    	
    	
			WHO
			|
		--------------
		|			|
		WHERE		WHEN
		|Pune		|2022
	----------------------------
	|		|			|
    WHY 	WHAT 		HOW
    |		|			|
    reason information implementation
    
    
    
    
        class BankAccount
        {
        
        }
        
        BankAccount baObj1  = new BankAccount();
    
    	baObj1.BankAccount();
    
    
    
      	Constructor
    	|
WHAT 	it is a function/codeblock which has the same name
    	as of the enclosing class
    	
WHEN	is invoked ONCE, during the object creation process

WHY		is used to initialize the object

  	
    	
WHAT   	- constructor does not have return type
    	
WHAT   	- but it can take parameters
    	
WHAT   	- hence it can be overloaded
    	
    	
    	- you can have either the implicit or explicit ctor , but not
    	both at the same time
    	
    	
    	class B
    	{
    	}
    	
    	
    	class C {
    		C() { }
    	}
    	
    	
    	class D {
    		D(int i) {
    		}
    	}
    	
    	
    	
HOW    	class A
    	{
    			void fun() {
    			
    			}
    			void foo() {
    			
    			}
    			
 HOW   			A() {
    			}
    	}
    	
    	A a = new A();
    				
			     
			     
	4. Inheritance
			     
			     
			     
			     
		Derivation					vs		Implementation
			     
			     
			     
		
			     
		Passing object as a parameter to a method
		
		void fun(Person p)
		{
		
		}
			    and
			    
		Returning object as a return value from a method
		
			     
		Flight foo() {
		
				return flightObj;
		}
			     
			    

			     			Association
			     				|
			     ---------------------------------
			     |		|			|		|
			     isA	hasA		usesA	producesA
			     |       |			|				|
			Aggregation  |		Object as		Object as
			      Composition   Method Args		method return type
			     
		class Machine
		{
			data1 + functions1
		}
	
		class WashingMachine extends Machine <---- isA 
		{
			data2 + functions2
			WashingTub washTub = new WashingTub(); //hasA
		
		
			void wash() {
			}
			void rinse() {
			}
			void spin() {
			}
		}
		
		class WashingTub extends Tub <-- isA
		{
		
		}
			     
		
			     
			     class Any
			     {
			     		data
			     		+
			     		fun1 fun2 fun3
			     }
	
	
	
	
	
	
	
	
	
	
	
	==============================================================
			|		static		  |	final 		|	abstract
	==============================================================
			| shared across all   |	cannot be	| NA	
	field	| the objects of the  | changed/	|
			| class               | immutable	|
	--------------------------------------------------------------
			| is used to refer    |cannot be	| it is the partial
	method	| the other static    |overridden	| contract of a 
			| data/methods        |by the 		| class
			| members             |child		|
	--------------------------------------------------------------
			| NA                  |cannot be	| it contains the
	class	|                     |extended		| partial contract
			|                     |				| [ optional ]
	--------------------------------------------------------------
	
	
	
	
	SKY
	                   ^ ^
	    ^             l| |l
	    |			  c| |c
		|l   		  o@ @ o
		|c			---------
		|o		@	|		|
		|	--------|		| | | |
		@	|		|		| @ @ @
	--------|		|		|--------
1	|		|		|		|		|
@	|		|		|		|		|
|-------------------------------------------
0 kites	

	
	kiteCount					kiteColor	kiteOwner	kiteLength
	|							green		rishabh 	20
	0							red			kuldeep		30
								blue		satish		40
								
								
	
	
	
	
	
	class's data			vs				object's data
	|										|
	kiteCount								color owner length
	
*/










