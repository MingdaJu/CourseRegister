<%-- 
    Document   : shopadd
    Created on : Oct 15, 2020, 2:48:09 PM
    Author     : jumin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <title>Your Added Product</title>
    </head>
    <body>
        <h4>The following item has been added to the cart successfully</h4>

                        
                    <c:forEach var="prod" items="${sessionScope.goodscart.goodscart}" varStatus="rowCounter">    
                       <c:out value="${prod.goodsName}" />
                    </c:forEach>
                
       <form action="shoppingCart" method="get">
            <input type="hidden" name="option" value="cart">
            <input  type="submit"  value="View Shopping Cart"/>
        </form>
        
       
    </body>
</html>
