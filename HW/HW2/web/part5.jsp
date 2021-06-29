<%-- 
    Document   : part5
    Created on : Oct 4, 2020, 1:20:13 AM
    Author     : jumin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Part5 Excel File</title>
    </head>
    <body>
          <h5>Please select your file:</h5>
    
    <form action = "part5" method = "post">
       <input type = "file" name = "file" />
       <input type = "submit" value = "Upload" />
    </form>
    </body>
</html>
