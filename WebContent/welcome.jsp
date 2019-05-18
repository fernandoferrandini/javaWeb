<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<%--comentario JSP --%>
<!--comentario HTML -->
<% String mensagem = "Bem vindo ao JSP!"; %>
<% out.println(mensagem); %> <%-- variavel implicita  --%>
<h1>Seja bem bindo ao Java Server Pages</h1>
<%= mensagem %><br/><br/>
<!--  imprimimos utilizando expressoes JSP -->
<% System.out.println("Onde vai sair esta mensagem?"); %>
</body>
</html>