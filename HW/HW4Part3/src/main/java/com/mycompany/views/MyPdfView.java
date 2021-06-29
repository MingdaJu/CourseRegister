/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.views;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import java.util.Enumeration;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.view.document.AbstractPdfView;

/**
 *
 * @author jumin
 */
public class MyPdfView extends AbstractPdfView{
    protected void buildPdfDocument(Map<String, Object> map, Document doc, PdfWriter writer, HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        Paragraph t1 = new Paragraph("Email:");
        Paragraph p1 = new Paragraph(hsr.getParameter("email"));
        Paragraph t2 = new Paragraph("Password:");
        Paragraph p2 = new Paragraph(hsr.getParameter("password"));
        Paragraph t3 = new Paragraph("Repassword:");
        Paragraph p3 = new Paragraph(hsr.getParameter("repassword"));
        Paragraph t4 = new Paragraph("Gender:");
        Paragraph p4 = new Paragraph(hsr.getParameter("gender"));
        Paragraph t5 = new Paragraph("Country:");
        Paragraph p5 = new Paragraph(hsr.getParameter("country"));
        Paragraph t6 = new Paragraph("Hobby:");
        Paragraph p6 = new Paragraph(hsr.getParameter("hobby"));
        Paragraph t7 = new Paragraph("Address:");
        Paragraph p7 = new Paragraph(hsr.getParameter("address"));
        doc.add(t1);
        doc.add(p1);
        doc.add(t2);
        doc.add(p2);
        doc.add(t3);
        doc.add(p3);
        doc.add(t4);
        doc.add(p4);
        doc.add(t5);
        doc.add(p5);
        doc.add(t6);
        doc.add(p6);
        doc.add(t7);
        doc.add(p7);
    }
}
