<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vaccine List</title>
<link href="../webjars/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" />
<script src="../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>

<div class="container">
		<h2>Vaccines List</h2>
		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="row">VaccineId</th>
					<th scope="row">VaccineName</th>
					<th scope="row">Vaccine Doses</th>
					<th scope="row">Edit</th>
					
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${vaccine_list}" var="vaccine">
					<tr>
						<td>${vaccine.vaccineId }</td>
						<td>${vaccine.vaccinename }</td>
						<td>${vaccine.vaccinedoses }</td>
						<td><spring:url
								value="/admin/update/${vaccine.vaccineId }" var="updateURL" />
							<a class="btn btn-primary" href="${updateURL }" role="button">Update</a>
						</td>
						
					</tr>
						</c:forEach>
						</tbody>
						</table>
						</div>


</body>
</html>