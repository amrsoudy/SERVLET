/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 1795162
 */
public class ConvertServ extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {

            double x = Double.parseDouble(request.getParameter("valeurSaisir"));
            String ver = request.getParameter("choix");
           double conv=0;
            
            
           RequestDispatcher dispatch = request.getRequestDispatcher("ConvertTemp");
            dispatch.forward(request, response);

//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet ConvertServ</title>");
//            out.println("</head>");
//            out.println("<body>");
//            if (ver.equals("Celsius")) {
//
//                
//                out.println("<h1> " + x + " Fehrnhite ver  Celsius  est " + conv + "</h1>");
//
//            } else if (ver.equals("Fehrnhite")) {
//                conv = x * 3.4;
//                out.println("<h1> " + x + " Celsius ver  Fehrnhite  est " + conv + "</h1>");
//
//            }
//
//            out.println("</body>");
//            out.println("</html>");
       }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
