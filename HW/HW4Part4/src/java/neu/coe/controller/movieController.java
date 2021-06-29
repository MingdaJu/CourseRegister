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
import neu.coe.dao.*;
import neu.coe.pojo.Pojo;



/**
 *
 * @author jumin
 */
public class movieController extends AbstractController {
    public movieController() {

    }
    
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ModelAndView mav = null;       
        String pages = request.getParameter("page");
        moviedao dao = new moviedao();
        
        switch (pages) {
            case "home":
                String option = request.getParameter("option");
                if (option.equals("addMovie")) {
                    mav = new ModelAndView("addMovie");
                } else if (option.equals("browseMovies")) {
                    mav = new ModelAndView("searchMovie");
                }
                break;
                
            case "addmovie":
                String title = request.getParameter("title");
                String actor = request.getParameter("actor");
                String actress = request.getParameter("actress");
                String genre = request.getParameter("genre");
                String year = request.getParameter("year");
                dao.addMovie(title, actor, actress, genre, year);
                mav = new ModelAndView("addSuccess");
                break;
                
            case "searchmovie":
                String keyword = request.getParameter("keyword");
                String search = request.getParameter("search");
                List<Pojo> results = dao.searchMovies(search, keyword);
                mav = new ModelAndView("searchReply");
                mav.addObject("keyword", keyword);
                mav.addObject("result", results);                
                break;
                
            case "return":
                mav = new ModelAndView("movieHome");
                break;

        }
        return mav;
    }
    
}
