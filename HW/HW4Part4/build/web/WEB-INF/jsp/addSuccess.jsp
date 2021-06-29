<%-- 
    Document   : addSuccess
    Created on : Oct 31, 2020, 11:32:50 AM
    Author     : jumin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
           
           <h1>1 Movie Added Successfully</h1>
           
                
        <form action="home.htm" method="post">
            <input type="submit" name="submit" value="Go Back to Main Page"/>
            <input type="hidden" name="page" value="return"/>
        </form>
    </body>
</html>
