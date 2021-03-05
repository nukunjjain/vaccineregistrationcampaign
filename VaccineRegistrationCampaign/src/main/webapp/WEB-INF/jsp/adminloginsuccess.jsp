<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Admin Login Success</title>
	<link href="<c:url value='/static/css/custom.css' />" rel="stylesheet"></link>
</head>
<body>
	<div class="success">
		
		<br>
	welcome admin
	<a href="/admin/healthworker/add"><b>Add HealthWorker</b></a>
		<a href="/admin/healthworker/list"><b>List of HealthWorker</b></a>
	<a href="/admin/checkvaccines">Check Vaccines</a>
	</div>
	
</body>
</html>