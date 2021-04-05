<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Details Form</title>
</head>
<body>
		<table border="1" align="center">
			<tr>
				<td>Name:</td>
				<td>${user.name}</td>
			</tr>
			<tr>
				<td>E-Mail:</td>
				<td>${user.email}</td>
			</tr>
			<tr>
				<td>Password:</td>
				<td>${user.password}</td>
			</tr>
			<tr>
				<td>Mobile:</td>
				<td>${user.mobile}</td>
			</tr>
		</table>
</body>
</html>