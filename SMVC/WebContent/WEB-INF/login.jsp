<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FlipKart Login Form</title>
</head>
<body style=background-image:url("https://sageerpinsights.com/wp-content/uploads/2014/09/freezing-inventory.jpg");>

<h4 align="center"><div style="color:green">${message}</div></h4><h1><h1 align="center">Flipkart Login Form</h1>
<form action="ValidateServlet" method="post">
<div>
			
			<h4 align="center">
			<table style="with: 100%">
				
				<tr>
					<td>UserName</td>
					<td><input type="text" name="username" /></td>
				</tr>
					<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				</table>
				<div style="color:red" visible="false">${emessage}</div>
			<input type="submit" value="Login" /></form>
						
				</h4>
			<% session.setAttribute("message", null); %>
			<% session.setAttribute("emessage", null); %>
				
</body>
</html>