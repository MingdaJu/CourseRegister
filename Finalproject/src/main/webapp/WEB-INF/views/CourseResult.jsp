<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Result</title>
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
	<h1>Search Result</h1>
	
    <c:set var ="result" value="${sessionScope.result}"/>
    
    <c:if test="${empty sessionScope.result}">
    	<p>Sorry, no results can be found by this criteria.</p>
    </c:if>    	
    	
    	<table border=2px width=550px solid padding-left=1px>
		
		   <tr>
				<td>Course</td>
				<td>Professor</td>
				<td>CRN</td>
				<td>Location</td>
				<td>Credit</td>
				<td>Handle</td>
		    </tr>
		<c:forEach items="${sessionScope.result}" var="course">
			<tr>			
				<td>${course.coursename}</td>
				<td>${course.professor}</td>
				<td>${course.crn}</td>
				<td>${course.location}</td>
				<td>${course.credit}</td>
				
																										
				<td><a href="${contextPath}/user/jumpToPlanList.htm?courseid=${course.courseid}">Add to Register List</a></td>							
			</tr>
		</c:forEach>
	</table>  
	
</div>
</body>
</html>