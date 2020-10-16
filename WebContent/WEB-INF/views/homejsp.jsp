<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="it.project.entity.Utente" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test JSP Bean</title>
</head>
<body>

<jsp:useBean id="userBean" class="it.project.entity.Utente" scope="session"/>
<jsp:setProperty property="nome" name="userBean" param="param_nome"/>
<jsp:setProperty property="cognome" name="userBean" param="param_cognome"/>

<%

%>

<h1>CIAO <%= (userBean.getNome() != null) ? userBean.getNome() : "" %> <%= (userBean.getCognome() != null) ? userBean.getCognome() : "" %></h1>

</body>
</html>ml>