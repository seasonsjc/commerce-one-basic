<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

	<% 
		String message = (String) request.getAttribute("message");
	
		
	%>
	
	<%= message %>
	<form action="AuthService" method="post">
		
		<input type="text" name="username">		
		<input type="text" name="password">
		<button>Go</button>		
		
	</form>

</body>
</html>