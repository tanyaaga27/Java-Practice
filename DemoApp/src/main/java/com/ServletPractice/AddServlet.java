package com.ServletPractice;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int sum = i+j;
		
		//Request Dispatcher Method
		/*req.setAttribute("sum", sum);
	    RequestDispatcher rd =req.getRequestDispatcher("sq");
		rd.forward(req, res);*/
		
		//sendRedirect URL Rewriting
		//1st Method : URL rewriting
		/*res.sendRedirect("sq?sum="+sum); */
		
		//2nd Mthod : Session
		//A browser maintains a session for the time you're there, for your entire visit
		//The data in session is maintained throughout unless you delete it
		/* HttpSession session = req.getSession();
		session.setAttribute("sum", sum);
		res.sendRedirect("sq?sum="+sum); */
		
		//Cookie ( Alternative of session)
		//When you send a req to the server, server send a response which will have a cookie.
		//When you send a request another servlet, you can send the same cookie
		Cookie cookie = new Cookie("sum",sum+"");
		res.addCookie(cookie);
		res.sendRedirect("sq");
		
		
		
	}

}
//doGet() and doPost() are HTTP requests handled by servlet classes.

//In doGet(), the parameters are appended to the URL and sent along with header information. 
//This does not happen in case of doPost(). 
//In doPost(), the parameters are sent separately. 
//Since most of the web servers support only a limited amount of information to be attached to the headers, the size of this header should not exceed 1024 bytes. 
//doPost() does not have this constraint. 
 

