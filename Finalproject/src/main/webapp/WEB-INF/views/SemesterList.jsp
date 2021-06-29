<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manage Course Catalog</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
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
<div class = "aa">
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<h1>Manage Course Catalog</h1>

<h3><a href="${contextPath}/mingda/addsuccess.htm">Add New Semester</a></h3>
<h2> Semester List</h2>

	<table  border=3px width=550px >	
		<tr>
		
		<td>Semester Name</td>
		<td>Course Detail</td>
		<td>Handle Courses</td>
		
		</tr>	
		<c:forEach items="${sessionScope.semli}"  var="sem">
	
		<tr >
			
			<td>${sem.semestername}</td>
			<td><a href="${contextPath}/mingda/view.htm?semid=${sem.semesterid}">Go To Detail</a></td>
			<td><a href="${contextPath}/mingda/delete.htm?semid=${sem.semesterid}">Delete</a>
			/ <a href="${contextPath}/mingda/update.htm?semid=${sem.semesterid}">Update</a> /  
			<a href="${contextPath}/mingda/jumpcount.htm?semid=${sem.semesterid}">Add</a></td>
			
		</tr>
		</c:forEach>
	</table>
	<br/><br/>
	<h5><a href="${contextPath}/admin/login.htm">Admin Home</a></h5>
	
	</div>

</body>
</html>