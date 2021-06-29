/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.moviedao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pojo.moviepojo;

/**
 *
 * @author jumin
 */
public class moviecontroller extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String optionValue = request.getParameter("option");
        HttpSession session = request.getSession();
        processRequest(optionValue, session, request, response);
       
        
    }
    
        public void processRequest(String Option, HttpSession session, HttpServletRequest request, HttpServletResponse response) {

        RequestDispatcher requestDispatcher;
        if (Option.equalsIgnoreCase("add")) {
            requestDispatcher = getServletContext().getRequestDispatcher("/movieaddnew.jsp");
            try {
                requestDispatcher.forward(request, response);
            } catch (ServletException | IOException ex) {
                System.out.println(ex);
            }

        } else if (Option.equalsIgnoreCase("browse")) {
            requestDispatcher = getServletContext().getRequestDispatcher("/moviesearch.jsp");
            try {
                requestDispatcher.forward(request, response);
            } catch (ServletException | IOException ex) {
               System.out.println(ex);
            }

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

          RequestDispatcher requestDispatcher;
        PrintWriter out = response.getWriter();

        String option = request.getParameter("option");

        if (option.equalsIgnoreCase("add")) {

            moviepojo userData = new moviepojo();

            String title = request.getParameter("title");
            String actor = request.getParameter("actor");
            String actress = request.getParameter("actress");
            String year = request.getParameter("year");
            String genre = request.getParameter("genre");
            
      

            moviedao userObj = new moviedao();
            int result = userObj.addUser(title, actor, actress, year, genre);

            if (result == 1) {
                userData.setTitle(title);
                userData.setActor(actor);
                userData.setActress(actress);
                userData.setYear(year);
                userData.setGenre(genre);
                
                request.setAttribute("userInstance", userData);
                requestDispatcher = getServletContext().getRequestDispatcher("/movieaddsuccess.jsp");
                try {
                    requestDispatcher.forward(request, response);
                } catch (ServletException | IOException ex) {
                    out.println(ex);
                }

            } else {
                requestDispatcher = request.getRequestDispatcher("/movieerror.jsp");
                requestDispatcher.forward(request, response);
            }

        } else if (option.equalsIgnoreCase("browse")) {

            String searchValue = request.getParameter("keyword");
            String searchparam = request.getParameter("type");

            System.out.println(searchparam + " "+searchValue);
            moviedao searchObj = new moviedao();
            List<moviepojo> searchedUser= searchObj.searchUser(searchValue, searchparam);

            if (searchedUser.isEmpty()) {
                requestDispatcher = getServletContext().getRequestDispatcher("/movieerror.jsp");
                try {
                    requestDispatcher.forward(request, response);
                } catch (ServletException | IOException ex) {
                    out.println(ex);
                }

            } else if (!searchedUser.isEmpty()) {
                request.setAttribute("searchedUsers", searchedUser);
                requestDispatcher = getServletContext().getRequestDispatcher("/movieresult.jsp");
                try {
                    requestDispatcher.forward(request, response);
                } catch (ServletException | IOException ex) {
                    out.println(ex);
                }

            }
        }
    }
}
