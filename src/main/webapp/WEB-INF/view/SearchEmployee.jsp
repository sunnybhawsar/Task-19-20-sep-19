<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.wp.models.Employee" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Employees</title>
</head>
<body>
	<h3>Search Employee</h3>
	<hr>
		<form action="SearchController">
			Enter Employee no. <input type="text" name="eno"/>
			<input type="submit" value="Search"/>
		</form>
	<hr>
	<a href="index.jsp">Go to Home</a>
</body>
</html>