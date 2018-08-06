/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modele.Writer;

public class searchWords extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        ArrayList<Writer> Writers = new ArrayList();
        Writer w1 = new Writer(1, "Amr");
        Writer w2 = new Writer(2, "Ahmed");
        Writer w3 = new Writer(3, "Abas");
        Writer w4 = new Writer(4, "Mazen");
        Writer w5 = new Writer(5, "Maradona");
        Writer w6 = new Writer(6, "Maysa");
        Writer w7 = new Writer(7, "Joodi");
        Writer w8 = new Writer(8, "juel");
        Writer w9 = new Writer(9, "Fares");
        Writer w10 = new Writer(10, "Faroo");
        Writer w11 = new Writer(11, "Marwa");
        Writer w12 = new Writer(12, "Madona");
        
        Writers.add(w1);
        Writers.add(w2);
        Writers.add(w3);
        Writers.add(w4);
        Writers.add(w5);
        Writers.add(w6);
        Writers.add(w7);
        Writers.add(w8);
        Writers.add(w9);
        Writers.add(w10);
        Writers.add(w11);
        Writers.add(w12);

        PrintWriter out = response.getWriter();
        String letter = request.getParameter("letter");
       if(!letter.equals("")){ 
        for(Writer w : Writers){
        
        if(w.getName().startsWith(letter)){
        
        out.print(w.getName());
        out.print("<p>");
        }
        
        }
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
