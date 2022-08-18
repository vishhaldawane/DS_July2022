
public class ServletsNotes {

	public ServletsNotes() {
		// TODO Auto-generated constructor stub
	}

}
/*
 					
 					who
 					|
 			----------------
 			|			|
 			where		when
 			|			|
 		---------------------
 		|		   |		|
 		why		  what      how
 					
 					

				Java Technology
						|
			-------------------------
			|			|			|
			JSE			JEE			JME
			|			|			|
		core java	enterprise		micro
		|				|
	desktop			---------------
					|			|
					WEB			"Enterprise" Java Beans
	
	
	class SavingsAccount <-- Java Bean [ class | component ]
	{
		float accBalance;
		
		void withdraw(float amt) {
			accBalance -= amt;
		}
	}
	
	
	
	Enterprise Application
	
	
	1 Remote capability
			Networking
			
			Proxy1	<--------------->	Proxy2
			| withdraw(){}				| withdraw() { }
			Machine1					Machine2
			|SERVER						| CLIENT
			Java Object					Object Ref2
			|SavingsAccount
			|   withdraw() {}
			|
			Object Ref1
			|
			SavingsAccount ref1 =
			new SavingsAccount();
			
			ref1.withdraw(5000);
			
	2 High Availability - HA - 24 X 7
			CLUSTERING
		
	3 Multithreading
				
	4 pooling of resources
	5 caching of resources
	
	6 transaction management
	7 security management
	
	
	
	
	1. Apache tomcat 9
	2. Browser
	3. Write a servlet
	
	
				Servlet  = simple java application / program
							to generate DYNAMIC web output
							
							
	
							Server Machine
							Apache  +  tomcat [ servlet container ] 
					response|			|
							|			ServletA is here - will run here - produce the WEB output
							|
							|
				------------------
				|
				|request
				Client
				|
				Browser - http://ipoftheserver:port/AirlineApp/findFlight
						  <-----------apache------>|<---tomcat---->
						  
				<a href='anypage'>click here<a>
				
				
	
	
					Java Programs
						|
			----------------------------
			|			|			|
		applications  applets		servlets
		|					|			|
		must have			no main method here
		main()				rather we have life cycle methods
										|
										init() { }
										service() { }
										destroy() { }
										
										
										
					JAVA BASED WEB APPLICATION STRUCTURE
								
										
									AirlineApp <---DEPLOYMENT STRUCTURE
									|
							---------------
							|
							WEB-INF
							|
					------------
					|
				classes
				|
			your servlet must be here
			
						
										
			DEVELOPER
				|
				Eclipse | Netbeans | VSCode | etc | ....
				
			DEPLOYER
				|
				Tomcat
		
	
	
					Servlet <-- javax.servlet 
					|
				----------
				|
		GenericServlet <-- javax.servlet
			|1
		-----------------------
		|					|
	YourServlet1		HttpServlet <-- javax.servlet.http
							|2
						YourServlet2
						
						
						




*/