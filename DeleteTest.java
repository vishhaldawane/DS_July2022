import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteTest {
	public static void main(String[] args) throws EmployeeAlreadyExistsException
	{
		
		//1. WE KNOW THE DRIVER - org.hsqldb.jdbc.JDBCDriver.class
		//2. REGISTER THIS DRIVER
		try {
			System.out.println("Registering driver...");    
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registered....");
			
			System.out.println("Trying to connect to the DB");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			
			System.out.println("Connected to the DB : "+conn);
			
			
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter employee number to delete  : ");
			int eno = scan1.nextInt();
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from employee where empno="+eno);
			
			if(rs.next()) {
				
				System.out.println("trying to make a Prepared statment");
				PreparedStatement pst = conn.prepareStatement("DELETE FROM EMPLOYEE WHERE EMPNO=?");
				System.out.println("Prepared Statement created : "+pst);
				pst.setInt(1, eno);
				
				System.out.println("Trying to execute the prepared statement....");
				int rows = pst.executeUpdate();
				
				System.out.println("Prepred Statement executed, deleted the records :..."+rows);
					
				
				pst.close();	conn.close();
				
			}
			else {
				EmployeeNotFoundException empNotFndEx = new EmployeeNotFoundException("Employee NOT found exception : "+eno);
				throw empNotFndEx;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		    
	}
}
/*


File handling
	- Object Serialization
	
		Object
			|
		----------
		|		|
		file	Database
		|			|
serialization		Persistence



1		Database software
		|MYSQL / HSQL 
		|
2		Database Driver - HSQLDB.JAR 
		|
3		Java Program
		to connect to the DB
		|
		interact with the db
		
		
	following diagram is NOT of inheritance
	
	
			   Driver.class <-- interface
				|  |
				|  HSQLDB.jar (1. KNOW YOUR DB DRIVER)
				|    ( org.hsqldb.jdbc.JDBCDriver.class)
				|			implementation of the interface
				|
				|
			DriverManager
				|    - load the driver (2. LOAD IT )
				|    - connect to the database (3. CONNECT TO THE DB)				
			Connection
				|
	--------------------------------
	|3. MAKE A STATEMENT
	Statement
	|4. RUN THE STATEMENT
	|5. ACQUIRE THE RESULT 
	|6. PROCESS THE RESULT
	|7. CLOSE THE RESULT, STATEMENT, CONNECTION
				
			


*/










