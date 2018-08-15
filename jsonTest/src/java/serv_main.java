/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.json.Json;
import javax.json.JsonObject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modele.persone;

/**
 *
 * @author 1795162
 */
public class serv_main extends HttpServlet {

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
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        int val1 = Integer.parseInt(request.getParameter("val1"));
        int val2 = val1 + 100;

        String x = "{\"fah\":" + val2 + "}";
        response.getWriter().print(x);
        ArrayList<persone> listPersone = new ArrayList();

        listPersone.add(new persone("Amr", "Seoudy", "30"));
        listPersone.add(new persone("Mazen", "Seoudy", "7"));
        listPersone.add(new persone("Fares", "Seoudy", "0"));

        Map<String, ArrayList> personMap = new HashMap<String, ArrayList>();

        ArrayList listNames = new ArrayList();
        ArrayList listprenom = new ArrayList();
        ArrayList listpreage = new ArrayList();

        for (persone p : listPersone) {
            listNames.add(p.getNom());
            listprenom.add(p.getPrenom());
            listpreage.add(p.getAge());

        }

        personMap.put("firstname", listNames);
        personMap.put("lastname", listprenom);
        personMap.put("age", listpreage);

//Map<String, String> personMap = new HashMap<String, String>();
//personMap.put("firstname", "Amr");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(personMap);
        response.getWriter().write(json);

        //"{\"firstName\": ["John", "Amr", "Ahmed"],"lastName": "Doe","id": 5566,fullName: function (i) { return this.firstName[i] + " " + this.lastName; } };";
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
