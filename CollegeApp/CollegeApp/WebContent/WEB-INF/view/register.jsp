<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	<h3 align="center">${headerMessage}</h3>
	<form:form action="/CollegeApp/registerSuccess"
		method="post" modelAttribute="student">
		<table align="center">
		<caption align="top">Student registration form</caption>
			<tr>
				<td>Enter ID:</td>
				<td><form:input path="id" /></td>
				<td><form:errors path="id" cssClass="error"/></td>
			
			<tr>
				<td>Enter Email:</td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Enter Password:</td>
				<td><form:password path="password"/></td>
				<td><form:errors path="password" cssClass="error"/></td>
			</tr>

			<tr>
				<td>Enter your Name:</td>
				<td><form:input path="studentName"/></td>
				<td><form:errors path="studentName" cssClass="error"/></td>
			</tr>

			<tr>
				<td>Enter Phone No:</td>
				<td><form:input path="phone"/></td>
				<td><form:errors path="phone" cssClass="error"/></td>

			</tr>

			<tr>
				<td>Gender:</td>
				<td><form:radiobutton path="gender" value="Male" label="Male" />
					<form:radiobutton path="gender" value="Female" label="Female" /></td>
				<td><form:errors path="gender" cssClass="error" /></td>

			</tr>

			<tr>
				<td>Select Branch:</td>
				<td><form:select path="branch">
						<form:options items="${technologyList}" />
					</form:select></td>
				<td><form:errors path="branch" cssClass="error" /></td>

			</tr>


<tr>
				<td>Enter Marks:</td>
				<td><form:input path="marks"/></td>
				<td><form:errors path="marks" cssClass="error"/></td>

			</tr>


<tr>
				<td>Enter Attendence:</td>
				<td><form:input path="attend"/></td>
				<td><form:errors path="attend" cssClass="error"/></td>

			</tr>


			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>

	</form:form>

</body>
</html>