<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link href="/FinalVersion/src/main/webapp/css/style.css" rel="stylesheet">
</head>
<body>
<h1 class="h1_style">Inscrivez-Vous</h1>
<hr>
<form action="Traitement" method="post" class="styleform">

<table>







<tr><th>Nom     : <th><input type="text" name="nom" ></input>
<tr><th>Prenom    : <th><input type="text" name="prenom" ></input>
<tr><th>Addresse    : <th><input type="text" name="add" ></input>
<tr><th>Email     : <th><input type="text" name="email" ></input>
<tr><th>Mot de passe:<th><input type="text" name="pass" ></input>

<tr><th><th><input  type="submit"  name="action" value="Inscrire"/>

</table>

</form>

</body>
</html>