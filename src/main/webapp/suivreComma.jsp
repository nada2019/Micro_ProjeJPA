<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
    <%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
 <link href="/FinalVersion/src/main/webapp/css/style.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
<div class="styleform">
<table border="1">
<tr><th>Num<th>Date de commande
<c:forEach var="item" items="${list}">

<tr><th><c:out value="${item.getNum()}"/><th><c:out value="${item.getDatecom()}"/>

</c:forEach>
</table>
</div>
</body>
</html>