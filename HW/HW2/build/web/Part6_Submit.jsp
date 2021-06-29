<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>HW2_Part6</title>
</head>
		<body>
		
		<p>Email:<%=request.getParameter("email")%></p>
        <p>Password:<%=request.getParameter("password")%></p>
        <p>Repassword:<%=request.getParameter("repassword")%></p>
        <p>File:<%=request.getParameter("file")%></p>
        <p>Gender:<%=request.getParameter("gender")%></p>
        <p>Country:<%=request.getParameter("country")%></p>
		<p>Hobby:</p>
        <p><%=request.getParameter("Cricket")%></p>
		<p><%=request.getParameter("Football")%></p>
        <p>Address:<%=request.getParameter("address")%></p>
		
		</body>
</html>