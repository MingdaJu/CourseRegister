/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jumin
 */
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.*;
import javax.servlet.http.*;
import org.relique.jdbc.csv.CsvDriver;

public class part4 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("fileName");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>HW2 Part4 Read CSV</title>");
        out.println("</head>");
        out.println("<body>");
        try {
            Class.forName("org.relique.jdbc.csv.CsvDriver");
            Connection connection = DriverManager.getConnection("jdbc:relique:csv:/Users/jumin/OneDrive/Documents");
            Statement statement = connection.createStatement();
            ResultSet resultset = statement.executeQuery("SELECT * FROM " + name);
            out.println("<h4>Your File is: " + name + ".csv</h4>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<th>SalesOrderID</th>"
                    + "<th>RevisionNumber</th>"
                    + "<th>OrderDate</th>"
                    + "<th>DueDate</th>"
                    + "<th>ShipDate</th>"
                    + "<th>Status</th>"
                    + "<th>OnlineOrderFlag</th>"
                    + "<th>SalesOrderNumber</th>"
                    + "<th>PurchaseOrderNumber</th>"
                    + "<th>AccountNumber</th>"
                    + "<th>CustomerID</th>"
                    + "<th>SalesPersonID</th>"
                    + "<th>TerritoryID</th>"
                    + "<th>BillToAddressID</th>"
                    + "<th>ShipToAddressID</th>"
                    + "<th>ShipMethodID</th>"
                    + "<th>CreditCardID</th>"
                    + "<th>CreditCardApprovalCode</th>"
                    + "<th>CurrencyRateID</th>"
                    + "<th>SubTotal</th>"
                    + "<th>TaxAmt</th>"
                    + "<th>Freight</th>"
                    + "<th>TotalDue</th>"
                    + "<th>Comment</th>"
                    + "<th>ModifiedDate</th>");

            while (resultset.next()) {
                out.println("<tr>");
                out.println("<td>" + resultset.getString("SalesOrderID") + "<td>" 
                        + resultset.getString("RevisionNumber")+ "<td>" 
                        + resultset.getString("OrderDate") + "<td>" 
                        + resultset.getString("DueDate")+ "<td>" 
                        + resultset.getString("ShipDate") + "<td>" 
                        + resultset.getString("Status")+"<td>" 
                        + resultset.getString("OnlineOrderFlag") + "<td>" 
                        + resultset.getString("SalesOrderNumber")+ "<td>" 
                        + resultset.getString("PurchaseOrderNumber") + "<td>" 
                        + resultset.getString("AccountNumber") + "<td>" 
                        + resultset.getString("CustomerID") + "<td>" 
                        + resultset.getString("SalesPersonID")+ "<td>" 
                        + resultset.getString("TerritoryID") + "<td>" 
                        + resultset.getString("BillToAddressID")+ "<td>" 
                        + resultset.getString("ShipToAddressID") + "<td>" 
                        + resultset.getString("ShipMethodID") + "<td>" 
                        + resultset.getString("CreditCardID")+ "<td>" 
                        + resultset.getString("CreditCardApprovalCode") + "<td>" 
                        + resultset.getString("CurrencyRateID") + "<td>" 
                        + resultset.getString("SubTotal") + "<td>" 
                        + resultset.getString("TaxAmt") + "<td>" 
                        + resultset.getString("Freight") + "<td>" 
                        + resultset.getString("TotalDue")+ "<td>" 
                        + resultset.getString("Comment") + "<td>" 
                        + resultset.getString("ModifiedDate"));

            }
            out.println("</tr>");
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");

            resultset.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            out.println(e.toString());
        }
    }

}
