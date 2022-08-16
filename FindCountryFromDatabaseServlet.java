package com.ds;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TreeMap;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class FindCountryServlet
 */
@WebServlet("/findCountryFromDB")
public class FindCountryFromDatabaseServlet extends GenericServlet {
	/*
	INSERT INTO MYCountries values ("India", "New Delhi", "Mr. Narendra Modi", "136.64 Crores", "Rs");
	INSERT INTO MYCountries values ("Pakistan", "Islamabad", "Mr. Imran Khan", "21.66 Crores", "Pakistani Rupee");
	INSERT INTO MYCountries values ("China", "Beijing", "Mr. Xi Jinping", "139.77 Crores", "Yuan");
	INSERT INTO MYCountries values ("England", "London", "Mr. Boriss Johnson", "6.66 Crores", "Pound Sterling");
	INSERT INTO MYCountries values ("America", "Washington DC", "Mr. Joe Biden", "32.82 Crores", "USD");
	*/
	
	Connection conn; //global ref

    public FindCountryFromDatabaseServlet() {
        super();
        System.out.println("FindCountryFromDatabaseServlet()");   	
        try {
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
			System.out.println("Database Driver loaded....");
			conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");
		    System.out.println("Connected to the DB : "+conn);	
			  
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
      
    }

	
	public void init(ServletConfig config) throws ServletException {
	     System.out.println("init");
	}


	public void destroy() {
	     System.out.println("destroy");
	}

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	    System.out.println("\t\tservice()");
	    response.setContentType("text/html");
	    String country =  request.getParameter("countryName"); //read this HTML tag's value
	    PrintWriter pw = response.getWriter();
	    try {
			Statement st = conn.createStatement();
			System.out.println("statement created.."+st);
			ResultSet rs = st.executeQuery("SELECT * FROM MYCOUNTRIES");
			System.out.println("Query fired...got the result...");
			
			pw.println("<form action='countryJDBC'>");
			pw.println("<TABLE border=5 cellspacing=5 cellpadding=5>");
			
			pw.println("<TH>Country</TH>");
			pw.println("<TH>Capital</TH>");
			pw.println("<TH>Prime Minister</TH>");
			pw.println("<TH>Population</TH>");
			pw.println("<TH>Currency</TH>");
			
			pw.println("<TR>");
			pw.println("<TD><input type=text name='countryName'></TD>");
			pw.println("<TD><input type=text name='capitalName'></TD>");
			pw.println("<TD><input type=text name='pmName'></TD>");
			pw.println("<TD><input type=text name='population'></TD>");
			pw.println("<TD><input type=text name='currency'></TD>");
			pw.println("<TD><input type=submit name=submit style='font-size:16px; text-align:center; padding: 15px 32px; color:white; background-color:blue' value='Add'></TD>");
			pw.println("</TR>");
			
			

			while(rs.next()) {
				pw.println("<TR>");
				
				String foundCountryName = rs.getString(1);
				String foundCapitalName = rs.getString(2);
				String foundPrimeMinister = rs.getString(3);
				
				String foundPopulation = rs.getString(4);
				String foundCurrency = rs.getString(5);
				
				
				pw.println("<TD style='font-size:20px; text-align:center; padding: 5px 10px; color:black; background-color:pink'>"+foundCountryName+"</TD>");
				pw.println("<TD style='font-size:20px; text-align:center; padding: 5px 10px; color:black; background-color:pink'>"+foundCapitalName+"</TD>");
				pw.println("<TD ><input style='font-size:20px; text-align:center; padding: 5px 10px; color:black; background-color:pink' type=text name='pmName' value='"+foundPrimeMinister+"'></TD>");
				pw.println("<TD style='font-size:20px; text-align:center; padding: 5px 10px; color:black; background-color:pink'>"+foundPopulation+"</TD>");
				pw.println("<TD style='font-size:20px; text-align:center; padding: 5px 10px; color:black; background-color:pink'>"+foundCurrency+"</TD>");
				
				pw.println("<TD><input type=submit name=submit style='font-size:16px; text-align:center; padding: 15px 32px; color:white; background-color:green' value='Edit'>   </TD>");
				pw.println("<TD><input type=submit name=submit style='font-size:16px; text-align:center; padding: 15px 32px; color:white; background-color:red' value='Delete'> </TD>");

				pw.println("</TR>");

			}
			pw.println("</TABLE>");
			pw.println("</form>");

			
			
			rs.close();
			st.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
