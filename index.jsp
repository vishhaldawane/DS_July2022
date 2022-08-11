<%@ page import="java.sql.*"%>

<%

	String s=request.getParameter("val"); // http://ip:port/RestWeb/index.jsp?val1=100&val2=jack&val3=9000

	if(s==null || s.trim().equals(""))
	{
		out.print("Please enter id");
	}
	else
	{
		int id=Integer.parseInt(s);
		//out.print(id);
		try
		{
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
			System.out.println("Driver loaded...");
			
			//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mdb","root","root");
			Connection con=DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb","SA","");
			System.out.println("Connected...");
			
			PreparedStatement ps=con.prepareStatement("select * from emp12 where EMP_NO=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			System.out.println("Query fired..got the result.....");
			
			while(rs.next())
			{
				out.print(rs.getInt(1)+" "+rs.getString(2)+ " "+rs.getFloat(3));
			}
			System.out.println("ResultSet is sent....");
			
			con.close();
			System.out.println("Connection closed.......");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
%>