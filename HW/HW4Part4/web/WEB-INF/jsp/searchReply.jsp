<%-- 
    Document   : searchReply
    Created on : Oct 31, 2020, 7:56:25 PM
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
                
           <table border="1">
            <tr>
                <th>Movie Title</th>
                <th>Lead Actor</th>
                <th>Lead Actress</th>
                <th>Genre</th>
                <th>Year</th>
            </tr>
            
            <c:forEach var="movie" items="${result}">
                <tr>
                <th>${movie.getTitle()}</th>
                <th>${movie.getActor()}</th>
                <th>${movie.getActress()}</th>
                <th>${movie.getGenre()}</th>
                <th>${movie.getYear()}</th>
                </tr>
            </c:forEach>
        </table>

        
        <form action="home.htm" method="post">
            <input type="submit" name="submit" value="Go Back to Main Page"/>
            <input type="hidden" name="page" value="return"/>
        </form>
    </body>
</html>
