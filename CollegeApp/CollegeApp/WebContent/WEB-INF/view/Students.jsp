<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>User Store Application</title>
</head>
<body>
<a href="/RedirectWebApp/">Back</a>
		<h2 align="center">User Management Application</h2>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h3>List of Users</h3></caption>
            <tr>
              	<th>STUDENT ID</th>
                <th>Student Name</th>
                <th>Gender</th>
                <th>Branch</th>
                <th>Marks</th>
                 <th>Email</th>
                 <th>PAssword</th>
                 <th>Phone</th>
            	<th>Attendence</th>	
            </tr>
            <c:forEach var="user" items="${Students}">
                <tr>
                    <td><c:out value="${user.id}" /></td>
                    <td><c:out value="${user.studentName}" /></td>
                    <td><c:out value="${user.gender}" /></td>
                    <td><c:out value="${user.branch}" /></td>
                    <td><c:out value="${user.marks}" /></td>
                    <td><c:out value="${user.email}" /></td>
                    <td><c:out value="${user.password}" /></td>
                    <td><c:out value="${user.phone}" /></td>
                    <td><c:out value="${user.attend}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>	
</body>
</html>
