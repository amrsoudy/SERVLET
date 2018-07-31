/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modele.CD;

/**
 *
 * @author AMR
 */
public class test extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/pdf");
        OutputStream out = response.getOutputStream();
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, out);
            document.open();
            HttpSession session = request.getSession();
            Vector panier = (Vector) session.getAttribute("shopingcarte");
            if (panier == null) {

                document.add(new Paragraph("votre panier est vide "));

            } else {

                Paragraph titre = new Paragraph("Facture ", FontFactory.getFont(FontFactory.TIMES, 18, Font.BOLDITALIC, BaseColor.BLUE));
                titre.setAlignment(Element.ALIGN_CENTER);
                titre.setSpacingAfter(30f);
                document.add(titre);

                float prixTotal = 0;

                PdfPTable table = new PdfPTable(3);
                table.addCell(new Paragraph("Produit"));
                table.addCell(new Paragraph("prix"));
                table.addCell(new Paragraph("Quantity"));

                for (int i = 0; i < panier.size(); i++) {
                    CD a = (CD) panier.elementAt(i);

                    table.addCell("  " + a.getAlbum() + "  ");
                    table.addCell("  " + a.getPrice() + "  ");
                    table.addCell("  " + a.getQuantity() + "  ");
                    prixTotal += (a.getPrice() * a.getQuantity());

                }
                double prixTotalTTC = prixTotal + (prixTotal * 0.05);
                document.add(table);
                Paragraph paraprixTotal = new Paragraph("prix total est   :" + prixTotal);
                document.add(paraprixTotal);
                Paragraph paraprixTotalafterTTC = new Paragraph("prix total est   :" + prixTotalTTC);
                document.add(paraprixTotalafterTTC);
            }
            document.close();
        } catch (DocumentException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
