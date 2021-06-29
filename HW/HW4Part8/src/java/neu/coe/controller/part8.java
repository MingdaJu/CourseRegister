package neu.coe.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import neu.coe.pojo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jumin
 */
@Controller
@RequestMapping(value = "/get.htm", method = RequestMethod.POST)
public class part8 {

    @Autowired
    private Message message;

    @GetMapping("/get")
    public ModelAndView showMessage(Model model) {
        model.addAttribute("part8", message);
        return new ModelAndView("get");
    }

}
