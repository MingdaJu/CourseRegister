<%-- 
    Document   : addMovie
    Created on : Oct 31, 2020, 12:33:59 AM
    Author     : jumin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Movie</title>
    </head>
    <body>
        <form action="result.htm" method="post">
          
            <p>Movie Title:</p><input  type="text" name="title" required/>
            <p>Lead Actor:</p><input type="text" name="actor" required/>
            <p>Lead Actress:</p><input type="text" name="actress" required/>
            <p>Genre:</p><input type="text" name="genre" required/>
            <p>Year:</p><input type="text" name="year" required/><br /><br />
            <input type="submit" value="Submit" >
            <input type="hidden" name="page" value="addmovie"/>

        </form>
    </body>
</html>
