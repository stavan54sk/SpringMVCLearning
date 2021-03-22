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
<table border="1">
<tr>
<td>User Name</td>
 <td>${user.username}</td>
</tr>
<tr>
 <td>User Password</td>
 <td>${user.pwd}</td>
</tr>
<tr>
 <td>User Date Of Birth</td>
 <td>${user.dob}</td>
</tr>
<tr>
 <td>User Email Id</td>
 <td>${user.email}</td>
</tr>
<tr>
 <td>User Mobile No</td>
 <td>${user.mobile}</td>
</tr>
</table> 
</body>
</html>
