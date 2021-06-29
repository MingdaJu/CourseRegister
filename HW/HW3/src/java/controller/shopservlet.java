package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import pojo.goods;
import pojo.goodscart;

public class shopservlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        goodscart products = (goodscart) session.getAttribute("goodscart");
        goodscart updatedCart = (goodscart) session.getAttribute("products");

        if (request.getParameter("option").equals("cart")) {
            try {
                session.setAttribute("products", products);
                RequestDispatcher requestdispatcher = request.getRequestDispatcher("shopcart.jsp");
                requestdispatcher.forward(request, response);
            } catch (ServletException | IOException ex) {
                out.println(ex);
            }
        } else if (request.getParameter("option").equals("delete")) {
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
            RequestDispatcher requestdispatcher = request.getRequestDispatcher("shopcart.jsp");
            requestdispatcher.forward(request, response);

        } else if (products == null) {
            out.println("Something Went Wrong");
        }

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
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
            try {
                for (int i = 0; i < total.length; i++) {
                    String one = total[i];
                    goods goods = new goods();
                    goods.setGoodsName(one);
                    go.add(goods);

                }

                session.setAttribute("goodscart", go);
                RequestDispatcher requestdispatcher = request.getRequestDispatcher("shopadd.jsp");
                requestdispatcher.forward(request, response);
            } catch (ServletException | IOException ex) {
                out.print(ex);
            }
        } else {
            RequestDispatcher requestdispatcher = request.getRequestDispatcher("shoperror.jsp");
            requestdispatcher.forward(request, response);
        }

    }

}
