/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author 1795162
 */
public class AdminSer extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String _username = request.getParameter("UserName1");
            String _password = request.getParameter("PWD1");
            String _age = request.getParameter("age1");
            String _email = request.getParameter("email1");

            int x = Utils.addUser(_username, _password, _age, _email);

            request.setAttribute("x", x);
            //to know which page demande cette  servlet    --Amr
            String referer = new URI(request.getHeader("referer")).getPath();
            // JOptionPane.showMessageDialog(null, referer);
            String[] uriNames = referer.split("/");
            String fromPageJsp = uriNames[uriNames.length - 1];
            JOptionPane.showMessageDialog(null, fromPageJsp);
            System.out.println(fromPageJsp);
            String destination="";

            if (fromPageJsp.equals("Admin.jsp")) {
                destination = "Admin.jsp";

            } else if (fromPageJsp.equals("AdminEN.jsp")) {
                destination = "AdminEN.jsp";

            }
          
             RequestDispatcher dispatch = request.getRequestDispatcher(destination);
            dispatch.forward(request, response);

            /* TODO output your page here. You may use following sample code. */
        } catch (URISyntaxException ex) {
            Logger.getLogger(AdminSer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminSer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminSer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminSer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminSer.class.getName()).log(Level.SEVERE, null, ex);
        }
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

//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//
//            String _username = request.getParameter("UserName1");
//            String _password = request.getParameter("PWD1");
//            String _age = request.getParameter("age1");
//            String _email = request.getParameter("email1");
//
//       
//
//                Class.forName("org.apache.derby.jdbc.ClientDriver");
//                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
//                String Query = "INSERT INTO USERS VALUES ('joodi','0000',20,'dddddd');";
//                PreparedStatement pstm = conn.prepareStatement(Query);
////                pstm.setString(1, _username);
////                pstm.setString(2, _password);
////                pstm.setString(3, _age);
////                pstm.setString(4, _email);
//
//                int x = pstm.executeUpdate();
//                System.out.println("joodi added ");
//
//                out.println("<!DOCTYPE html>");
//                out.println("<html>");
//                out.println("<head>");
//                out.println("<title>Servlet NewServlet</title>");
//                out.println("</head>");
//                out.println("<body>");
//                out.println("<h1> " +_username + "  Added </h1>");
//                out.println("</body>");
//                out.println("</html>");
//
//           
//
//        
//    }   catch (ClassNotFoundException ex) {
//            Logger.getLogger(AdminServ.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(AdminServ.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        doGet(request, response);
//    }
