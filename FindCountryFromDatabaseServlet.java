package com.ds;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.TreeMap;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
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
			
			//empty list
			ArrayList<Country> countryList = new ArrayList();
			
			//fillup the empty list
			while(rs.next()) {
				Country theCountry = new Country();
				theCountry.setName(rs.getString(1));
				theCountry.setCapital (rs.getString(2));
				theCountry.setPrimeMinister ( rs.getString(3));
				theCountry.setPopulation( rs.getString(4));
				theCountry.setCurrency ( rs.getString(5));
				
				countryList.add(theCountry);
			}
			//store this populated list on the request object
			request.setAttribute("theCntLst", countryList);
			
			//now jump to the JSP page
			RequestDispatcher rd = request.getRequestDispatcher("ShowAllCountries.jsp");
			rd.forward(request, response);
			
			
			
			
			rs.close();
			st.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
