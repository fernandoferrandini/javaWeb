<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TESTE JSTL 2</title>
</head>
<body>
	<a href="insertcliente3.jsp">Inserir novo cliente</a>
	<br/>
	<br/>
	<table>
		<c:forEach var="cliente" items="${clientes}">
			<tr>
				<td>${cliente.nome}</td>
				<c:if test="${not empty cliente.email}">
					<td><a href="mailto:${cliente.email}">${cliente.email}</a></td>	
				</c:if>
				<c:if test="${empty cliente.email}">
					<td>Email não informado</td>	
				</c:if>
				
				<td>${cliente.endereco}</td>
				<td><a href="mvc?regra=RegraDeleteClientes&id=${cliente.id}">Deletar</a></td>
				
				<td>${cliente.endereco}</td>
				<td><a href="#">Atualizar</a></td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>