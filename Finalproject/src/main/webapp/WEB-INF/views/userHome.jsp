<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>

<title>User Dashboard</title>
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
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<div class="aa">
	<h1>Course Registration</h1><br/>
	<h3> Welcome, ${sessionScope.currentUser.username} ! </h3><br/>
	<h4><a href="${contextPath}/viewPlan.htm">My Register Plan</a></h4>
	<h3>Please Choose a Semester</h3>
   <c:forEach items="${sessionScope.semesterList}"  var="semester">
   
   <h4><a href="${contextPath}/user/semesterList.htm?semesterid=${semester.semesterid}" >${semester.semestername}</a></h4>
   </c:forEach>
	

     

	</div>
</body>
</html>