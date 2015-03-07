package com.example.servletjspdemo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.servletjspdemo.domain.Participant;

@WebServlet("/Form")
public class Form extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		HttpSession session = request.getSession();
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		//session.setAttribute("firstName", firstName);
		session.setAttribute("lastName", lastName);
		
		int limit = 5;
				
		boolean comparison;
		
		comparison = (firstName == session.getAttribute("firstName"));
		
		
		if(firstName!=null && !firstName.equals("") && lastName!=null && !lastName.equals(""))
		{
			//!= session.getAttribute("firstName") && lastName != session.getAttribute("lastName")
			
			
			//lastName.equalsIgnoreCase("lastName");
			
			
					
			if(comparison == true)
			{
				  RequestDispatcher rd = getServletContext().getRequestDispatcher("/Formularz.jsp");
				  PrintWriter out= response.getWriter();
				  out.println("<h2><font color=red>Zajestrowales sie juz!!!!</font></h2>");
				  rd.include(request, response);
			}
			else if(comparison == false)
			{
				if(Participant.counter < limit)
				{
				 	Participant p = new Participant();
					p.setFirstName(firstName);
					
					
						
					response.sendRedirect("Sukces.jsp");
					
				}
				else
				{
					response.sendRedirect("Limit.jsp");
				}
				
			}
			
			
			
		}	
		else
		{
	         RequestDispatcher rd = getServletContext().getRequestDispatcher("/Formularz.jsp");
	         response.getWriter().println("<h2><font color=red>Podaj imie, nazwisko i email!!!!</font></h2>");
	         rd.include(request, response);	              
	    }
			
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
}