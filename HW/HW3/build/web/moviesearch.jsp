<%-- 
    Document   : moviesearch
    Created on : Oct 11, 2020, 12:37:27 AM
    Author     : jumin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HW3 Part4 Movie Store Search</title>
    </head>
    <body>
        <h1>Searching Movies</h1>
        <form action="movie" method="post">
        <p>Keyword:<input type="text" name="keyword"></p>
        <p><input type="radio" name="type" value="title">Search By Title</p>
        <p><input type="radio" name="type" value="actor">Search By Actor</p>
        <p><input type="radio" name="type" value="actress">Search By Actress</p>
        <input type='hidden' name='option' value='browse'>
        <input " type= "submit" value= "Search" >
        </form>
    </body>
</html>
