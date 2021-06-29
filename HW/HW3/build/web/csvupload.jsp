<%-- 
    Document   : csvupload
    Created on : Oct 11, 2020, 11:25:10 AM
    Author     : jumin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HW3 Part4 Upload CSV</title>
    </head>
    
    <body>
                <form action="/HW3/csvresult.jsp" method="post">
                    <label>Upload CSV File.</label>
                    <input type="text" name="filename"/>
                    <input type="submit" name="submit" value="Submit"/>
                </form> 
    </body>
</html>
