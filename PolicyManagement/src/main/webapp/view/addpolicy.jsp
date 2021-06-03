<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>        
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADD POLICY</title>
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
<h3><a id="home" href="/gohome">HOME</a></h3><br><br><br>
<h1>ADD POLICY DETAILS</h1>
<form:form modelAttribute="addpolicy" action="/addpolicy" method="post">
<table class="tableclass">
<tr>
<td><form:label path="policyid"><b>POLICY ID:</b></form:label></td>
<td><form:input path="policyid" /></td>
<td><form:errors path="policyid"/></td>
</tr>
<tr>
<td><form:label path="policyname"><b>POLICY NAME:</b></form:label></td>
<td><form:select path="policyname" items="${policyname}"/></td>
<td><form:errors path="policyname"/></td>
</tr>
<tr>
<td><form:label path="policytype"><b>PAY PERIOD:</b></form:label></td>
<td><form:select path="policytype" items="${policytype}" /></td>
<td><form:errors path="policytype"/></td>
</tr>
<tr>
<td><form:label path="amount"><b>DUE(Rs.):</b></form:label></td>
<td><form:input path="amount" /></td>
<td><form:errors path="amount"/></td>
</tr>
<tr>
<td><form:label path="years"><b>TOTAL YEARS:</b></form:label></td>
<td><form:input path="years" /></td>
<td><form:errors path="years"/></td>
</tr>
<tr>
<td><form:label path="maturity"><b>MATURITY AMOUNT(Rs.):</b></form:label></td>
<td><form:input path="maturity" /></td>
<td><form:errors path="maturity"/></td>
</tr>
<tr>
<td><form:label path="nomination"><b>NOMINATION:</b></form:label></td>
<td><form:input path="nomination" /></td>
<td><form:errors path="nomination"/></td>
</tr>
<tr>
<td><form:label path="bankname"><b>BANKNAME:</b></form:label></td>
<td><form:input path="bankname" /></td>
<td><form:errors path="bankname"/></td>
</tr>
<tr>
<td><form:label path="accountno"><b>ACCOUNT NO:</b></form:label></td>
<td><form:input path="accountno" /></td>
<td><form:errors path="accountno"/></td>
</tr>
</table>
<h3>${msg}</h3>
<form:button type="submit" class="submit">SUBMIT</form:button>






</form:form>




</body>
</html>