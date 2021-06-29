/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.bookdao;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.SQLException;
import java.util.*;
import pojo.bookpojo;

/**
 *
 * @author jumin
 */
public class bookcontroller extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        String option = request.getParameter("option");
        

        if (option.equals("booknumber")) {
            try {
                String bookNumber = request.getParameter("count");
                int bn = Integer.valueOf(bookNumber);
                request.setAttribute("count", bn);
                RequestDispatcher requestdispatcher = request.getRequestDispatcher("/addbook.jsp");
                requestdispatcher.forward(request, response);
            } catch (NumberFormatException e) {
                RequestDispatcher requestdispatcher = request.getRequestDispatcher("/bookerror.jsp");
                requestdispatcher.forward(request, response);
                System.out.println(e);
            }
        }

        if (option.equals("addbooks")) {
          
            
            String id[] = request.getParameterValues("ID");
            String isbn[] = request.getParameterValues("ISBN");
            String title[] = request.getParameterValues("Title");
            String author[] = request.getParameterValues("Author");
            String price[] = request.getParameterValues("Price");

           
            try {
                bookdao bookdao = new bookdao();
                bookdao.addBook(id,isbn, title, author, price);
                request.setAttribute("count", id.length);
                RequestDispatcher reqBookSuccessPage = request.getRequestDispatcher("booksuccess.jsp");
                reqBookSuccessPage.forward(request, response);
                
                
            } catch (ServletException | IOException ex) {
                RequestDispatcher reqAlert = request.getRequestDispatcher("/bookerror.jsp");
                reqAlert.forward(request, response);
                System.out.println(ex);

            } catch (ClassNotFoundException e) {
                System.out.println(e);

            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }
}
