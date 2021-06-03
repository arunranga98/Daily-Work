<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOME</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">
<style>
  body {
   background-image: url("${pageContext.request.contextPath}/resourses/all.jpg");
   background-repeat: no-repeat;
   background-size: cover;
  }
  h1{
   text-transform: capitalize;
   font-family: sofia;
  }
</style>
</head>
<body>
	<h4>
		<a id="home" href="/logout"><font color=red>LOGOUT</font></a>
	</h4>
	<br>
	<br>
	<br>
	<h1>${username}</h1>
	<h2>HOME PAGE</h2>
	<br>
	<br>

	<a href="/addpolicy"><button><b>ADD POLICY</b></button></a>
	<a href="/showpolicy"><button><b>SHOW POLICY</b></button></a>
	<a href="/editpolicy"><button><b>EDIT POLICY</b></button></a>
	<a href="/deletepolicy"><button><b>DELETE POLICY</b></button></a>
	<br>
	<br>
	<h3>${msg}</h3>

</body>
</html>