<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="participant" class="com.example.servletjspdemo.domain.Participant" scope="session" />



<jsp:useBean id="storage" class="com.example.servletjspdemo.service.StorageService" scope="application" />

<% 
  storage.add(participant);
%>

<p>Following person has been added to storage: </p>
<p>First name: ${participant.firstName} </p>

<p>
  <a href="AllParticipant.jsp">All Participant</a>
</p>

</body>
</html>