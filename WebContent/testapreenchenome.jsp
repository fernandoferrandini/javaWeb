<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teste Preenche Nome</title>
</head>
<body>
<c:if test="${empty param.nome}">
	<h3>Campo nome é obrigatório!</h3>
</c:if> 
<c:if test="${not empty param.nome}">
	<h3>Obrigado por inserir seu nome ${param.nome}</h3> 
</c:if>
</body>
</html>