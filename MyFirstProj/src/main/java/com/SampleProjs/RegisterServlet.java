package com.SampleProjs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		RequestDispatcher dispatcher;
		boolean flag;
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String rollnum = req.getParameter("rollnum");
		String phy = req.getParameter("phy");
		String chem = req.getParameter("chem");
		String maths = req.getParameter("math");
		
		flag = User.createOrUpdateUser(fname,lname,rollnum,phy,chem,maths);
		
		if(flag)
		{
			dispatcher = req.getRequestDispatcher("/display.jsp");
			dispatcher.forward(req, res);
		}
	}
	

}
