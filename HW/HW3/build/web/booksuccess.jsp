<%-- 
    Document   : booksuccess
    Created on : Oct 12, 2020, 5:10:25 PM
    Author     : jumin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success</title>
    </head>
    <body>
        <h5><%= request.getAttribute("count")%> books added successfully</h5>
        <a href="http://localhost:8080/HW3/index.html">Click here to go back to the main menu</a>
    </body>
</html>
