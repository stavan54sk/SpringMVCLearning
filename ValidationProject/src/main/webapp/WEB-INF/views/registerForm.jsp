<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Form</title>
 <style type="text/css">
.error{
 color: red;
 font-family: consolas;
 font-style: italic;
 font-weight: bold;
 font-size: large;
}
</style> 
</head>
<body>
	<form:form method="POST" action="" commandName="user">
		<table border="1">
			<tr>
				<td>Username:</td>
				<td><form:input path="username" /></td>
				<td><form:errors path="username" cssClass="error" />
			</tr>
			<tr>
				<td>Password</td>
				<td><form:password path="pwd" /></td>
				<td><form:errors path="pwd" cssClass="error" />
			</tr>
			<tr>
				<td>Date Of Birth</td>
				<td><form:input path="dob" /></td>
				<td><form:errors path="dob" cssClass="error" />
			</tr>
			<tr>
				<td>EmailId</td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssClass="error" />
			</tr>
			<tr>
				<td>User Mobile No</td>
				<td><form:input path="mobile" /></td>
				<td><form:errors path="mobile" cssClass="error" />
			<tr>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>