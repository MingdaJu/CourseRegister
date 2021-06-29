package neu.coe.info.controller;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.apache.commons.mail.DefaultAuthenticator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;


import neu.coe.info.dao.CourseDao;
import neu.coe.info.dao.UserDAO;
import neu.coe.info.pojo.Semester;
import neu.coe.info.pojo.RegisterPlan;
import neu.coe.info.pojo.User;



@Controller
public class UserController {
		
	//User Login
	@RequestMapping(value = "/user/login.htm", method = RequestMethod.GET)
	public String userLoginGet(HttpServletRequest request) {

		return "UserLogin";
	}
	
	//User Login and Show User all semesters
	@RequestMapping(value = "/user/login.htm", method = RequestMethod.POST)
	public String userLoginPost( HttpServletRequest request, UserDAO userdao, ModelMap map, CourseDao dao) {		
		List<Semester> semesterList = dao.showAllSemesters();
		HttpSession session = request.getSession();
		session.setAttribute("semesterList", semesterList);

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
	
		try {
			User user = userdao.get(username, password);

			if (user != null ) {
				session.setAttribute("currentUser", user);
				//session.setMaxInactiveInterval(120*60);
				return "userHome";			
			} else {
				map.addAttribute("errorMessage", "UserName or PassWord is Wrong");
				return "ErrorPage";
			}
			
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return "UserLogin";
		
	}
	
	//Create user
	@RequestMapping(value = "/user/create.htm", method = RequestMethod.GET)
	public String userCreateGet(HttpServletRequest request){
		return "user-create";
	}
	
	
	//Create user
	@RequestMapping(value = "/user/create.htm", method = RequestMethod.POST)
	public String userCreatePost(HttpServletRequest request,UserDAO userdao, ModelMap map){

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		User newuser = userdao.add(username, password);
		request.setAttribute("newuser", username);
		
		if(newuser!=null){
			return "createUser";
		}
		else {
			map.addAttribute("errorMessage", "UserName Already Exist");
			return "ErroePage";
		}
	}


	//Go to Courses under which Semester
	@RequestMapping(value = "/user/semesterList", method = RequestMethod.GET)
	public String goToSearchGET(HttpServletRequest request, CourseDao dao, ModelMap map ) {
		
		int semesterid = Integer.parseInt(request.getParameter("semesterid"));
		Semester semester = dao.getSemesterId(semesterid);
		
		HttpSession session = request.getSession();
		session.setAttribute("semesterid", semesterid);
		session.setAttribute("semester", semester);
		if(semester!=null){
		return "SearchCourse";	
		}
		else {
			map.addAttribute("errorMessage", "Sorry, Something Wrong!");
			return "ErroePage";
		}
	}
	
}
	


