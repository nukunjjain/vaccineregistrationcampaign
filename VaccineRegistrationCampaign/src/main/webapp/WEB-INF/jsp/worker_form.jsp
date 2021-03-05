<%@page import="com.orlando.vaccineregistrationcampaign.model.HealthWorker"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Worker Form</title>
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
		<spring:url value="/admin/healthworker/save" var="saveURL" />
		<h2>Employee</h2>
<form:form modelAttribute="workerform" method="post" action="${saveURL }" cssClass="form">
			<form:hidden path="hid" />
			<div class="form-group">
				<label for="workername">Worker Name</label>
				<form:input path="workername" cssClass="form-control" id="workername" />
			</div>
			<div class="has-error">
						<form:errors path="workername" class="help-inline"/>
					</div>
			<div class="form-group">
				<label for="workercity">Worker City</label>
				<form:input path="workercity" cssClass="form-control" id="workercity" />
			</div>
			<div class="has-error">
						<form:errors path="workercity" class="help-inline"/>
					</div>
			<div class="form-group">
				<label for="age">Age</label>
				<form:input path="age" cssClass="form-control" id="age" />
			</div>
			<div class="has-error">
						<form:errors path="age" class="help-inline"/>
					</div>
					
					<div class="form-group">
				<label for="sex">Sex</label>
				<form:radiobutton path="sex" value="M" />Male 
	    			<form:radiobutton path="sex" value="F" />Female
			</div>
			<div class="has-error">
						<form:errors path="sex" class="help-inline"/>
					</div>
					
					<div class="form-group">
				<label for="vaccine">Vaccine</label>
				<form:select path="vaccine" id="vaccine" class="form-control input-sm">
				        <form:option value="">Select Vaccine</form:option>
			    	    <form:options items="${vaccines}" />
				    </form:select>
			</div>
			<div class="has-error">
						<form:errors path="vaccine" class="help-inline"/>
					</div>
					
					<div class="form-group">
				<label for="doses">No. of Doses</label>
				<form:input path="doses" cssClass="form-control" id="doses" />
			</div>
			<div class="has-error">
						<form:errors path="doses" class="help-inline"/>
					</div>
			
			<button type="submit" class="btn btn-primary">Save</button>
			</form:form>
			</div>
</body>
</html>