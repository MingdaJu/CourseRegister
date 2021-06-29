/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neu.coe.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import neu.coe.pojo.goods;
import neu.coe.pojo.goodscart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author jumin
 */
@Controller
public class cartController {
    @RequestMapping(value="/cart.htm", method=RequestMethod.GET)
    protected ModelAndView def(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ModelAndView mv = null; 
        response.setContentType("text/html");
        HttpSession session = request.getSession();
        goodscart products = (goodscart) session.getAttribute("goodscart");
        goodscart updatedCart = (goodscart) session.getAttribute("products");
        String pages = request.getParameter("option");
        switch (pages) {
            case"cart":
           session.setAttribute("products", products);
           mv = new ModelAndView("cart");          
          break;
          case"delete":
           
            String[] deleteList = request.getParameterValues("products");
            goodscart delete = new goodscart();

            for (int i = 0; i < deleteList.length; i++) {
                String d = deleteList[i];
                goods deletegoods = new goods();
                deletegoods.setGoodsName(d);
                delete.add(deletegoods);
            }

            updatedCart.delete(delete);
            session.setAttribute("products", updatedCart);                       
                mv = new ModelAndView("cart");
            }
            return mv;
      }
        
        
      }

      

