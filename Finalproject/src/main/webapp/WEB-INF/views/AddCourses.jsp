<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Courses</title>
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
		<h1>Add New Courses</h1>
		<c:set var="contextPath" value="${pageContext.request.contextPath}" />


				<%
					String bookNumber = request.getParameter("count");
					int count = Integer.valueOf(bookNumber);
				%>
				
				
				<form method="post" action="${contextPath}/mingda/couAdd.htm?">
			      <table border="2" width="550">
				     <tr/><th/>CourseName<th/>credit<th/>crn<th/>professor<th/>location
				<%
					for (int i = 0; i < count; i++) {
				%>

				<tr />
				<td /><input type="text" name="coursename" required />
				<td /><input type="text" name="credit" required />
				<td /><input type="text" name="crn" required />
				<td /><input type="text" name="professor" required />
				<td /><input type="text" name="location" required />

				<%
					}
				%>
				<tr/>
			</table>
			<br/><br/>
			<input type="submit" name="action" value="Add Course" />
		</form>
		<br>
	
	</div>
</body>
</html>