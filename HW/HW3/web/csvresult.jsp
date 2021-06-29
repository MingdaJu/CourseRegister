<%-- 
    Document   : csvresult
    Created on : Oct 11, 2020, 11:25:24 AM
    Author     : jumin
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/csvOperator" prefix="csvoperator" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HW3 Part4 CSV Result</title>
    </head>
    
    <body>
    <csvoperator:csvcontroller filename="${param.filename}"/>
    </body>
</html>
