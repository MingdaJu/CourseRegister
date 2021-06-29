/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neu.coe.controller;

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

public class shopController  {

//@RequestMapping("view")
@RequestMapping(value="/shop.htm", method=RequestMethod.POST)

    protected ModelAndView abc(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
       ModelAndView mv = null; 
        HttpSession session = request.getSession();
              goodscart go = new goodscart();

        String[] total = request.getParameterValues("laptop");
        if (total == null) {
            total = request.getParameterValues("music");
        }
        if (total == null) {
            total = request.getParameterValues("book");
        }

        if (total != null) {
            
                for (int i = 0; i < total.length; i++) {
                    String one = total[i];
                    goods goods = new goods();
                    goods.setGoodsName(one);
                    go.add(goods);

                }
            session.setAttribute("goodscart", go);         
           mv = new ModelAndView("view");
        }
    return mv;
    
   }
    
    
}
