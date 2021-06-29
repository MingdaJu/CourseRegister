<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Course</title>
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
select{
width:40%;
}
span{
color:blue;
}
</style>
</head>


<body>
<div class="aa">
<h1>Add To Your Register List</h1>


<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<form method="post" action="${contextPath}/user/addPlan.htm">
		<input type="text" name="regname"  required/><br/><br/>
		<input type="submit" name="action" value="Create Register List" />
	</form>







<h1>Please choose a Register List</h1>


<form action="${contextPath}/user/addCoursePlan.htm" method="post">

	
	<select name="selectplanlist"   />
		<c:forEach items="${sessionScope.userPlan}" var="ree">
		
				<option value="${ree.planid}">${ree.planname}</option>
		
		</c:forEach>
		</select>
	 <br><br>
	<input type="submit" name="action" value="Add"/>
</form>

</div>	
</body>
</html>