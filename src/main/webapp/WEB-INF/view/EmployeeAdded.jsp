<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
	<br>
	<h2>Employee Added Successfully!</h2>
	<br>
	
	<h3>Added Employee Details</h3>
	
<pre>
Employee no.    :	${info.eno}
Employee name   :	${info.name}
Employee salary :	${info.salary}
		
</pre>
	
	<br>
	<a href="index.jsp">Go to home</a>
	</center>
</body>
</html>