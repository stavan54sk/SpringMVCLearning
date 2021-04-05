<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
				<td><spring:message	code="name"/>:</td>
				<td><form:input type="text" path="name" /></td>
			</tr>
			<tr>
				<td><spring:message	code="email"/>:</td>
				<td><form:input type="text" path="email" /></td>
			</tr>
			<tr>
				<td><spring:message	code="password"/>:</td>
				<td><form:input type="text" path="password" /></td>
			</tr>
			<tr>
				<td><spring:message	code="mobile"/>:</td>
				<td><form:input type="text" path="mobile" /></td>
			</tr>
		</table>
		<p align="center">
			<input type="submit" value="Submit">
		</p>
	</form:form>
	<p align="center">
	<a href="/I18N/register?lang=en">ENGLISH|</a>
	<a href="/I18N/register?lang=it">|ITALIAN|</a>
	<a href="/I18N/register?lang=fr">|FRENCH</a>
	</p>
</body>
</html>