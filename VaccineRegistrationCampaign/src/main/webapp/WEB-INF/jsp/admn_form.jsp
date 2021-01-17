<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login</title>
<link
	href="http://localhost:8080/webjars/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" />
<script
	src="http://localhost:8080/webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="http://localhost:8080/webjars/jquery/3.0.0/js/jquery.min.js"></script>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/custom.css' />" rel="stylesheet"></link>
</head>

<body>
<div class="container">
<spring:url value="/admin/sign" var="saveURL" />
<h1>AdminLogin</h1>

<form:form modelAttribute="adminform" action="${saveURL}" method="post" cssClass="form">

<div class="form-group">

<label for="adminname">User Name</label>
<form:input path="adminname" cssClass="form-control" id="adminname" />
</div>
<div class="has-error">
<form:errors path="adminname"/>
</div>

<div class="form-group">
				<label for="adminpassword">Password</label>
				<form:input path="adminpassword" cssClass="form-control" id="adminpassword" />
			</div>
			<div class="has-error">
			<form:errors path="adminpassword"/>
			</div>
			
<button type="submit" class="btn btn-primary">Sign In</button>
		</form:form>
		</div>

</body>
</html>