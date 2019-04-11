<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<title>Return Book</title>
</head>
<body>
	<h1 style="text-align: center; color: navy;">Return Book</h1>
	<br>
	<a href="login" class="btn btn-info btn-lg"> <span
		class="glyphicon glyphicon-arrow-left" style="float: right;"></span>
		Home
	</a>
	<div class="container">
		<form:form action="/SpringLibrary/booksreturnAction" method="POST"
			modelAttribute="beanLibrarian">
			<div class="container">
				<table class="table table-bordered" border="2px"
					style="border-color: blue;">
					<thead>
					</thead>
					<tbody>
						<tr>
							<th class="warning">callNo:</th>
							<td class="info"><form:input path="callNo" />
								<h6>
									<form:errors path="callNo" />
								</h6></td>
						</tr>
						<tr>
							<th class="warning">Student ID:</th>
							<td class="info"><form:input path="studid" />
								<h6>
									<form:errors path="studid" />
								</h6></td>
						</tr>
						<tr>
							<td colspan="2" style="text-align: center;" class="success"><input
								type="submit" value="Return Book" class="btn btn-success"></td>

						</tr>
					</tbody>
				</table>
			</div>

		</form:form>
	</div>

</body>
</html>