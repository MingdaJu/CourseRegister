package neu.coe.info.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import neu.coe.info.dao.UserDAO;
import neu.coe.info.pojo.RegisterPlan;
import neu.coe.info.pojo.User;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
@Controller

public class EmailController {
	
	
       public EmailController(){
		
	}
    
    //Register course
    @RequestMapping(value = "/submitCourse.htm", method = RequestMethod.GET)
   	public String submitForm(HttpServletRequest request, User user) {

    	   String cid = request.getParameter("cid");   //get current course info
    	   String crn = request.getParameter("ccrn");
    	   System.out.print(cid);
    	   System.out.print(crn);
   		   sendEmail("You are successfully register Course " +cid+" with CRN "+crn);
   		   return "submitSuccess";
   		
   	}
       
    //Send Email to User
   	public void sendEmail(String mess ) {
		try {
			Email email = new SimpleEmail();
			email.setDebug(true);
			email.setHostName("smtp.163.com");
			email.setSmtpPort(465);
			email.setAuthenticator(new DefaultAuthenticator("jmdjmd12@163.com", "Jumd12345")); //get sender email account
			email.setSSLOnConnect(true);
			email.setFrom("jmdjmd12@163.com");    //Sender 
			email.addTo("ju.m@northeastern.edu"); //Receiver
			email.setSubject("Register Course ");
			email.setMsg(mess); 
			
			email.send();
		} catch (EmailException e) {
			System.out.println("Email cannot be sent");
		}
	}
}
