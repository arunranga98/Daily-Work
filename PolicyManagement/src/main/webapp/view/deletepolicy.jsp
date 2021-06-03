<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DELETE POLICY</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">
<style>
  body {
   background-image: url("${pageContext.request.contextPath}/resourses/all.jpg");
   background-repeat: no-repeat;
   background-size: cover;
  }
   .submit {
  background-color: black;
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
</style>
</head>
<body>
<h4><a id="home" href="/gohome">HOME</a></h4><br><br><br>
<h2>ENTER POLICY ID TO DELETE</h2>
<form action="/deletepolicy" method="post">
<label for="policyid">POLICY ID:</label>
<input type="text" id="policyid" name="policyid"/><br><br>
<h3>${msg}</h3>
<input type="submit" placeholder="submit" class="submit">
</form>


</body>
</html>