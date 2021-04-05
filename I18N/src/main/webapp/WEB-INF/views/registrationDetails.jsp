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
				<td><spring:message	code="name"/>::</td>
				<td>${user.name}</td>
			</tr>
			<tr>
				<td><spring:message	code="email"/>::</td>
				<td>${user.email}</td>
			</tr>
			<tr>
				<td><spring:message	code="password"/>::</td>
				<td>${user.password}</td>
			</tr>
			<tr>
				<td><spring:message	code="mobile"/>::</td>
				<td>${user.mobile}</td>
			</tr>
		</table>
</body>
</html>