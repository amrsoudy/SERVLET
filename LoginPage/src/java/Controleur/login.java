package Controleur;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.Alert;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

public class login extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Product product1 = new Product("product1", 20.5);
        Product product2 = new Product("product2", 30.5);
        Product product3 = new Product("product3", 40.5);
        Product product4 = new Product("product4", 50.5);
        Product product5 = new Product("product5", 60.5);
        Product product6 = new Product("product6", 70.5);

        ArrayList<Product> ar = new ArrayList();
        ar.add(product1);
        ar.add(product2);
        ar.add(product3);
        ar.add(product4);
        ar.add(product5);
        ar.add(product6);

        ServletContext app = getServletConfig().getServletContext();
        
        app.setAttribute("ar", ar);
        

        try (PrintWriter out = response.getWriter()) {
            String _username = request.getParameter("UserName");
            String _password = request.getParameter("PWD");
            String _l = request.getParameter("lang");
            String Destiation = "";
            try {
                if (_username != null && _password != null) {

                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/DBAmr", "amr", "Secret");
                    System.out.println("Connected ");
                    String Query = "select * from USERS where USERNAME = ? AND PASSWORD = ? ";
                    PreparedStatement psm = conn.prepareStatement(Query);
                    psm.setString(1, _username);
                    psm.setString(2, _password);
                    ResultSet rs = psm.executeQuery();

                    if (rs.next()) {

                        HttpSession session = request.getSession();
                        session.setAttribute("_username", _username);

                        if (_l != null && _l.equals("Fr")) {

                            Destiation = "/WEB-INF/welcome.jsp";
                        } else if (_l.equals("En")) {

                            Destiation = "/WEB-INF/welcomeEn.jsp";

                        }

                        //when we use forwored we create object that in clude all request and response 
                        RequestDispatcher dispatch = request.getRequestDispatcher(Destiation);
                        dispatch.forward(request, response);
                    } else {
                        RequestDispatcher dispatch = request.getRequestDispatcher("/WEB-INF/Faild.jsp");

                        dispatch.forward(request, response);

                    }

                } else {
                    out.println("Empty UserName or Password");

                }
            } catch (Exception ex) {
                out.print("Exception : " + ex.getMessage());
                ex.printStackTrace();

            }

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
