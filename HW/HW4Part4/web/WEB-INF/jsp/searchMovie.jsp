<%-- 
    Document   : searchMoive
    Created on : Oct 31, 2020, 1:21:08 AM
    Author     : jumin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Searching Movies</h1>
        <form action="result.htm" method="post">
        <p>Keyword:<input type="text" name="keyword"></p>
        <p><input type="radio" name="search" value="title">Search By Title</p>
        <p><input type="radio" name="search" value="actor">Search By Actor</p>
        <p><input type="radio" name="search" value="actress">Search By Actress</p>
        <input type="submit"  value="Search" > 
        <input type="hidden" name="page" value="searchmovie"/>
        </form>
    </body>
</html>
