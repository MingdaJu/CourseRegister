package neu.coe.info.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//import neu.coe.info.dao.DAOFactory;
import neu.coe.info.dao.CourseDao;
import neu.coe.info.pojo.Semester;
import neu.coe.info.pojo.RegisterPlan;
import neu.coe.info.pojo.Course;

@Controller
public class CourseController {

	
	public CourseController(){
		
	}
	
	//semester list
	@RequestMapping(value="/mingda.htm", method = RequestMethod.GET)
	public String showAllSemesters(HttpServletRequest request ,CourseDao dao){
		List<Semester> semlist = dao.showAllSemesters();
		HttpSession session = request.getSession();
		session.setAttribute("semli", semlist);
		return "SemesterList";
	}
	
	//view all semester
	@RequestMapping(value="/mingda/view.htm", method = RequestMethod.GET)
	public String viewSemest(HttpServletRequest request, CourseDao dao, ModelMap map){
		
		int semesterid = Integer.parseInt(request.getParameter("semid"));
		Semester semester = dao.getSemesterId(semesterid);
		
		HttpSession session = request.getSession();
		session.setAttribute("semesterid", semesterid);
		session.setAttribute("semester", semester);
		if(semester!=null){
		return "CourseDetail";
		}
		else {
			map.addAttribute("errorMessage", "Sorry, Something Wrong!");
			return "ErroePage";
		}
	}
	
	//add semester success
	@RequestMapping(value="/mingda/addsuccess.htm", method = RequestMethod.GET)
	public String addsem(HttpServletRequest request){			
		return "AddSemester";
	}
	
	//add semester
	@RequestMapping(value="/mingda/add.htm", method = RequestMethod.GET)
	public String addSemest(HttpServletRequest request){			
		
		return "redirect:/mingda.htm?";
	}
	
	//add semester
	@RequestMapping(value="/mingda/add.htm", method = RequestMethod.POST)
	public String addSemesPOST(HttpServletRequest request, CourseDao dao, ModelMap map){		

		String semestertname = request.getParameter("semname");
		Semester semester = new Semester();
		semester.setSemestername(semestertname);
		semester.setCourseList(new ArrayList<Course>());
		dao.addSemest(semester);	
		
		return "redirect:/mingda.htm?";
		
	}
	
	//jump to count page
	@RequestMapping(value="/mingda/jumpcount.htm", method = RequestMethod.GET)
	public String CourseCount(HttpServletRequest request, ModelMap map){
		int se = Integer.parseInt(request.getParameter("semid"));
		HttpSession session = request.getSession();
		session.setAttribute("semesterid", se);
		
		return "AddCourseCount";
		
	}
	
	//get add courses num
	@RequestMapping(value="/mingda/addnum.htm", method = RequestMethod.GET)
	public String handlenumberForm(HttpServletRequest request){
		int semmid = Integer.parseInt(request.getParameter("sseeid"));
		HttpSession session = request.getSession();
		session.setAttribute("semmid", semmid);
		String bookNumber = request.getParameter("count");
		int bn = Integer.valueOf(bookNumber);
		request.setAttribute("count", bn);
		
		return "AddCourses";
	}
	
	//get add courses num
	@RequestMapping(value="/mingda/addnum.htm", method = RequestMethod.POST)
	public String handlenumber(HttpServletRequest request){
		HttpSession session = request.getSession();
		session.getAttribute("semmid");
		request.getAttribute("count");
		
		return "AddCourses";
	}
	
	
	// add course success
	@RequestMapping(value="/mingda/couAdd.htm", method = RequestMethod.GET)
	public String addCouGET(HttpServletRequest request){		
		int seemid = Integer.parseInt(request.getParameter("sseeid"));
		HttpSession session = request.getSession();
		session.setAttribute("sseeid", seemid);
		
		return "AddSuccess";

	}
	
	//add courses
	@RequestMapping(value="/mingda/couAdd.htm", method = RequestMethod.POST)
	public String addCouPOST(HttpServletRequest request, CourseDao dao){
		HttpSession session = request.getSession();
		int semesterid = (Integer)session.getAttribute("semesterid"); //get primary key from semester
		
		String[] coursename = request.getParameterValues("coursename"); //get array of courses added
		String[] credit = request.getParameterValues("credit");
		String[] professor = request.getParameterValues("professor");
		String[] location = request.getParameterValues("location");
		String[] crn = request.getParameterValues("crn");

		Semester semid = dao.getSemesterId(semesterid);		
		
		for(int i=0;i<coursename.length;i++) {     //count how many courses added
			Course course = new Course();
			course.setSemester(semid);             //set foreign key
			course.setCoursename(coursename[i]);
			course.setCredit(credit[i]);
			course.setProfessor(professor[i]);
			course.setLocation(location[i]);
			course.setCrn(crn[i]);
			dao.addCourse(course);
	
		}

		return "AddSuccess";	
	
	}	
	
	//delete semester
	@RequestMapping(value="/mingda/delete.htm", method = RequestMethod.GET)
	public String delSem(HttpServletRequest request, CourseDao dao){	
		int seemm = Integer.parseInt(request.getParameter("semid"));
		dao.delSemes(seemm);
		
		return "redirect:/mingda.htm?";
	}
	
	//delete course
	@RequestMapping(value="/mingda/coursedel.htm", method = RequestMethod.GET)
	public String deleteCla(HttpServletRequest request, CourseDao dao){		
		int couid = Integer.parseInt(request.getParameter("courseid"));
		int semid = Integer.parseInt(request.getParameter("semesdel"));
		HttpSession session = request.getSession();
		session.setAttribute("semesdel", semid);

		dao.delCourse(couid);		
		return "DeleteClass";

	}
	

	//update course
	@RequestMapping(value="/mingda/couUpdate.htm", method = RequestMethod.GET)
	public String updateCourse(HttpServletRequest request, Model model, CourseDao dao){
		
		HttpSession session = request.getSession();
		int semid = Integer.parseInt(request.getParameter("semesupd"));
		int courseidd = Integer.parseInt(request.getParameter("courseid"));	
		session.setAttribute("semesupd", semid);
		Course thec = dao.getCourse(courseidd);		
		model.addAttribute("updatecourse",thec);
		
		return "update-course";
	}
	
	//save update course
	@RequestMapping(value="/mingda/cousave.htm", method = RequestMethod.POST)
	public String saveCourse(HttpServletRequest request, Course thec, CourseDao dao) {	
		dao.update(thec);
		
		return "redirect:/mingda.htm?";
	}
	
	//update semester
	@RequestMapping(value="/mingda/update.htm", method = RequestMethod.GET)
	public String updateSemester(HttpServletRequest request, Model model, CourseDao dao){
		int semesterid = Integer.parseInt(request.getParameter("semid"));
		Semester thesemester = dao.getSemesterId(semesterid);
		model.addAttribute("updatesemester",thesemester);
		
		return "update-semester";
	}
	

	//save semester
	@RequestMapping(value="/mingda/save.htm", method = RequestMethod.POST)
	public String saveSemester(HttpServletRequest request, Semester semester, CourseDao dao) {	
		dao.updateSemester(semester);
		return "redirect:/mingda.htm?";
		
	}
}