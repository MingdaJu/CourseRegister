import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

//1.

public class HW1_Part6 extends HttpServlet {

 public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
  
  PrintWriter out = response.getWriter();
  
 
  String getAuthType = request.getAuthType();
  out.println("AuthType:" + getAuthType); 
  
  String getContextPath = request.getContextPath();
  out.println("ContextPath:" + getContextPath);
  
  Enumeration<String> headerNames = request.getHeaderNames();
        out.println("GetHeader, GetIntHeader, GetDataHeaders, GetHeaderNames:");
    while(headerNames.hasMoreElements()){
        String element = headerNames.nextElement();
		
        out.println(element+":"+request.getHeader(element));
    }
  
  String getMethod = request.getMethod();
  out.println("Method:" + getMethod);

  String getPathInfo = request.getPathInfo();
  out.println("PathInfo:" + getPathInfo); 

  String getPathTranslated = request.getPathTranslated();
  out.println("PathTranslated:" + getPathTranslated);  
  
  String getQueryString = request.getQueryString();
  out.println("QueryString:" + getQueryString);
  
  String getRemoteUser = request.getRemoteUser();
  out.println("RemoteUser:" + getRemoteUser);
  
  String getRequestedSessionId = request.getRequestedSessionId();
  out.println("RequestedSessionId:" + getRequestedSessionId);
  
  String getRequestURI = request.getRequestURI();
  out.println("RequestURI:" + getRequestURI);
  
  StringBuffer getRequestURL = request.getRequestURL();
  out.println("RequestURL:" + getRequestURL);
  
  String getServletPath = request.getServletPath();
  out.println("ServletPath:" + getServletPath);
  
  
//2.
  
  
  String getCharacterEncoding = request.getCharacterEncoding();
  out.println("CharacterEncoding:" + getCharacterEncoding);
  
  int getContentLength = request.getContentLength();
  out.println("ContentLength:" + getContentLength);
  
  long getContentLengthLong = request.getContentLengthLong();
  out.println("ContentLengthLong:" + getContentLengthLong);
  
  String getContentType = request.getContentType();
  out.println("ContentType:" + getContentType);
  
  String getLocalAddr = request.getLocalAddr();
  out.println("LocalAddr:" + getLocalAddr);
  
  Locale locale=request.getLocale();
  if(locale.equals(java.util.Locale.US)){
  out.print("Local: USA");
  }
  if(locale.equals(java.util.Locale.CHINA)){
  out.print("Local: USA");
  }
  String getLocalName = request.getLocalName();
  out.println("LocalName:" + getLocalName);
  
  int getLocalPort = request.getLocalPort();
  out.println("LocalPort:" + getLocalPort);  
		
  String getParameter = request.getParameter("name");  
  out.println("Parameter:" + getParameter); 
  
  String getProtocol = request.getProtocol();
  out.println("Protocol:" + getProtocol);   
 
  String getRealPath = request.getSession().getServletContext().getRealPath("/");
  out.println("RealPath:" + getRealPath);  
  
  String getRemoteAddr = request.getRemoteAddr();
  out.println("RemoteAddr:" + getRemoteAddr);   
  
  String getRemoteHost = request.getRemoteHost();
  out.println("RemoteHost:" + getRemoteHost);  
  
  int getRemotePort = request.getRemotePort();
  out.println("RemotePort:" + getRemotePort);
  
  String getScheme = request.getScheme();  
  out.println("Scheme:" + getScheme); 
  
  String getServerName = request.getServerName();
  out.println("ServerName:" + getServerName);
  
  int getServerPort = request.getServerPort();
  out.println("ServerPort:" + getServerPort);
  
  
  ServletContext context = getServletContext();
  String address = context.getInitParameter("address");
  out.println("ServletContext:" + address);
  
  //StringBuffer sb = new StringBuffer() ;
  //InputStream is = request.getInputStream();
  //InputStreamReader isr = new InputStreamReader(is);  
  //BufferedReader br = new BufferedReader(isr);
  //String s = "Already" ;
  //while((s=br.readLine())!=null){
  //sb.append(s) ;
  //}
  //String str =sb.toString();
  //out.println("InputStream:" + str);
 
 }
}
