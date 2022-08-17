/* This program is reading a pdf file and putting on the browser.
 * For this purpose, program is taking servlet context of the current servlet
 * Getting resourceStream from the servlet context and 
 * reading data from the resource and directing it to output steam of servlet response.
 */
package com.ds;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readPdf")
public class ReadPDF extends HttpServlet
{	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException
    {	
		resp.setContentType("application/pdf");	// Setting content type.
    				
    	ServletContext context = getServletContext();     
		InputStream is = context.getResourceAsStream("/WEB-INF/data/Chapter 8 Handling Cookies.pdf");
		//1024 + 1024 + 1024 + 540
		OutputStream os = resp.getOutputStream();
		        
		int countByte = 0;
		byte bytesBuff[] = new byte[1024];
		        
		while((countByte = is.read(bytesBuff))!= -1)
		{
			os.write(bytesBuff, 0, countByte);
		}
		        
       os.flush();//real time flushing the data at once to the customer machine
       os.close();
    }
}

