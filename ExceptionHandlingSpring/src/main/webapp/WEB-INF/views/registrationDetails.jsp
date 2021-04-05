<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Details Form</title>
</head>
<body>
		<table border="1" align="center">
			<tr>
				<td>First Name:</td>
				<td>${user.fname}</td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td>${user.lname}</td>
			</tr>
			<tr>
				<td>Age:</td>
				<td>${user.age}</td>
			</tr>
		</table>
</body>
</html>