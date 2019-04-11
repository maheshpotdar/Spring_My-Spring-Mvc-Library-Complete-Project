<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	${success}
	<form:form action="/SpringLibrary/addbookAction" method="POST"
		modelAttribute="librarianHandle">
		<table>
			<tr>
				<td><label>callNo</label><form:input path="callNo" /> <form:errors path="callNo" /></td>
			</tr>
			<tr>
				<td><label>bookName</label><form:input path="bookName" /> <form:errors path="bookName" /></td>
			</tr>
			<tr>
				<td><label>author</label><form:input path="author" /> <form:errors path="author" /></td>
			</tr>
			<tr>
				<td><label>publisher</label><form:input path="publisher" /> <form:errors
						path="publisher" /></td>
			</tr>
			<tr>
				<td><label>qty</label><form:input path="qty" /> <form:errors path="qty" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Save Book"></td>
			</tr>
		</table>
	</form:form>


</body>
</html>