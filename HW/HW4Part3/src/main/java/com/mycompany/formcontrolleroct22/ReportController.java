/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.formcontrolleroct22;

import com.mycompany.pojo.User;
import com.mycompany.views.MyPdfView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author jumin
 */
public class ReportController extends AbstractController {
    
  public ReportController() {
      
       
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
      View view = new MyPdfView();
        return new ModelAndView(view);
    }
    
}
