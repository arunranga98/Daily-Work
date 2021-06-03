<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTER</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">
<style>
  body {
   background-image: url("${pageContext.request.contextPath}/resourses/all.jpg");
   background-repeat: no-repeat;
   background-size: cover;
  }
   .submit {
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

</style>
</head>

<body>
<h1><font color=black>USER REGISTRATION PAGE</font></h1>

<form:form modelAttribute="registersubmit" action="/registersubmit" method="post">
<table class="tableclass">
<tr>
<td><form:label path="name"><b>NAME:</b></form:label></td>
<td><form:input path="name" /></td>
<td><form:errors path="name"/></td>
</tr>
<tr>
<td><form:label path="mobileno"><b>MOBILE NO:</b></form:label></td>
<td><form:input path="mobileno" /></td>
<td><form:errors path="mobileno"/></td>
</tr>
<tr>
<td><form:label path="password"><b>PASSWORD:</b></form:label></td>
<td><form:password path="password"/></td>
<td><form:errors path="password"/></td>
</tr>
<tr>
<td><form:label path="emailid"><b>EMAIL ID:</b></form:label></td>
<td><form:password path="emailid"/></td>
<td><form:errors path="emailid"/></td>
</tr>
<tr>
<td><form:label path="passhint"><b>PASSWORD HINT:</b></form:label></td>
<td><form:password path="passhint"/></td>
<td><form:errors path="passhint"/></td>
</tr>
</table>
<form:button type="submit" class="submit"><b>SUBMIT</b></form:button>
</form:form>
<h3 style="font-color:red">${msg}</h3>
<h4><font color=red><i>YOUR MOBILE NO WILL BE YOUR USER ID</i></font></h4>

</body>
</html>