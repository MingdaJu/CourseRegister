<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.io.*,java.util.*" %>
<!DOCTYPE html>


 <html>
 <body>
   <head>
      <title>HW2_Part7</title>
   </head>
 <%
               Enumeration paramNames = request.getParameterNames();
               while(paramNames.hasMoreElements()) 
			   {	   
               String paramName = (String)paramNames.nextElement();
               out.print("<p>" + paramName + ":</p>");
               String paramValue[] = request.getParameterValues(paramName);
			   for(String values: paramValue)
            {
                out.print("<p>" + values + "</p>");
            }
               
               }
 %>
</body>
</html>