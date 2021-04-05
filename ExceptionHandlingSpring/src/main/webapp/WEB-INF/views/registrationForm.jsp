<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
	<form:form action="register" method="POST" commandName="user">
		<table border="1" align="center">
			<tr>
				<td>First Name:</td>
				<td><form:input type="text" path="fname"/></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><form:input type="text" path="lname"/></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><form:input type="text" path="age"/></td>
			</tr>
		</table>
		<p align="center">
			<input type="submit" value="Submit">
		</p>
	</form:form>
</body>
</html>