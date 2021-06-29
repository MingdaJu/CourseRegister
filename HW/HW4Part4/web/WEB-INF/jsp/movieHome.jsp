<%-- 
    Document   : movieHome
    Created on : Oct 31, 2020, 12:55:26 AM
    Author     : jumin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HW4 Part4-Movie</title>
    </head>
    <body>
                <h1>Welcome to our Movie Store</h1>
        <h5>Please make your selection below:</h5> 
        <form action="operate.htm" method="post">            
            <select name="option">
                <option value="browseMovies">Browse Movies</option>
                <option value="addMovie">Add Movies</option>
            </select>
            
            <input type="submit"  value="Submit"/>
            <input type="hidden" name="page" value="home"/>
        </form>
    </body>
</html>
