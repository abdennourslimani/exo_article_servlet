<%@page import="Model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

					<h1> Information utilisateur </h1>
					<p> UID :${UID}</p>
					<p> User name :${name}</p>
					<p> nombre article :${nbPost}</p>
					<p>email : ${email}</p>
					<p>role: ${isAdmin}</p>
					 

</body>
</html>