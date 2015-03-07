package com.example.servletjspdemo.domain;

public class Participant 
{
	private String firstName;
	private String lastName;
	private String email;
	private String email1;
	private String employer;
	private String info;
	private String text;
	
	public static Participant [] list = new Participant[5];
	
	  
	public static int counter = 0;
	
	public Participant() 
	{
		Participant.list[counter] = this;
		Participant.counter++;
	}
	
	
		
	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getEmail1() 
	{
		return email1;
	}

	public void setEmail1(String email1) 
	{
		this.email1 = email1;
	}

	public String getEmployer() 
	{
		return employer;
	}

	public void setEmployer(String employer) 
	{
		this.employer = employer;
	}

	public String getInfo() 
	{
		return info;
	}

	public void setInfo(String info) 
	{
		this.info = info;
	}

	public String getText() 
	{
		return text;
	}

	public void setText(String text) 
	{
		this.text = text;
	}
}