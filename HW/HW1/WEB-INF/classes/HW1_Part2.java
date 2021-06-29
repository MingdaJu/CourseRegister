import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
import java.util.*;  
  
public class HW1_Part2 extends HttpServlet {  
  
  public void doGet(HttpServletRequest request, HttpServletResponse response)  throws IOException, ServletException {  
      response.setContentType("text/html");  
      PrintWriter out = response.getWriter();  
        
      out.println("HW1_Part2");  
      out.println("</br>");    
    Enumeration enumm = request.getHeaderNames();  
        while (enumm.hasMoreElements()) {  
        String headerName = (String) enumm.nextElement();  
        String headerValue = request.getHeader(headerName);  
        out.print("<b>"+headerName + "</b>: ");  
        out.println(headerValue + "<br>");  
      }  
        
  }  
}  