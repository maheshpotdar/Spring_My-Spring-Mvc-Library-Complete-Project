<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
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
					<td>CollNo</td>
					<td>Student ID</td>
					<td>Student Name</td>
					<td>Student Mobile</td>
					<td>Return Status</td>
				</tr>
			</thead>
			<c:forEach var="p1" items="${listofIssuedbooks}">
				<tr>
					<td class="info">${p1.callNo}</td>
					<td class="success">${p1.studid}</td>
					<td class="denger">${p1.studname}</td>
					<td class="success">${p1.studmobile}</td>
					<!--for convert 1 for status yes or 0 for no -->
					<c:set var="stat" value="${p1.status}" />
					<td class="warning"><c:out value="${stat eq 0 ? 'Yes' : 'No'}" /></td>
					<!-- ${p1.status} -->
				</tr>
			</c:forEach>
		</table>
</body>
</html>