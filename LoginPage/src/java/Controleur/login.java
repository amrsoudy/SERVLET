package Controleur;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.RequestDispatcher;

public class login extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String _username = request.getParameter("UserName");
            String _password = request.getParameter("PWD");
            String _l = request.getParameter("lang");
            String Destiation = "";
            try {
                if (_username != null && _password != null) {

                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
                    String Query = "select * from USERS where USERNAME = ? AND PASSWORD = ? ";
                    PreparedStatement psm = conn.prepareStatement(Query);
                    psm.setString(1, _username);
                    psm.setString(2, _password);
                    ResultSet rs = psm.executeQuery();

                    if (rs.next()) {
                        if (_l != null && _l.equals("Fr")) {

                            Destiation = "welcome.jsp";
                        } else if (_l.equals("En")) {

                            Destiation = "welcomeEn.jsp";

                        }

                        //when we use forwored we create object that in clude all request and response 
                        RequestDispatcher dispatch = request.getRequestDispatcher(Destiation);
                        dispatch.forward(request, response);
                    } else {
                        RequestDispatcher dispatch = request.getRequestDispatcher("Faild.jsp");

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
