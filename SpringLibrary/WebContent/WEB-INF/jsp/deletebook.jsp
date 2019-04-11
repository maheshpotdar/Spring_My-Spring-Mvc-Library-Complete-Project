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
	<form:form method="POST" action="/SpringLibrary/deletebookAction"
		modelAttribute="beanLibrarian">
		<table border="2px">
			<tr>
				<td><form:input path="id" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Delete Librarian"></td>
			</tr>
		</table>
	</form:form>

</body>
</html>