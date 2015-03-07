<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Konferencja</title>
</head>
<body>
<jsp:useBean id="storage" 		class="com.example.servletjspdemo.service.StorageService" 	scope="application" />
<jsp:useBean id="participant" 	class="com.example.servletjspdemo.domain.Participant" 		scope="session" />

<h1>Zgloszenie na konferencje</h1>

<form action="AddParticipant.jsp">

	Imie: <input type="text" name="firstName" /><br/>
	Nazwisko: <input type="text" name="lastName" /><br/>
	
	<input type="submit" value="Wyslij">

</form>

<p>
  <a href="AllParticipant.jsp">Show all persons</a>
</p>

</body>
</html>