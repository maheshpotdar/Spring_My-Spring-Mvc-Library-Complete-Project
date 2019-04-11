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
					<td>Name</td>
					<td>Author</td>
					<td>Publisher</td>
					<td>Qty</td>
					<td>Issued</td>
					<td>Delete</td>
				</tr>
			</thead>
			</tr>
			<c:forEach var="p1" items="${listofbooks}">
				<tr>
					<td class="info">${p1.callNo}</td>
					<td class="warning">${p1.bookName}</td>
					<td class="success">${p1.author}</td>
					<td class="info">${p1.publisher}</td>
					<td class="success">${p1.qty}</td>
					<td class="denger">${p1.issued}</td>
					<td><a href="deletebook/${p1.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>