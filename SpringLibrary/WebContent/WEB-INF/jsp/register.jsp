<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>

	<center>
		<h3 style="color: red;">Register</h3>

		<div class="table table-bordered">
			<form:form action="registerAction" method="POST"
				modelAttribute="beanRegister">
				<table>
					<tr>
						<td><label>Name</label> <form:input path="name" />
							<h5 style="background-color: red;">
								<form:errors path="name" />
							</h5></td>
					</tr>
					<tr>
						<td><label>Email</label> <form:input path="email" />
							<h5 style="background-color: red;">
								<form:errors path="email" />
							</h5></td>
					</tr>
					<tr>
						<td><label>Mobile</label> <form:input path="mobile" />
							<h5 style="background-color: red;">
								<form:errors path="mobile" />
							</h5></td>
					</tr>
					<tr>
						<td><label>Password</label> <form:password path="password" />
							<h5 style="background-color: red;">
								<form:errors path="password" />
							</h5></td>
					</tr>
					<tr>
						<td><input type="submit" value="submit"><input
							type="reset" value="clear"></td>
					</tr>
				</table>
			</form:form>
		</div>
	</center>


</body>
</html>