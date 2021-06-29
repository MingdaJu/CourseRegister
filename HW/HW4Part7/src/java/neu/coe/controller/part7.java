package neu.coe.controller;


import neu.coe.utility.utility;
import org.springframework.web.servlet.mvc.*;
import org.springframework.stereotype.Controller;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



    @Controller
    @RequestMapping("/part7")
    public class part7 {
         ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
         utility utility = context.getBean("Utility", utility.class);
         @GetMapping("/home")
         public String showMessage(Model mod){
         mod.addAttribute("Utility",utility);
         return "home";
         
         }
   
}
