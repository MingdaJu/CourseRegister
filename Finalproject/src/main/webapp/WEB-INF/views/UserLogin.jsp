<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<html>
<head>

<title>App Home</title>
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

.ma {
	float: right;
	margin-right: 68%;
	margin-top: 55px;
}
</style>

</head>

<body>

	<c:set var="contextPath" value="${pageContext.request.contextPath}" />
	<div class="ba">
		<div class="aa">
			<h1>Welcome</h1>
			<div id="home"></div>	
			<div class="aaa" id="aaa">
				<form action="${contextPath}/user/login.htm" method="POST">
					UserName:&nbsp;<input type="text" name="username" id="username"
						class="input-group-text" required="required" /></br />
					</br /> PassWord:&nbsp;<input type="password" name="password"
						id="password" class="input-group-text" required="required" /> <br /></br />

					<input type="submit" name="action" class="btn btn-success"
						value="Login" />
						
					 
				</form>
				
				
				
				<form action="${contextPath}/user/create.htm" method="GET">
					<input type="submit" class="btn btn-info" value="Create User">
				</form>
				   
			</div>
		</div>
		<div class="ma" id="ma">
			<form action="${contextPath}/admin/login.htm" method="GET">
				<input type="submit" class="btn btn-warning" value="Admin Login">
			</form>
		</div>


	</div>
</body>
</html>
