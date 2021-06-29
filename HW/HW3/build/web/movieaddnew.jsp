<%-- 
    Document   : movieadd
    Created on : Oct 10, 2020, 11:46:44 PM
    Author     : jumin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HW3 Part4 Movie Store Add Page</title>
    </head>
    <body>
        <form action="movie" method="post">
          
            <p>Movie Title:</p><input  type="text" name="title" required/>
            <p>Lead Actor:</p><input type="text" name="actor" required/>
            <p>Lead Actress:</p><input type="text" name="actress" required/>
            <p>Genre:</p><input type="text" name="genre" required/>
            <p>Year:</p><input type="text" name="year" required/><br />
            <input type='hidden' value='add' name='option'/>
            <input  type="submit" value="Submit" >

        </form>
    </body>
</html>
