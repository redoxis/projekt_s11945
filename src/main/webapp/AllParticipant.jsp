<%@page import="com.example.servletjspdemo.domain.Participant"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="storage" class="com.example.servletjspdemo.service.StorageService" scope="application" />
<%
  for (Participant participant : storage.getAllParticipants()) {
	  out.println("<p>First name: " + participant.getFirstName() + ";Last Name: " + participant.getLastName() + ";Email: " + participant.getEmail() + ";Employer: " + participant.getEmployer() + ";Info: " + participant.getInfo() + ";Text:" + participant.getText() + "</p>");
  }
%>

<p>
  <a href="Forms.jsp">Add participant</a>
</p>
</body>
</html>