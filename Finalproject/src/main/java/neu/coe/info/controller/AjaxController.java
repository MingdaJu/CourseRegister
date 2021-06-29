package neu.coe.info.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//import neu.coe.info.dao.DAOFactory;
import neu.coe.info.dao.UserDAO;
import neu.coe.info.pojo.User;


@Controller
public class AjaxController {
	
	public AjaxController(){
		
	}
	
	//Check whether username is vaild from database
	@RequestMapping(value = "/check.htm", method = RequestMethod.POST)
	@ResponseBody
	public String checkUserNameExisted(HttpServletRequest request, UserDAO userdao) {
		String username = request.getParameter("username");
	
		User u = userdao.get(username);
		if (u == null) {
			return "Vaild UserName!";
		} else {
			return "UserName Has Been Used!";
		}
	}
	
}