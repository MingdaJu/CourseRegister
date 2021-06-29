<%-- 
    Document   : user-success
    Created on : Nov 4, 2020, 9:59:57 AM
    Author     : jumin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        ${requestScope.user.username}<br/>
        ${requestScope.user.email}<br/>
           
    </body>
</html>
