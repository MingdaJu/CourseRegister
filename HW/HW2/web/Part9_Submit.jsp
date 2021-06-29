<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.util.Map" %>
<!DOCTYPE html>

 <html>
 <body>
   <head>
      <title>HW2_Part9</title>
   </head>
 <%


		Map<String, String[]> map = request.getParameterMap();

		out.println("<p>Reason:" + map.get("reason")[0] + "</p>");
		out.println("<p>Date:" + map.get("date")[0] + "</p>");
		out.println("<p>Name:" + map.get("name")[0] + "</p>");
		out.println("<p>ssn:" + map.get("ssn")[0] + "</p>");
		out.println("<p>Birth:" + map.get("birth")[0] + "</p>");
		out.println("<p>Hire:" + map.get("hire")[0] + "</p>");
		out.println("<p>Marital:" + map.get("marital")[0] + "</p>");
		out.println("<p>Medical:" + map.get("medical")[0] + "</p>");
		out.println("<p>Your choice:" + map.get("type1")[0] + "</p>");
		out.println("<p>Dental:" + map.get("dental")[0] + "</p>");
		out.println("<p>Your choice:" + map.get("type2")[0] + "</p>");
		out.println("<p>Vision:" + map.get("vision")[0] + "</p>");
		
		out.println("<p>Medical:" + map.get("medical1")[0] + "</p>");
		out.println("<p>Dental:" + map.get("dental1")[0] + "</p>");
		out.println("<p>Vision:" + map.get("vision1")[0] + "</p>");
		out.println("<p>Name:" + map.get("name1")[0] + "</p>");
		out.println("<p>SSN:" + map.get("ssn1")[0] + "</p>");
		out.println("<p>Date:" + map.get("date1")[0] + "</p>");
		out.println("<p>Gender:" + map.get("gender")[0] + "</p>");
		out.println("<p>Student:" + map.get("student")[0] + "</p>");
		out.println("<p>Relation:" + map.get("relation")[0] + "</p>");
		out.println("<p>PCP:" + map.get("pcp")[0] + "</p>");
		
		out.println("<p>Medical:" + map.get("medical2")[0] + "</p>");
		out.println("<p>Dental:" + map.get("dental12")[0] + "</p>");
		out.println("<p>Vision:" + map.get("vision12")[0] + "</p>");
		out.println("<p>Name:" + map.get("name12")[0] + "</p>");
		out.println("<p>SSN:" + map.get("ssn12")[0] + "</p>");
		out.println("<p>Date:" + map.get("date12")[0] + "</p>");
		out.println("<p>Gender:" + map.get("gender12")[0] + "</p>");
		out.println("<p>Student:" + map.get("student12")[0] + "</p>");
		out.println("<p>Relation:" + map.get("relation12")[0] + "</p>");
		out.println("<p>PCP:" + map.get("pcp12")[0] + "</p>");
		
		out.println("<p>Amount:" + map.get("amount")[0] + "</p>");
		out.println("<p>" + map.get("jine")[0] + "</p>");
		out.println("<p>Amount:" + map.get("amount2")[0] + "</p>");
		out.println("<p>" + map.get("jine1")[0] + "</p>");
		out.println("<p>Amount:" + map.get("amount3")[0] + "</p>");
		out.println("<p>Supplemental Life Insurance:" + map.get("amount4")[0] + "</p>");
		out.println("<p>Spouse/Domestic Partner:" + map.get("amount5")[0] + "</p>");
		out.println("<p>Dependent Child(ren):" + map.get("amount6")[0] + "</p>");
		out.println("<p>Legal Plan:" + map.get("amount7")[0] + "</p>");
		
		out.println("<p>Name:" + map.get("name2")[0] + "</p>");
		out.println("<p>Relationship:" + map.get("relationship")[0] + "</p>");
		out.println("<p>Primary/Contingent:" + map.get("amount8")[0] + "</p>");
		out.println("<p>Benefit:" + map.get("benefit")[0] + "</p>");
		out.println("<p>Name:" + map.get("name23")[0] + "</p>");
		out.println("<p>Relationship:" + map.get("relationship3")[0] + "</p>");
		out.println("<p>Primary/Contingent:" + map.get("amount83")[0] + "</p>");
		out.println("<p>Benefit:" + map.get("benefit3")[0] + "</p>");
		
		out.println("<p>employee:" + map.get("employee")[0] + "</p>");
		out.println("<p>datesign:" + map.get("datesign")[0] + "</p>");
		out.println("<p>review:" + map.get("review")[0] + "</p>");
		out.println("<p>entered:" + map.get("entered")[0] + "</p>");
		



%>
</body>
</html>