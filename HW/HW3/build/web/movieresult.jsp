<%-- 
    Document   : movieresult
    Created on : Oct 11, 2020, 1:00:48 AM
    Author     : jumin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
               <table border = "1" width="60%">
            <thead>
           <th>Title</th>
            <th>Actor</th>
            <th>Actress</th>
            <th>Year</th>
            <th>Genre</th>
        </thead>
        <tbody>
            <c:forEach var="user" items="${requestScope.searchedUsers}">
                <tr>
                <td><c:out value="${user.getTitle()}" /></td>
                <td><c:out value="${user.getActor()}" /></td>
                <td><c:out value="${user.getActress()}" /></td>
                <td><c:out value="${user.getYear()}" /></td>
                <td><c:out value="${user.getGenre()}" /></td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="http://localhost:8080/HW3/moviehome.jsp">Click here to go back to the main menu</a>
    </body>
</html>

