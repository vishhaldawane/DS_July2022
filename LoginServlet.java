package com.ds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// 9820443464

//create a class called as UserDetail
// with username, password, age, address, email

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     //ArrayList<UserDetail> userlist = new Arraylist<UserDetail>();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        //UserDetail userdetailsObj1 = new UserDetail();
        
        //userlist.add(userdetailsObj1);
      //userlist.add(userdetailsObj2);
      //userlist.add(userdetailsObj3);
        
        
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String username = request.getParameter("uname"); // uname is the HTML field
		String password = request.getParameter("upass"); // uname is the HTML field
		
		if(username.equals("admin") && password.equals("123")) {
			pw.println("<h2> Welcome Admin </h2>");
		}
		else {
			pw.println("<h2> Welcome End User </h2>");
					
		}
		pw.println("<a href='http://10.0.3.145:8080/AirlineApp'> Back </a>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
