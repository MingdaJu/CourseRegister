package neu.coe.info.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import neu.coe.info.dao.DAOFactory;
import neu.coe.info.dao.CourseDao;
import neu.coe.info.dao.RegisterDao;
import neu.coe.info.dao.UserDAO;
import neu.coe.info.pojo.Semester;
import neu.coe.info.pojo.RegisterPlan;
import neu.coe.info.pojo.Course;
import neu.coe.info.pojo.User;

@Controller
public class RegisterController {
	
	
	public RegisterController(){
		
	}
	
	

	//Go to search page under specific semester
	@RequestMapping(value = "/user/search.htm", method = RequestMethod.GET)
	public String search(HttpServletRequest request, CourseDao dao, ModelMap map) {	
		
		int semesterid = Integer.parseInt(request.getParameter("semesterid"));
		Semester semester = dao.getSemesterId(semesterid);
		
		HttpSession session = request.getSession();
		session.setAttribute("semesterid", semesterid);
		session.setAttribute("semester", semester);
		if(semester!=null){
		return "CourseResult";
		}else {
			map.addAttribute("errorMessage", "Sorry, Something Wrong!");
			return "ErroePage";
		}
	}
	
	//Get Search Information
	@RequestMapping(value = "/user/search.htm", method = RequestMethod.POST)
	public String searchCourse(HttpServletRequest request, RegisterDao dao) {	
		HttpSession session = request.getSession();	
		String searchText = request.getParameter("pro");	
		String searchTextt = request.getParameter("rcn");
		String searchTexttt = request.getParameter("course");
		String searchTextttt = request.getParameter("location");
		String searchTexttttt = request.getParameter("credit");
		List<Course> searchResult = dao.mutiSearchCourse(searchText,searchTextt,searchTexttt, searchTextttt, searchTexttttt);
		session.setAttribute("result",searchResult);

		return "CourseResult";	
	}
	
	//View Plan List You have
	@RequestMapping(value = "/user/jumpToPlanList.htm", method = RequestMethod.GET)
	public String jumpToPlanListGet(HttpServletRequest request) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("currentUser");
		List<RegisterPlan> plan = user.getNewPlan(); 
		session.setAttribute("userPlan", plan);
		int cuis = Integer.parseInt(request.getParameter("courseid"));	
		session.setAttribute("newcou", cuis);
		
		
		return "coursePlanHome";
	}
	
	//add Plan
	@RequestMapping(value = "/user/addPlan.htm", method = RequestMethod.GET)
	public String createPlanList(HttpServletRequest request) {		

		return "coursePlanHome";
	}
	
	//add plan under current User
	@RequestMapping(value = "/user/addPlan.htm", method = RequestMethod.POST)
	public String handlePlaylistForm(HttpServletRequest request, RegisterDao dao ) {
		HttpSession session = request.getSession();
		
		
		String plan = request.getParameter("regname");
		User u = (User)session.getAttribute("currentUser");
		RegisterPlan reg = new RegisterPlan();
		reg.setPlanname(plan);
		reg.setRegcourse(new ArrayList<Course>());           
		reg.setUser(u);										//add currentUser
		
		dao.addPlaylist(reg);
		u.getNewPlan().add(reg);

		return "coursePlanHome";
	}
	
	//add course to plan
	@RequestMapping(value = "/user/addCoursePlan.htm", method = RequestMethod.GET)
	public String courseToPlanGET(HttpServletRequest request, RegisterDao dao) {	
		HttpSession session = request.getSession();
		
		
		int cid = Integer.parseInt(request.getParameter("courseid"));	
		session.setAttribute("newcou", cid);
		List<RegisterPlan> rp = dao.displayPlaylists();
		session.setAttribute("currplaylists", rp);
		return "courseToPlan";
		
	}	
	
	//add course to plan
	@RequestMapping(value = "/user/addCoursePlan.htm", method = RequestMethod.POST)
	public String courseToPlanPOST(HttpServletRequest request, RegisterDao dao, CourseDao cdao) {	
		
		HttpSession session = request.getSession();
		int cid = (Integer)session.getAttribute("newcou");
		Course cur = cdao.getCourse(cid);
		int pid = Integer.parseInt(request.getParameter("selectplanlist"));	
		RegisterPlan reli = dao.findPlan(pid);	
		reli.getRegcourse().add(cur);	
		dao.updatePlaylist(reli);
		return "courseToPlan";
		
	}
	
	//view plan detail
	@RequestMapping(value = "/user/viewPlan.htm", method = RequestMethod.GET)
	public String viewPlaylist(HttpServletRequest request, RegisterDao dao) {		
		
		int reliid = Integer.parseInt(request.getParameter("planid"));
		RegisterPlan reg = dao.findPlan(reliid);
		List<Course> courseList = reg.getRegcourse();
		
		HttpSession session = request.getSession(false); 		
		session.setAttribute("playlist", reg);		
		session.setAttribute("courseList",courseList);
		
		return "finalPage";
	}	
	
	//show all the Plan	
	@RequestMapping(value = "/viewPlan.htm", method = RequestMethod.GET)
	public String planList(HttpServletRequest request, ModelMap map) {	
		HttpSession session = request.getSession(); 	
		User user = (User) session.getAttribute("currentUser");
		List<RegisterPlan> plan = user.getNewPlan(); 
		session.setAttribute("userPlan", plan);
		if(user!=null){
		return "RegisterPlan";
		}else {
			map.addAttribute("errorMessage", "Sorry, Something Wrong!");
			return "ErroePage";
		}
	}

}