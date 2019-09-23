<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee Details</title>
<style>
td
{
padding-left:50px;
}

label
{
color:red;
}
</style>
</head>
<body>
        <h3>Update Employee Details</h3>
        <hr>
                				<!-- Using Spring Form -->
        
        <form:form action="UpdateController" modelAttribute="employee">
            <table>
            <tr>
                <td>Employee No.</td>
                <td><form:hidden path="eno" />${employee.eno}</td>
            </tr>
            <tr>
                <td>Enter Name</td>
                <td><form:input path="name"/></td>
                <td><label><i><form:errors path="name"/></i></label></td>
            </tr>
            <tr>
                <td>Enter Salary</td>
                <td><form:input path="salary"/></td>
 				<td><label><i><form:errors path="salary">*Please fill this field, Only digits allowed!</form:errors></i></label></td>
            </tr>
            <tr><td><br></td></tr>
            <tr>
            <td></td>
                <td><input type="submit" value="Update Employee"/></td>
   
            </tr>
            </table>
            
        </form:form>                       
        <hr>
        <a href="index.jsp">Go to Home</a>
    </body>
</html>