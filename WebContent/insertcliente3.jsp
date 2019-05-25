<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inserir Cliente</title>
<style>
.label {font-weight:bold;}
</style>
</head>
<body>
<h1>Insere Cliente</h1>
<br/>
<form action="mvc">
	<input type="hidden" name="regra" value="RegraInsertCliente"/>
	
	<label for="nome">Nome :</label><input type="text" name="nome" /><br/>
	<label for="email">E-mail :</label><input type="text" name="email" /><br/>
	<label for="email">Endereço :</label><input type="text" name="endereco" /><br/>
	
	<input type="submit" value="Inserir"/>

</form>
</body>
</html>