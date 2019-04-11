<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Librarian</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body class="body">
	<h1 style="text-align: center; color: navy;">Add Librarian</h1>
	<br>
	<a href="login" class="btn btn-info btn-lg"> <span
		class="glyphicon glyphicon-arrow-left" style="float: right;"></span>
		Home
	</a>
	<div class="container">
		<form:form action="addlibAction" method="POST"
			modelAttribute="beanRegister">
			<div class="container">
				<table class="table table-bordered" border="2px"
					style="border-color: blue;">
					<thead>
					</thead>
					<tbody>
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
							<td class="info"><form:password path="password" />
								<h6>
									<form:errors path="password" />
								</h6>
						</tr>
						<tr>
							<td colspan="2" style="text-align: center;" class="success"><input
								type="submit" value="submit" class="btn btn-success"></td>

						</tr>
					</tbody>
				</table>
			</div>

		</form:form>
	</div>

</body>
</html>