package com.SampleProjs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

@WebServlet("/showusers")
public class ShowUsers extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
	{
		PrintWriter out = response.getWriter();
		//out.println("<html><body><h2>LIST OF ALL STUDENTS</h2></body></html>");
		 Iterable<Entity> e = User.listOfUsers();
		 for(Entity e1 : e)
		 {
			 System.out.println(e1);
			 String fname = e1.getProperty("FirstName").toString();
			 String lname = e1.getProperty("LastName").toString();
			 String rollnum = e1.getProperty("RollNo").toString();
			 String phy = e1.getProperty("Physics").toString();
			 String chem = e1.getProperty("Chemistry").toString();
			 String maths = e1.getProperty("Maths").toString();
			 out.println("\nName:"+fname+" "+lname+"\n"+"Roll No.:"+rollnum+"\n"+"Physics:"+phy+"\n"+"Chemistry:"+chem+"\n"+"Maths:"+maths+"\n");
		 }
		 
		 
	}
	
	

}
