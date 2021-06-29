<%-- 
    Document   : shopcart.jsp
    Created on : Oct 15, 2020, 2:46:13 PM
    Author     : jumin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping Cart</title>
    </head>
    <body>
        <h3>Shopping Cart</h3>
        
        <ul>
            <form action="shoppingCart" method="get">
               
                     <c:forEach var="product" items="${sessionScope.products.goodscart}" varStatus="rowCounter">
                    <input type="checkbox" value='${product.goodsName}' name="products" /> <c:out value="${product.goodsName}"/><br/>
                </c:forEach>
                <input type="hidden" name="option" value="delete" /><br>
                <input type="submit" value="Delete" />
               
            </form>
            


        </ul>
      

    </body>
</html>
