<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Form</title>
</head>
<body>
	<form:form method="POST" action="" commandName="user">
		<table>
			<tr>
				<td>Username:</td>
				<td><form:input path="username" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:input path="pwd" /></td>
			</tr>
			<tr>
				<td>MaritalStatus:</td>
				<td><form:checkbox path="maritalstatus" /></td>
			</tr>
			<tr>
				<td>Qualification:</td>
				<td><form:checkboxes path="qualification"
						items="${qualification}" /></td>
			</tr>

			<tr>
				<td>Gender:</td>
				<td>Male:<form:radiobutton path="gender" value="Male" />
					Female:<form:radiobutton path="gender" value="Female" />
				</td>
			</tr>
			<tr>
				<td>Location:</td>
				<td><form:radiobuttons path="location" items="${location}" /></td>
			</tr>

			<tr>
				<td>Skill-set:</td>
				<td><form:select path="skillset" multiple="true">
						<form:option value="Java" />
						<form:option value="Testing" />
						<form:option value="TestNG" />
						<form:option value="RestAssured" />
					</form:select></td>
			</tr>

			<tr>
				<td>Hobbies:</td>
				<td><form:select path="hobbies" items="${hobbies}"
						multiple="true" /></td>
			</tr>

			<tr>
				<td>Profession:</td>
				<td><form:select path="profession" items="${profession}"
						multiple="false" /></td>
			</tr>

			<tr>
				<td>Address:</td>
				<td><form:textarea path="address" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>