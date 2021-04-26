<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link href="/FinalVersion/src/main/webapp/css/style.css" rel="stylesheet">
</head>
<body>
<h1 class="h1_style">Bonjour   <%=(String)session.getAttribute("valnom")%></h1>
<hr>

   <%@ include file = "/menu.html" %> 
</body>
</html>