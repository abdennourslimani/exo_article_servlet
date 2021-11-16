<%@page import="java.util.List"%>
<%@page import="Model.Post"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
		
		<% List<Post> postList = (List<Post>) request.getAttribute("postsData"); %>
		    	<h1> liste des titres des articles :</h1>
		    
		<% for(int i = 0; i < postList.size(); i++){%>
			<p><strong>titre de article  <%=i+1%> :</strong>  <%=postList.get(i).getTitle()%></p>
			<a href="post-details?id=<%=postList.get(i).getUID()%>"> lire les details </a>
		<% }%>
		
	</body>
</html>