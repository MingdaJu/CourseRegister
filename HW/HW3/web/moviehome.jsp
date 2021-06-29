<%-- 
    Document   : moviefirst
    Created on : Oct 10, 2020, 11:41:18 PM
    Author     : jumin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HW3 Part4 Movie Store Home Page</title>
    </head>
    <body>
        <h1>Welcome to our Movie Store</h1>
        <h5>Please make your selection below:</h5> <br/>
        <form action = "movie" method = "GET">
            <select name="option">
                <option value="Browse">Browse Movies</option>
                <option value="Add">Add New Movie to Database</option>
            </select>
            <input type="submit" value="Submit" >
        </form>
    </body>
</html>
