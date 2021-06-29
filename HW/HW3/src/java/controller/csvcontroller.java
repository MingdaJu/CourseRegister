/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author jumin
 */
public class csvcontroller extends SimpleTagSupport {

    private String filename;

    @Override
    public void doTag() throws JspException {

        JspWriter out = getJspContext().getOut();
        try {
            JspFragment f = getJspBody();
            if (f != null) {
                f.invoke(out);
            }
            if (filename.equals("SalesOrder")) {
                try {
                    Class.forName("org.relique.jdbc.csv.CsvDriver");
                    Connection connection = DriverManager.getConnection("jdbc:relique:csv:/Users/jumin/OneDrive/Documents");
                    Statement statement = connection.createStatement();
                    ResultSet resultset = statement.executeQuery("SELECT * FROM " + filename);
                    out.println("<h4>Your File is: " + filename + ".csv</h4>");
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
                                + resultset.getString("RevisionNumber") + "<td>"
                                + resultset.getString("OrderDate") + "<td>"
                                + resultset.getString("DueDate") + "<td>"
                                + resultset.getString("ShipDate") + "<td>"
                                + resultset.getString("Status") + "<td>"
                                + resultset.getString("OnlineOrderFlag") + "<td>"
                                + resultset.getString("SalesOrderNumber") + "<td>"
                                + resultset.getString("PurchaseOrderNumber") + "<td>"
                                + resultset.getString("AccountNumber") + "<td>"
                                + resultset.getString("CustomerID") + "<td>"
                                + resultset.getString("SalesPersonID") + "<td>"
                                + resultset.getString("TerritoryID") + "<td>"
                                + resultset.getString("BillToAddressID") + "<td>"
                                + resultset.getString("ShipToAddressID") + "<td>"
                                + resultset.getString("ShipMethodID") + "<td>"
                                + resultset.getString("CreditCardID") + "<td>"
                                + resultset.getString("CreditCardApprovalCode") + "<td>"
                                + resultset.getString("CurrencyRateID") + "<td>"
                                + resultset.getString("SubTotal") + "<td>"
                                + resultset.getString("TaxAmt") + "<td>"
                                + resultset.getString("Freight") + "<td>"
                                + resultset.getString("TotalDue") + "<td>"
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

            } else {
                out.println("<p>No Record</p>");
            }
        } catch (java.io.IOException ex) {
            throw new JspException(ex);
        }

    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
