package com.example.servletjspdemo.domain;

public class Participant 
{
	private String firstName;
	private String lastName;
	private String email;
	private String emailAuthenticate;
	private String superior;
	private String info;
	private String text;
	
	public static Participant [] list = new Participant[5];
	
	  
	public static int participant = 0;
	
	public Participant() 
	{
		Participant.list[participant] = this;
		Participant.participant++;
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

	public String getEmailAuthenticate() 
	{
		return emailAuthenticate;
	}

	public void setEmail1(String emailAuthenticate) 
	{
		this.emailAuthenticate = emailAuthenticate;
	}

	public String getSuperior() 
	{
		return superior;
	}

	public void setSuperior(String superior) 
	{
		this.superior = superior;
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