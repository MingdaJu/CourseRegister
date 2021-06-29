<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<div class="aa">
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
	<h3 style="color:blue">Search for Courses under ${sessionScope.semester.semestername} Semester:</h3>
	
	<form action="${contextPath}/user/search.htm" method="post">
	
	<table width="400px">
	<tr><td>CourseName</td><td><input type="text"   name="course" /></td></tr>
	<tr><td>Crn</td><td><input type="text"   name="rcn" /></td></tr>
	<tr><td>Location</td><td><input type="text"   name="location" /></td></tr>
	<tr><td>Credit</td><td><input type="text"   name="credit" /></td></tr>
	<tr><td>Professor</td><td><input type="text"   name="pro" /></td></tr>
	
	
	</table>
   </br></br>
   
        <input type="submit" name="submit" value="Search" class="btn btn-info"/>
	</form>
	

	<h3>Total Courses Under ${sessionScope.semester.semestername} semester:</h3>
	<table border=2px width=550px solid padding-left=1px>
		
		   <tr>
				<td>Course</td>
				<td>Professor</td>
				<td>CRN</td>
				<td>Location</td>
				<td>Credit</td>
				
		    </tr>
		    <c:forEach items="${sessionScope.semester.courseList}" var ="cou">
			<tr>
				
				<td>${cou.coursename}</td>	
				<td>${cou.professor}</td>
				<td>${cou.crn}</td>
				<td>${cou.location}</td>	
				<td>${cou.credit}</td>									
							
				
			</tr>
		</c:forEach>
	</table>


	</div>
</body>
</html>