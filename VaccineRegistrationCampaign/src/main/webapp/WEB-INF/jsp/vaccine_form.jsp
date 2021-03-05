<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vaccine Form</title>
<link
	href="http://localhost:8080/webjars/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" />
<script
	src="http://localhost:8080/webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script>
	src="http://localhost:8080/webjars/jquery/3.0.0/js/jquery.min.js"></script>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/custom.css' />" rel="stylesheet"></link>
</head>
<body>
<div class="container">
		<spring:url value="/admin/vaccine/save" var="saveURL" />
		<h2>Vaccine</h2>
<form:form modelAttribute="vaccineform" method="post" action="${saveURL }" cssClass="form">
			<form:hidden path="vaccineId" />
			<div class="form-group">
				<label for="vaccinename">Vaccine Name</label>
				<form:input path="vaccinename" cssClass="form-control" id="vaccinename" />
			</div>
			<div class="has-error">
						<form:errors path="vaccinename" class="help-inline"/>
					</div>
					
					<div class="form-group">
				<label for="status">Do you want to notify Vendor?</label>
				<form:checkbox path="status" cssClass="form-control" id="status" value="false" />
			</div>
			<div class="has-error">
						<form:errors path="status" class="help-inline"/>
					</div>
					<button type="submit" class="btn btn-primary">Save</button>
			</form:form>
			</div>

</body>
</html>