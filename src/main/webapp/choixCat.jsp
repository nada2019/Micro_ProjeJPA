<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
    <%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link href="/FinalVersion/src/main/webapp/css/style.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>

 <form action="Articles" method="post">
       
<p style="color:white;">  Choisir le genre
   <select id="op" name="op"></p>
<option>Choisir le genre</option>
<c:forEach var="item" items="${list}">
<option  name="${item.getCat()}"  value="${item.getCat()}"><c:out value="${item.getCat()}"/></option>
</c:forEach>
</select>
        
  <input type="submit"  name="action" value="valider"/>      
  </form>

<c:set var="i" value="valider" />
<c:if test="${action==i}">
<div class="styleform">
<table border="1">
<tr><th>CodeArtice<th>designation<th>Prix<th>Categorie<th>Stock
<c:forEach var="item2" items="${list2}">

<tr><th><c:out value="${item2.getCodeArt()}"/>
	<th><c:out value="${item2.getDesig()}"/>
    <th><c:out value="${item2.getPrix()}"/>
    <th><c:out value="${item2.getStock()}"/>
</c:forEach>
</table>
</div>
</c:if>
  
</body>
</html>