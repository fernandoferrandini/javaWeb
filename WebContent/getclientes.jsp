<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Clientes</title>
</head>
<body>
<%@ page import="dao.*, modelo.*, javadb.jdbc.*" %>
<ul>
	<%
		ClienteDAO dao = new ClienteDAO();
		for ( Cliente cliente : dao.lista()) {
	%>		
			<li><%=cliente.getNome()%>,<%=cliente.getEmail()%>,<%=cliente.getEndereco()%></li>
	<%
		}
	%>
</ul>

</body>
</html>