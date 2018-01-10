<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
<h3 align="right"><a href="/CollegeApp">Back</a></h3>
	<h2 align="center">${headerMessage}</h2>
	<h3 align="center">You have registered with following Info::::</h3>
	<table align="center" border="5px">
	
			<tr>
			<td>Student email:</td>
			<td>${student.id}</td>
		</tr>
	
			
			<tr>
			<td>Student email:</td>
			<td>${student.email}</td>
		</tr>
	
		<tr>
			<td>Student Name:</td>
			<td>${student.studentName}</td>
		</tr>
		
		<tr>
			<td>Student Phone:</td>
			<td>${student.phone}</td>
		</tr>

		<tr>
			<td>Student Gender</td>
			<td>${student.gender}</td>
		</tr>

		<tr>
			<td>Selected Branch:</td>
			<td>${student.branch}</td>
		</tr>

		<tr>
			<td>Marks</td>
			<td>${student.marks}</td>
		</tr>


		<tr>
			<td>Attendence</td>
			<td>${student.attend}</td>
		</tr>



	</table>
</body>
</html>