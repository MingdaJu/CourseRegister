import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
 
public class HW1_Part5 extends HttpServlet {
 
   
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        
        PrintWriter out = response.getWriter();
		
		out.println("InitParameter(String name):" + getInitParameter("name1"));
		
		ServletConfig config = getServletConfig();
		
        
        Enumeration enumration = config.getInitParameterNames();
        while(enumration.hasMoreElements()){
        String name = (String) enumration.nextElement();
        String value = config.getInitParameter(name);
        out.println("InitParameterNames: " +name+": "+value);
        }
		
		ServletContext sc = config.getServletContext();   
		String param = sc.getInitParameter("name1");	
		System.out.println("ServletContext: " + param);
		
		

		out.println("ServletName:"+config.getServletName());
		
		
		
		      
    }
	
	
     
    public String getServletInfo() {
        return "Already getServletInfo";
    }   
    
}