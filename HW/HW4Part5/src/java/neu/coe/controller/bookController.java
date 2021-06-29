/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neu.coe.controller;

import javax.servlet.http.*;
import org.springframework.web.servlet.*;
import org.springframework.web.servlet.mvc.*;
import java.util.List;
import javax.servlet.RequestDispatcher;
import neu.coe.dao.*;
import neu.coe.pojo.bookPojo;


/**
 *
 * @author jumin
 */
public class bookController extends AbstractController {
     public bookController() {

    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav = null;       
        String pages = request.getParameter("option");
        
        switch (pages) {
            case "booknumber":               
                String bookNumber = request.getParameter("count");
                int bn = Integer.valueOf(bookNumber);
                request.setAttribute("count", bn);
                mav = new ModelAndView("addbook");                
                break;
            case "addbooks":   
                String id[] = request.getParameterValues("ID");
                String isbn[] = request.getParameterValues("ISBN");
                String title[] = request.getParameterValues("Title");
                String author[] = request.getParameterValues("Author");
                String price[] = request.getParameterValues("Price");
                bookDao bookdao = new bookDao();
                bookdao.addBook(id,isbn, title, author, price);
                request.setAttribute("count", id.length);
                mav = new ModelAndView("booksuccess");
                break;
        }

        
        return mav;      
    }
}
