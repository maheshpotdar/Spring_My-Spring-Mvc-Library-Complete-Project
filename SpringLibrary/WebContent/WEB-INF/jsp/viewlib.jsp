<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Librarian</title>
</head>
<body>
	<div class="container">
		<table class="table table-bordered" border="2px"
			style="border-color: blue;">
			<thead>
				<tr>
					<td>ID</td>
					<td>Name</td>
					<td>Email</td>
					<td>Password</td>
					<td>Mobile</td>
					<td>Edit</td>
					<td>Delete</td>
				
				</tr>
			</thead>
			<c:forEach var="p1" items="${listoflibs}">
				<tr>
					<td class="info">${p1.id}</td>
					<td class="warning">${p1.name}</td>
					<td class="success">${p1.email}</td>
					<td class="info">${p1.password}</td>
					<td class="success">${p1.mobile}</td>
					<td class="warning"><a href="editlibs/${p1.id}">Edit</a></td>
					<td class="info"><a href="deletelib/${p1.id}">Delete</a></td>
					
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>