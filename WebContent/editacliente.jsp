<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edita Cliente</title>
</head>
<body>
<h1>Edita Cliente</h1>
<br/>
<form action="mvc">
	<input type="hidden" name="regra" value="RegraAtualizaCliente"/>
	<input type="hidden" name="id" value="${cliente.id}"/>
 	
	<label for="nome">Nome :</label><input type="text" name="nome" value="${cliente.nome}"/><br/>
	<label for="email">E-mail :</label><input type="text" name="email" value="${cliente.email}"/><br/>
	<label for="email">Endereço :</label><input type="text" name="endereco"  value="${cliente.endereco}"/><br/>
	
	<input type="submit" value="Atualizar"/>

</form>
</body>
</html>