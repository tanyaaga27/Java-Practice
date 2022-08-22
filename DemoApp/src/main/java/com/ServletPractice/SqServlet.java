package com.ServletPractice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SqServlet extends HttpServlet {
	
	private static final boolean Cookie = false;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		//Getting Data from Request Dispatcher method
		/*int sum = (int)req.getAttribute("sum");
		sum = sum*sum;
		PrintWriter pw = res.getWriter();
		pw.println("Result after adding and squaring="+sum);*/
		
		//Getting data from sendDirect method
		/*int sum = Integer.parseInt(req.getParameter("sum"));
		sum = sum*sum;
		PrintWriter pw = res.getWriter();
		pw.println("Result after adding and squaring="+sum);*/
		
		//Getting data from session
		/*HttpSession session = req.getSession();
		int sum = (int)session.getAttribute("sum");
		sum = sum*sum;
		PrintWriter pw = res.getWriter();
		pw.println("Result after adding and squaring="+sum);*/
		
		//Getting Data from Cookie
		int sum=0;
		Cookie[] cookies = req.getCookies();
		for(Cookie c : cookies)
		{
			if(c.getName().equals("sum"))
				sum=Integer.parseInt(c.getValue());
		}
		sum = sum*sum;
		PrintWriter pw = res.getWriter();
		pw.println("Result after adding and squaring="+sum);
		
		//ServletContext
		//It is shared by all the servlets.
		pw = res.getWriter();
		pw.println("Hi");
		
		ServletContext ctx = getServletContext();
		String name = ctx.getInitParameter("name");
		pw.println(name); 
		
		//ServletConfig
		//It is different for different servlets
		ServletConfig con = getServletConfig();
		String name2 = con.getInitParameter("name");
		pw.println(name2s);
		
		
		
		/*int sum=0;
	    Cookie[] cookies = req.getCookies();
	    for(Cookie c : cookies)
	    {
	    	if(c.getName().equals("sum"))
	    		sum = Integer.parseInt(c.getValue());
	    }
		
		
		//HttpSession session = req.getSession();
		
		//session.removeAttribute("sum");
		//int sum = (int)session.getAttribute("sum");
		//int sum = Integer.parseInt(req.getParameter("sum"));
		sum = sum*sum;
		PrintWriter pw = res.getWriter();
		pw.println("Result after adding and squaring="+sum);
		
		System.out.print("We reached sq");*/
	}

}
