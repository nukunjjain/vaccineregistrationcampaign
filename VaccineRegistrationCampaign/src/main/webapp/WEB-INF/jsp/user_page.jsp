<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User First Page</title>
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
		<spring:url value="/user/save" var="saveURL" />
		<h2>Employee</h2>
<form:form modelAttribute="userpage" method="post" action="${saveURL }" cssClass="form">
			<form:hidden path="cid" />
			<div class="form-group">
				<label for="cname">Name</label>
				<form:input path="cname" cssClass="form-control" id="cname" />
			</div>
			<div class="has-error">
						<form:errors path="cname" class="help-inline"/>
					</div>
					
					<div class="form-group">
				<label for="age">Age</label>
				<form:input path="age" cssClass="form-control" id="age" />
			</div>
			<div class="has-error">
						<form:errors path="age" class="help-inline"/>
					</div>
					
				<div class="form-group">
				<label for="city">City</label>
				<form:select path="city" id="city" class="form-control input-sm">
				        <form:option value="">Select City</form:option>
			    	    <form:options items="${cities}" />
				    </form:select>	
				    </div>
				    
				    <div class="form-group">
				<label for="mobileno">Mobile Number</label>
				<form:input path="mobileno" cssClass="form-control" id="mobileno" />
			</div>
			<div class="has-error">
						<form:errors path="mobileno" class="help-inline"/>
					</div>
					
					<div class="form-group">
				<label for="vaccine">Vaccine</label>
				<form:select path="vaccine" id="vaccine" class="form-control input-sm">
				        <form:option value="">Select Vaccine</form:option>
			    	    <form:options items="${vaccines}" />
				    </form:select>	
				    </div>
				    
				    	<button type="submit" class="btn btn-primary">Save</button>
					
					</form:form>
			</div>
				    

</body>
</html>