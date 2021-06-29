<%-- 
    Document   : bookcount
    Created on : Oct 12, 2020, 5:09:07 PM
    Author     : jumin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HW3 Bookcount</title>
    </head>
    <body>
        <form action="book" method="post">
            <h4>How many books do you want to add? </h4>
            <input type="text" name="count" required>
            <input type="hidden" name="option" value="booknumber"/>
            <p><input type="submit" value="Submit"></p>
        </form>
    </body>
</html>
