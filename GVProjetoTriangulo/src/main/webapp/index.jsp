<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Triangulo</title>
</head>
<body>
	<h1>Verificacao de  Triangulo e áreas</h1>
	<form name="Calculadora" method="post" action="ServletTriangulo">
		valor A: <input type="text" name="val1"> <p>
		valor B: <input type="text" name="val2"> <p>
		valor C: <input type="text" name="val3"> <p>
		<input type="reset" value="limpar">
		<input type="submit" name="btnVerificar" value="Verificar"> <p>
		
	</form>
</body>
</html>