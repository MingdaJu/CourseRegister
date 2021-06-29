<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
	<c:set var="contextPath" value="${pageContext.request.contextPath}" />



	<div class="aa">

		<form:form action="${contextPath}/mingda/cousave.htm" method="post" modelAttribute="updatecourse">
		<form:hidden path="courseid"/>
		
		
			<table border="2" width="550">
				<tr />
				<th />CourseName
				<th />credit
				<th />crn
				<th />professor
				<th />location
				<tr />
				<td />
				<form:input path="coursename" />
				<br />
				<td />
				<form:input path="professor" />
				<br />
				<td />
				<form:input path="crn" />
				<br />
				<td />
				<form:input path="location" />
				<br />
				<td />
				<form:input path="Credit" />
				
				<tr />
				
				
				
				<br />
				

				

			</table>
			<br />
				<br />
			<input type="submit" name="action" value="Save" />
		</form:form>




	</div>
</body>
</html>