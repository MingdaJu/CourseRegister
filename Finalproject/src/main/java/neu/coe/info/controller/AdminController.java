package neu.coe.info.controller;

import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import neu.coe.info.dao.DAOFactory;
import neu.coe.info.dao.UserDAO;
import neu.coe.info.pojo.RegisterPlan;
import neu.coe.info.pojo.Course;
import neu.coe.info.pojo.User;

@Controller
public class AdminController {
	
	
	@RequestMapping(value="/admin/login.htm", method = RequestMethod.GET)
	public String adminLogin(HttpServletRequest request){
		return "AdminHome";
	}
	
	@RequestMapping(value="/admin/manageUser.htm", method = RequestMethod.GET)
	public String manageUserAccount(HttpServletRequest request ,UserDAO udao){
		List<User> userlist = udao.displayAll();
		HttpSession session = request.getSession();
		session.setAttribute("userlist", userlist);
		return "ManageUser";
	}	
	
	@RequestMapping(value="/admin/registercourse.htm", method = RequestMethod.GET)
	public String receiveCourseInfoGET(HttpServletRequest request){
		HttpSession session = request.getSession(); 	
		User user = (User) session.getAttribute("currentUser");
		List<RegisterPlan> plan = user.getNewPlan(); 
		session.setAttribute("userCourseInfo", plan);
		return "registerInfo";
	}
	
	
	@RequestMapping(value = "/admin/deleteUser.htm", method = RequestMethod.GET)
	public String deleteUser(HttpServletRequest request,UserDAO userdao) {
		
		int user = Integer.parseInt(request.getParameter("deleteUser"));
		
		userdao.delete(user);		
		return "redirect:/admin/manageUser.htm";
	}
}
