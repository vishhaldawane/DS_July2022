package com.ds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class CountryJDBC
 */
@WebServlet("/countryJDBC")
public class CountryJDBC extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public CountryJDBC() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String value = request.getParameter("submit");
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		if(value.equalsIgnoreCase("Add")) {
			pw.println("<h2>Add is requested..</h2>");
		}
		else if(value.equalsIgnoreCase("Edit")) {
			pw.println("<h2>Edit is requested...</h2>");
		}
		else if(value.equalsIgnoreCase("Delete")) {
			pw.println("<h2>Delete is requested...</h2>");
		}
		pw.println("<a href='http://localhost:8080/CountryManagementProject/findCountryFromDB'>Go Back</a>");
		
	}

}
