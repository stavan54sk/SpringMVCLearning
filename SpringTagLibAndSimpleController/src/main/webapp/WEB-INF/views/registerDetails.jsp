<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Userdetails Confirmation</title>
</head>
<body>
<table>
			<tr>
				<td>User Name</td>
				<td>${user.username}</td>
			</tr>
			<tr>
				<td>User Password</td>
				<td>${user.pwd}</td>
			</tr>
			<tr>
				<td>Married</td>
				<td>${user.maritalstatus}</td>
			</tr>
			<tr>
				<td>User Qualifications</td>
				<td><c:forEach var="qual" items="${user.qualification}">
						<c:out value="${qual}" />
						<br>
					</c:forEach></td>
			</tr>
			<tr>
				<td>User Gender</td>
				<td>${user.gender}</td>
			</tr>
			<tr>
				<td>User Location</td>
				<td>${user.location}</td>
			</tr>
			<tr>
				<td>User Skill Set</td>
				<td><c:forEach var="skill" items="${user.skillset}">
						<c:out value="${skill}" />
						<br>
					</c:forEach></td>
			</tr>
			<tr>
				<td>User Hobbies</td>
				<td><c:forEach var="hobbies" items="${user.hobbies}">
						<c:out value="${hobbies}" />
						<br>
					</c:forEach></td>
			</tr>
			<tr>
				<td>User Profession</td>
				<td>${user.profession}</td>
			</tr>
			<tr>
				<td>User Address</td>
				<td>${user.address}</td>
			</tr>
		</table>
</body>
</html>
