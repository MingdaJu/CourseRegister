<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manage Student</title>
<script src="https://code.jquery.com/jquery-1.11.1.min.js"
	integrity="sha256-VAvG3sHdS5LqTT+5A/aeq/bZGa/Uj04xKxY8KM/w9EE="
	crossorigin="anonymous"></script>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<link
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css"
	rel="stylesheet">

<style>
.aa {
	float: left;
	margin-left: 80px;
	margin-top: 30px;
}
</style>
</head>

<body>
	<div class="aa">
		<c:set var="contextPath" value="${pageContext.request.contextPath}" />
		<h1>Manage Student Account</h1><br/>
		<table border=2px width=450px>
			<tr>
				<th>UserName</th>
				<th>PassWord</th>
				<th>Handle</th>
			</tr>
			<c:forEach items="${sessionScope.userlist}" var="user">
				<tr>
					<td>${user.username}</td>
					<td>${user.password}</td>
					<td><a href="${contextPath}/admin/deleteUser.htm?deleteUser=${user.userid}">Delete</a>
					</td>

				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>