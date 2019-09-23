<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.wp.models.Employee" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All Employees</title>
</head>
<body>
	
	<% List<Employee> employees =(List<Employee>) request.getAttribute("employeeList");	%>
	
	<center>
	<h1>List of all Employees</h1>
	</center>
	<br>
	
	<%
	int i=0;
	for(Employee employee : employees)
	{
	%>	
		<pre>
		#<%=++i %>
		
		Employee No. : <%=employee.getEno()%>
		
		Employee Name : <%=employee.getName()%>
		
		Employee Salary : <%=employee.getSalary()%>
		
		<a href="updateEmployeeDetails?eno=<%= employee.getEno() %>">Edit Details</a>  <a href="DeleteController2?eno=<%= employee.getEno() %>">Remove</a>
		
		<hr>
		
		</pre>
		
	<%	
	}	
	%>
	
	<center>
	<br>
	<a href="index.jsp">Go to home</a>
	</center>
</body>
</html>