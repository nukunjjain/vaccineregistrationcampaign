<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Health Worker List</title>
<link href="../webjars/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" />
<script src="../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
<div class="container">
		<h2>HealthWorker List</h2>
		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="row">HealthWorkerId</th>
					<th scope="row">HealthWorkerName</th>
					<th scope="row">HealthWorkerCity</th>
					<th scope="row">Age</th>
					<th scope="row">Sex</th>
					<th scope="row">Vaccine</th>
					<th scope="row">No. Of Doses</th>
					<th scope="row">Edit</th>
					<th scope="row">Delete</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${healthworker_list}" var="healthworker">
					<tr>
						<td>${healthworker.hid }</td>
						<td>${healthworker.workername }</td>
						<td>${healthworker.workercity }</td>
						<td>${healthworker.age }</td>
						<td>${healthworker.sex }</td>
						<td>${healthworker.vaccine }</td>
						<td>${healthworker.doses }</td>
						<td><spring:url
								value="/admin/healthworker/update/${healthworker.hid }" var="updateURL" />
							<a class="btn btn-primary" href="${updateURL }" role="button">Update</a>
						</td>
						<td><spring:url
								value="/admin/healthworker/delete/${healthworker.hid }" var="deleteURL" />
							<a class="btn btn-primary" href="${deleteURL }" role="button">Delete</a>
						</td>
						
					</tr>
						</c:forEach>
						</tbody>
						</table>
						</div>

</body>
</html>