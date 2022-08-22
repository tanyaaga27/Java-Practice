package com.ServletPractice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter pw = res.getWriter();
		pw.println("Hi");
		
		//ServletContext
		ServletContext ctx = getServletContext();
		String name = ctx.getInitParameter("name");
		pw.print(name);   
		
	}

}
