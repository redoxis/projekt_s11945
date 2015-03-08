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
		
		
			public Form()
			{
				super();
			}
	  
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
			{
			
				String firstName = request.getParameter("firstName");
				String lastName = request.getParameter("lastName");
				String email = request.getParameter("email");
				String emailAuthenticate = request.getParameter("emailAuthenticate");
				String superior = request.getParameter("superior");
				String info = request.getParameter("info");
				String text = request.getParameter("text");
								
				int limit = 5;
						
				HttpSession session = request.getSession();
				
				if(email!=null && emailAuthenticate!=null && email.equals(emailAuthenticate))
					
				{

					if(session.getAttribute("lastName") != null && session.getAttribute("lastName").equals(lastName) && session.getAttribute("email") != null && session.getAttribute("email").equals(email))
						
					{
						
						  PrintWriter out= response.getWriter();
						  out.println("<h2><font color=red>Zajestrowales sie juz!!!!</font></h2>");
					}
			
					else if(firstName!=null && !firstName.equals("") && lastName!=null && !lastName.equals(""))
						
					{
						session.setAttribute("firstName", firstName);
						session.setAttribute("lastName", lastName);
						session.setAttribute("email", email);
							
							if(Participant.participant < limit)
								
							{
								 	Participant p = new Participant();
									p.setFirstName(firstName);
									p.setLastName(lastName);
									p.setEmail(email);
									p.setEmail1(emailAuthenticate);
									p.setSuperior(superior);
									p.setInfo(info);
									p.setText(text);
								
									response.sendRedirect("Sukces.jsp");
							}
							
							else
								
							{
									response.sendRedirect("Limit.jsp");
							}
							
					}
					
					else
						
					{
						    RequestDispatcher rd = getServletContext().getRequestDispatcher("/Formularz.jsp");
						    response.getWriter().println("<h2><font color=red>Podaj imie, nazwisko i email!!!!</font></h2>");
						    rd.include(request, response);	              
					}
					
				}
				
				else
					
				{
					RequestDispatcher rd = getServletContext().getRequestDispatcher("/Formularz.jsp");
				    response.getWriter().println("<h2><font color=red>Adres email nie zgadzaja sie</font></h2>");
				    rd.include(request, response);
				}
				
			}
	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
			{
				
			}
	}