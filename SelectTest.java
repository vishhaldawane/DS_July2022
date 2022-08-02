import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {
	public static void main(String[] args) {
		
		//1. WE KNOW THE DRIVER - org.hsqldb.jdbc.JDBCDriver.class
		//2. REGISTER THIS DRIVER
		try {
			System.out.println("Registering driver...");    
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registered....");
			
			System.out.println("Trying to connect to the DB");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			
			System.out.println("Connected to the DB : "+conn);
			
			System.out.println("trying to make a statment");
			Statement statement = conn.createStatement();
			System.out.println("Statement created : "+statement);
			
			System.out.println("Trying to execute the statement....");
			ResultSet rs = statement.executeQuery("SELECT * FROM EMPLOYEE");
			System.out.println("Statement executed, got the result....");
				
			while(rs.next()) {
				int empno = rs.getInt(1) ; // get the first column (int type) output
				String ename = rs.getString(2) ;
				int sal = rs.getInt(3);
				System.out.println("EMP NO   : "+empno);
				System.out.println("EMP NAME : "+ename);
				System.out.println("EMP SAL  : "+sal);
				System.out.println("------------------------");
			}
			rs.close();	statement.close();	conn.close();
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










