<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Login here</title>
		<meta charset="ISO-8859-1">
	 <link rel="stylesheet" href="<c:url value="/resources/static/attivita.css" />">
	</head>
	<body>
	<h1>ACCEDI</h1>
	<div class="main">
		<form action= "redirect"  method="GET">
			<h3>Log in: </h3><br>
			<label>Email: <input  name="email" type="email" placeholder="user@domain.it"></label><br><br>
			<label>Password: <input name="passwd" type="password"></label><br>
			<br>
			<button type ="submit"><span> Accedi</span></button> <button type ="reset"><span>Cancella</span></button>
		</form>	
	</div>
	</body>

</html>