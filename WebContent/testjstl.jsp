<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TESTE JSTL</title>
</head>
<body>
	<jsp:useBean id="dao" class="dao.ClienteDAO"></jsp:useBean>
	<table>
		<c:forEach var="cliente" items="${dao.clientes}">
			<tr>
				<td>${cliente.nome}</td>
				<c:if test="${not empty cliente.email}">
					<td><a href="mailto:${cliente.email}">${cliente.email}</a></td>	
				</c:if>
				<c:if test="${empty cliente.email}">
					<td>Email não informado</td>	
				</c:if>
				
				<td>${cliente.endereco}</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>