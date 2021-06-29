import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HW1_Part4 extends HttpServlet
{            
  

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String Reason = request.getParameter("reason");
		String Date = request.getParameter("date");
        String Name = request.getParameter("name");
        String SSN = request.getParameter("ssn");
		String Birth = request.getParameter("birth");
		String Hire = request.getParameter("hire");
        String Marital = request.getParameter("marital");
        String Medical = request.getParameter("medical");
		String Type1 = request.getParameter("type1");
        String Dental = request.getParameter("dental");
        String Type2 = request.getParameter("type2");
		String Vision = request.getParameter("vision");
		
		String Check1 = request.getParameter("medical1");
		String Check2 = request.getParameter("dental1");
		String Check3 = request.getParameter("vision1");
		String Name1 = request.getParameter("name1");
		String SSN1 = request.getParameter("ssn1");
		String Date1 = request.getParameter("date1");
		String Gender = request.getParameter("gender");
		String Student = request.getParameter("student");
		String Relation = request.getParameter("relation");
		String PCP = request.getParameter("pcp");
		
		String Check12 = request.getParameter("medical2");
		String Check22 = request.getParameter("dental12");
		String Check32 = request.getParameter("vision12");
		String Name12 = request.getParameter("name12");
		String SSN12 = request.getParameter("ssn12");
		String Date12 = request.getParameter("date12");
		String Gender12 = request.getParameter("gender12");
		String Student12 = request.getParameter("student12");
		String Relation12 = request.getParameter("relation12");
		String PCP12 = request.getParameter("pcp12");
		

		String Amount = request.getParameter("amount");
		String Jine = request.getParameter("jine");
		String Amount2 = request.getParameter("amount2");
		String Jine1 = request.getParameter("jine1");
		String Amount3 = request.getParameter("amount3");
		String Amount4 = request.getParameter("amount4");
		String Amount5 = request.getParameter("amount5");
		String Amount6 = request.getParameter("amount6");
		String Amount7 = request.getParameter("amount7");
		
		
		String Name2 = request.getParameter("name2");
		String Relationship = request.getParameter("relationship");
		String Amount8 = request.getParameter("amount8");
		String Benefit = request.getParameter("benefit");
		
		String Name23 = request.getParameter("name23");
		String Relationship3 = request.getParameter("relationship3");
		String Amount83 = request.getParameter("amount83");
		String Benefit3 = request.getParameter("benefit3");
		
		String Employee = request.getParameter("employee");
		String Datesign = request.getParameter("datesign");
		String Review = request.getParameter("review");
		String Entered = request.getParameter("entered");
		
		

		
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>HW1_Part4</title>");
        out.println("</head>");
        out.println("<body>");
		
		out.println("<p>CHECK REASON THAT YOU ARE COMPLETING THIS ENROLLMENT FORM*: " + Reason + "</p>");
		out.println("<p>Effective date (mm/dd/yyyy): " + Date + "</p>");
        out.println("<p>Name (Last, First, Middle initial): " + Name + "</p>");
        out.println("<p>Social Security number: " + SSN + "</p>");
        out.println("<p>Date of birth: " + Birth + "</p>");
        out.println("<p>Date of hire: " + Hire + "</p>");
        out.println("<p>Marital status: " + Marital + "</p>");
        out.println("<p>Medical: " + Medical + "</p>");
		out.println("<p>I select the following plan: " + Type1 + "</p>");
        out.println("<p>Dental: " + Dental + "</p>");
		out.println("<p>I select the following plan: " + Type2 + "</p>");
		out.println("<p>Vision Plan: " + Vision + "</p>");
		
		out.println("<p>Medical: " + Check1 + "</p>");
		out.println("<p>Dental: " + Check2 + "</p>");
		out.println("<p>Vision: " + Check3 + "</p>");
		out.println("<p>Name (Last, First, MI) : " + Name1 + "</p>");
		out.println("<p>Social Security #: " + SSN1 + "</p>");
		out.println("<p>D.O.B: " + Date1 + "</p>");
		out.println("<p>Gender: " + Gender + "</p>");
		out.println("<p>Student: " + Student + "</p>");
		out.println("<p>Relation: " + Relation + "</p>");
		out.println("<p>Gender: " + PCP + "</p>");
		
		out.println("<p>Medical: " + Check12 + "</p>");
		out.println("<p>Dental: " + Check22 + "</p>");
		out.println("<p>Vision: " + Check32 + "</p>");
		out.println("<p>Name (Last, First, MI) : " + Name12 + "</p>");
		out.println("<p>Social Security #: " + SSN12 + "</p>");
		out.println("<p>D.O.B: " + Date12 + "</p>");
		out.println("<p>Gender: " + Gender12 + "</p>");
		out.println("<p>Student: " + Student12 + "</p>");
		out.println("<p>Relation: " + Relation12 + "</p>");
		out.println("<p>Gender: " + PCP12 + "</p>");
		
		out.println("<p>Health Care Reimbursement Account: " + Amount + Jine +"</p>");
		out.println("<p>Dependent Care Reimbursement Account: " + Amount2 + Jine1 +"</p>");
		out.println("<p>Health Savings Account: " + Amount3 + "</p>");
		out.println("<p>Supplemental Life Insurance: " + Amount4 + "</p>");
		out.println("<p>Spouse/Domestic Partner: " + Amount5 + "</p>");
		out.println("<p>Dependent Child(ren): " + Amount6 + "</p>");
		out.println("<p>Legal Plan: " + Amount7  +"</p>");
		
		
		out.println("<p>Name (Last, First, Middle initial) : " + Name2 + "</p>");
		out.println("<p>Relationship: " + Relationship + "</p>");
		out.println("<p>Primary/Contingent: " + Amount8  +"</p>");
		out.println("<p>Benefit percent: " + Benefit +"%" +"</p>");
		
		out.println("<p>Name (Last, First, Middle initial) : " + Name23 + "</p>");
		out.println("<p>Relationship: " + Relationship3 + "</p>");
		out.println("<p>Primary/Contingent: " + Amount83  +"</p>");
		out.println("<p>Benefit percent: " + Benefit3 +"%" +"</p>");
		
		out.println("<p>Employee signature: " + Employee  +"</p>");
		out.println("<p>Date: " + Datesign  +"%</p>");
		out.println("<p>Reviewed by: " + Review + "%</p>");
		out.println("<p>Entered: " + Entered  +"%</p>");
		
		
        
		
        out.println("</body>");
        out.println("</html>");
    }
}