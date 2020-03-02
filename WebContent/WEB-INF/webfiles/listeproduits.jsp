<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	</head>
	
	<body>
		<form action="/3-ExempleProjetHibernate/list" method="post">
			<h1>LISTE DES PRODUITS</h1>
			
			<input type="submit" value="Afficher liste"> <br>
			
			<c:forEach items="${listeProduit}" var="produit">
				${produit.idProduit}
				${produit.nomproduit}
				${produit.description}
			</c:forEach>
		</form>
	</body>
</html>