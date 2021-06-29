
import java.io.*;
import java.text.*;
import java.util.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/part5")
public class part5 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("file");

        out.println("<html>");
        out.println("<head>");
        out.println("<title>HW2 Part5 Read Excel</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h4>Your file is: " + name + "</h4>");

        FileInputStream fileinputstream = new FileInputStream(new File("/Users/jumin/OneDrive/桌面/" + name));
        HSSFWorkbook workbook = new HSSFWorkbook(fileinputstream);

        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {

            out.println("<table>");
            HSSFSheet sheet = workbook.getSheetAt(i);

            Iterator<Row> rowiterator = sheet.iterator();
            while (rowiterator.hasNext()) {
                Row row = rowiterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                out.println("<tr>" + "</tr>");
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();

                    if (cell.getCellTypeEnum() == CellType.STRING) {

                        out.print("<td>" + cell.getStringCellValue() + "</td>");

                    } else if (cell.getCellTypeEnum() == CellType.NUMERIC) {

                        if (HSSFDateUtil.isCellDateFormatted(cell)) {
                            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                            Date date = cell.getDateCellValue();
                            out.print("<td>" + sdf.format(date) + "</td>");
                        } else {
                            double profit = cell.getNumericCellValue();
                            DecimalFormat decimal = new DecimalFormat();
                            out.print("<td>" + decimal.format(profit) + "</td>");
                        }
                    }
                }
            }
        }
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}
