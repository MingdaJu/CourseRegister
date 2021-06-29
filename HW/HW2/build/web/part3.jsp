<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HW2_Part3</title>
</head>
<body>
	<p>
		<c:out value="${'JSTL Core Tags:'}" />
	</p>
	<p>
		<c:out value="${'Method---c:out: Printed'}" />
	</p>
	<c:set var="Income" scope="session" value="${'Printed'}" />
	<p>
		<c:out value="${'Method---c:set:'}" />
		<c:out value="${Income}" />
	</p>
	<p>
		<c:out value="${'Method---c:url:'}" />
		<c:url value="/HW2_Part3.jsp" />
	</p>
	</br>

	<p>
		<c:out value="${'JSTL Function Tags:'}" />
	</p>

	<c:set var="String" value="javatpoint" />

	<c:if test="${fn:contains(String, 'javatpoint')}">
		<p>Method---fn:contains---Already get the contain String()</p>
	</c:if>

	<c:if test="${fn:contains(String, 'JAVATPOINT')}">
		<p>Not Found</p>
	</c:if>

	<c:set var="String" value="JSP programming" />

	<c:if test="${fn:endsWith(String, 'programming')}">
		<p>Method---fn:endsWit---Already get the end String()</p>
	</c:if>

	<c:if test="${fn:endsWith(String, 'JSP')}">
		<p>Not Found</p>
	</c:if>

	<c:set var="string1" value="It  first String." />
	<p>Method---indexOf(): ${fn:indexOf(string1, "first")}</p>
	</br>

	<p>
		<c:out value="${'JSTL Formatting Tags:'}" />
	</p>

	<c:set var="Amount" value="6250.625" />
	<p>
		Method---fmt:formatNumber(currency):
		<fmt:formatNumber value="${Amount}" type="currency" />
	</p>

	<c:set var="Date" value="<%=new java.util.Date()%>" />
	<p>
		Method---fmt:formatDate:
		<fmt:formatDate type="time" value="${Date}" />
	</p>

	<c:set var="date" value="12-08-2016" />

	<fmt:parseDate value="${date}" var="parsedDate" pattern="MM-dd-yyyy" />
	<p>
		Method---fmt:parseDate:
		<c:out value="${parsedDate}" />
	</p>
	</br>

	<p>
		<c:out value="${'JSTL XML Tags:'}" />
	</p>


	<c:set var="abc">

		<abc> <name>Printed</name> </abc>

	</c:set>
	<x:parse xml="${abc}" var="output" />
	<p>
		Method---x:out:
		<x:out select="$output/abc[1]/name" />
	</p>

	<c:set var="abc">
		<abc> <price>Printed</price> </abc>
	</c:set>
	<x:parse xml="${abc}" var="output" />
	<x:set var="fragment" select="$output/abc[1]/price" />
	<p>
		Method---x:set:
		<x:out select="$fragment" />
	</p>

	<c:set var="xmltext">
		<abc>Printed</abc>
	</c:set>

	<x:parse xml="${xmltext}" var="output" />
	<x:choose>
		<x:when select="$output/abc = 'Printed'">  
		
      Method---x:choose:Printed  
   </x:when>
		<x:when select="$output/abc = 'No Print'">  
      No Print  
   </x:when>
		<x:otherwise>  
      No Print...  
   </x:otherwise>
	</x:choose></ br>
      
      <p>
		<c:out value="${'JSTL SQL <sql:query> Tag:'}" />
	</p>
	  
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/test"  
     user="mingda"  password="jumd1234"/>  
  
<sql:query dataSource="${db}" var="rs">  
SELECT * from Students;  
</sql:query>  
   
<table>  
<tr>  
<th>Student ID</th>  
<th>First Name</th>  
<th>Last Name</th>  
<th>Age</th>  
</tr>  
<c:forEach var="table" items="${rs.rows}">  
<tr>  
<td><c:out value="${table.id}"/></td>  
<td><c:out value="${table.First_Name}"/></td>  
<td><c:out value="${table.Last_Name}"/></td>  
<td><c:out value="${table.Age}"/></td>  
</tr>  
</c:forEach>  
</table> 

<%--<sql:update dataSource="${db}" var="count">  
INSERT INTO Students VALUES (154,'Nasreen', 'jaha', 25);  
</sql:update>--%>

</body>
</html>
