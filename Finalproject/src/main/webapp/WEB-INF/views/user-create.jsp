<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create User</title>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<link
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css"
	rel="stylesheet">

<style>
.ba {
	float: left;
	margin-left: 80px;
	margin-top: 20px;
}

</style>

<script>
	function ajaxEvent() {

		var xmlHttp;
		try // Firefox, Opera 8.0+, Safari
		{
			xmlHttp = new XMLHttpRequest();
		} catch (e) {
			try // Internet Explorer
			{
				xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
			} catch (e) {
				try {
					xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
				} catch (e) {
					alert("Your browser does not support AJAX!");
					return false;
				}
			}
		}

		xmlHttp.onreadystatechange = function() {
			if (xmlHttp.readyState == 4) {
				document.getElementById("usernameHint").innerHTML = xmlHttp.responseText;
				
			}
		}
		var username = document.getElementById("username").value;
		xmlHttp.open("POST", "../check.htm?username="+username, true);
		xmlHttp.send();
		
	}
</script>

</head>
<body>

	<c:set var="contextPath" value="${pageContext.request.contextPath}" />
	<div class="ba">
		<h1>Input Your Information</h1>
		</br />
		<div id="usernameHint" style="color:red"></div>
		<form action="${contextPath}/user/create.htm" method="POST">
			New UserName:&nbsp;<input type="text" name="username" id="username"
				class="input-group-text" required="required" onkeyup="ajaxEvent()"/></br />
			</br />
			
			New PassWord:&nbsp;<input type="password" name="password"
				id="password" class="input-group-text" required="required" /></br />
			</br /> <input type="submit" class="btn btn-info" value="Create Account" />
			</br />
		</form>
		</br /> <a href="${contextPath}/user/login.htm">Back to Login Page</a>
	</div>
</body>
</html>