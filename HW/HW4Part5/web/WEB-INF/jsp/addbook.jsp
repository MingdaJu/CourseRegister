<%-- 
    Document   : addbook
    Created on : Oct 12, 2020, 5:07:00 PM
    Author     : jumin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Book</title>
    </head>
    <body>
        <form action="success.htm" method="post">    
            
            <%
 
                int count = (int) request.getAttribute("count");
                for (int i = 0; i < count; i++) 

                { out.print("Your No."+(i+1)+ " book");
%>
            <p>ID<input type="text" name="ID" required/></p>
            <p>ISBN<input type="text" name="ISBN" required/></p> 
            <p>Book Title<input type="text" name="Title" required/></p> 
            <p>Authors<input type="text" name="Author"required/></p>
            <p>Price<input type="text" name="Price" required/></p>  

            <%    }

            %>   

            <input type="hidden" name="option" value="addbooks" >
            <input type="submit" name="Submit" value="Submit">
        </form>
    </body>
</html>
