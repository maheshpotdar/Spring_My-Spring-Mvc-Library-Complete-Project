<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<form:form action="/SpringLibrary/updatelibs/${beanAdminHandle.id}"
			method="POST" modelAttribute="beanAdminHandle2">

			<table class="table table-bordered" border="2px"
				style="border-color: blue;">

				<tr>
					<th class="warning">Name</th>
					<td class="info"><form:input path="name" />
						<h6>
							<form:errors path="name" />
						</h6></td>
				</tr>
				<tr>
					<th class="warning">Email</th>
					<td class="info"><form:input path="email" />
						<h6>
							<form:errors path="email" />
						</h6></td>
				</tr>
				<tr>
					<th class="warning">Mobile</th>
					<td class="info"><form:input path="mobile" />
						<h6>
							<form:errors path="mobile" />
						</h6></td>
				</tr>
				<tr>
					<th class="warning">Password</th>
					<td class="info"><form:input path="password" />
						<h6>
							<form:errors path="password" />
						</h6>
					<td>
				</tr>
				<tr>
					<th class="warning">Approve</th>
					<td class="info"><form:checkbox path="aprv" />
					<td>
				</tr>


				<tr>
					<td><input type="submit" value="Edit Librarian"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>