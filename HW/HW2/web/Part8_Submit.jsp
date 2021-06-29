<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>HW2_Part8</title>
</head>
		<body>        
		<p>Reason:<%=request.getParameter("reason")%></p>
		<p>Date:<%=request.getParameter("date")%></p>
        <p>Name:<%=request.getParameter("name")%></p>
        <p>SSN:<%=request.getParameter("ssn")%></p>
		<p>Birth:<%=request.getParameter("birth")%></p>
		<p>Hire:<%=request.getParameter("hire")%></p>
        <p>Marital:<%=request.getParameter("marital")%></p>
        <p>Medical:<%=request.getParameter("medical")%></p>
		<p>Your choice:<%=request.getParameter("type1")%></p>
        <p>Dental:<%=request.getParameter("dental")%></p>
        <p>Your choice:<%=request.getParameter("type2")%></p>
		<p>Vision:<%=request.getParameter("vision")%></p>
		
		<p>Medical:<%=request.getParameter("medical1")%></p>
		<p>Dental:<%=request.getParameter("dental1")%></p>
		<p>Vision:<%=request.getParameter("vision1")%></p>
		<p>Name:<%=request.getParameter("name1")%></p>
		<p>SSN:<%= request.getParameter("ssn1")%></p>
		<p>Date:<%=request.getParameter("date1")%></p>
		<p>Gender:<%=request.getParameter("gender")%></p>
		<p>Student:<%=request.getParameter("student")%></p>
		<p>Relation:<%=request.getParameter("relation")%></p>
		<p>PCP:<%=request.getParameter("pcp")%></p>
		
		<p>Medical:<%=request.getParameter("medical2")%></p>
		<p>Dental:<%=request.getParameter("dental12")%></p>
		<p>Vision:<%=request.getParameter("vision12")%></p>
		<p>Name:<%=request.getParameter("name12")%></p>
		<p>SSN:<%=request.getParameter("ssn12")%></p>
		<p>Date:<%=request.getParameter("date12")%></p>
		<p>Gender:<%=request.getParameter("gender12")%></p>
		<p>Student:<%=request.getParameter("student12")%></p>
		<p>Relation:<%=request.getParameter("relation12")%></p>
		<p>PCP:<%=request.getParameter("pcp12")%></p>
		

		<p>Amount:<%=request.getParameter("amount")%></p>
		<p><%=request.getParameter("jine")%></p>
		<p>Amount:<%=request.getParameter("amount2")%></p>
		<p><%=request.getParameter("jine1")%></p>
		<p>Amount: $ <%=request.getParameter("amount3")%></p>
		<p>Supplemental Life Insurance:<%=request.getParameter("amount4")%></p>
		<p>Spouse/Domestic Partner:<%=request.getParameter("amount5")%></p>
		<p>Dependent Child(ren):<%=request.getParameter("amount6")%></p>
		<p>Legal Plan:<%=request.getParameter("amount7")%></p>
		
		
		<p>Name:<%=request.getParameter("name2")%></p>
		<p>Relationship:<%=request.getParameter("relationship")%></p>
		<p>Primary/Contingent:<%=request.getParameter("amount8")%></p>
		<p>Benefit:<%=request.getParameter("benefit")%></p>
		
		<p>Name:<%=request.getParameter("name23")%></p>
		<p>Relationship:<%=request.getParameter("relationship3")%></p>
		<p>Primary/Contingent:<%=request.getParameter("amount83")%></p>
		<p>Benefit:<%=request.getParameter("benefit3")%></p>
		
		<p>Employee:<%=request.getParameter("employee")%></p>
		<p>Datesign:<%=request.getParameter("datesign")%></p>
		<p>Review:<%=request.getParameter("review")%></p>
		<p>Entered:<%=request.getParameter("entered")%></p>
		
			</body>
</html>