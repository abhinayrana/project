<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flipcart Registration Form</title>
</head>
<body style=background-image:url("https://sageerpinsights.com/wp-content/uploads/2014/09/freezing-inventory.jpg");>
<h1><h1 align="center">Flipkart Register Form</h1>
<form action="RegistrationServlet" method="post">
			
			<h4 align="center">
			<table style="with: 100%">
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>UserName</td>
					<td><input type="text" name="username" /></td>
				</tr>
					<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>		
				</table>
			<div style="color:red">${emessage}</div>
			<input type="submit" value="Submit" /></form>
			
			<p class="forgot"><a href="login">Already a user?</a></p></h4>
			
			<% session.setAttribute("emessage", null); %>
</body>
</html>


















    