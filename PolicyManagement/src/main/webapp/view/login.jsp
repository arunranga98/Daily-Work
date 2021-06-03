<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>INDEX</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">

<style>
  body {
   background-image: url("${pageContext.request.contextPath}/resourses/homepage.jpg");
   background-repeat: no-repeat;
   background-size: cover;
  }
  .register {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 12px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 14px;
  margin: 6px 4px;
  cursor: pointer;
  border-radius: 50%;
}
 h1{
  font-family: sofia;
  font-weight: bold;   
 }
</style>
 
</head>
<body>
	</body>	<h1><font color=black>POLICY MANAGEMENT SYSTEM</font></h1>
	<h2>LOGIN PAGE</h2>
	<form action="/loginsubmit" method="post">
		<table class="tableclass">
			<tr>
				<td><label for="mobileno">USER ID:</label></td>
				<td><input type="text" id="mobileno" name="mobileno" /></td>
			</tr>
			<tr>
				<td><label for="password">PASSWORD:</label></td>
				<td><input type="password" id="password" name="password" /></td>
			</tr>
		</table>
		<input type="submit" value="LOGIN">
	</form>
	<br>
	<h4>${hint}</h4>
	<h3>${msg}</h3>
	<br><br><br><br/><br><br><br><br><br>
	<a href="/register"><button class="register"><b>REGISTER</b></button></a><br>
<h4>
	<font color=#ff0000>IF YOU ARE NEW USER KINDLY REGISTER...!</font>
</h4>

</body>
</html>