/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modele.ListPersones;
import modele.Persone;
import utilitaire.Utils;

/**
 *
 * @author 1795162
 */
public class srv_chercher extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        int number = 0;
        String dest = "";
        try {
            number = Integer.parseInt(request.getParameter("nombre"));

            ArrayList<Persone> ar = Utils.getInstance().getPersoneList(number);

            if (number > 0) {

                if (ar.size() > 0) {

                    request.setAttribute("ar", ar);

                    dest = "Rechercher.jsp";

                } else {
                    String Message = "Aucun information de votre nomber :   " + number;
                    request.setAttribute("Message", Message);

                    dest = "Rechercher.jsp";

                }

            } else {
                String Message = " votre nomber pas correct  :   " + number;
                request.setAttribute("Message", Message);

                dest = "Rechercher.jsp";

            }

        } catch (Exception ex) {
            String Message = " tu dois Ecrire number Svp  :   ";
            request.setAttribute("Message", Message);

            dest = "Rechercher.jsp";
        }

        RequestDispatcher disp = request.getRequestDispatcher(dest);
        disp.forward(request, response);
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
