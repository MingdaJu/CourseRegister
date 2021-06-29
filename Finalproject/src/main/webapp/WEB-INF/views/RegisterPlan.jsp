<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Playlist</title>
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
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<div class="aa">
	<h1>My Register List</h1><br/>
	
	<table border="2px" width="250px">		
		<tr>
		<td>Register List</td>
		<td>Handle</td>
		
		</tr>
		<c:forEach items="${sessionScope.userPlan}"  var="reg">
	
		<tr>
			
			<td>${reg.planname}</td>
			<td><a href="${contextPath}/user/viewPlan.htm?planid=${reg.planid}">View Detail</a></td>
			<!-- 
			<td><a href="${contextPath}/viewPlan/delete.htm?playlistiddelete=${reg.planid}">Delete</a></td>
			 -->
		</tr>
		</c:forEach>
	</table>
	<br><br>
	

</div>
</body>
</html>