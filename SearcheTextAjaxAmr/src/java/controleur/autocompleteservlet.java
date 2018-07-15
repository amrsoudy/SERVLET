/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 *
 * @author 1795162
 */
public class autocompleteservlet extends HttpServlet {

    private ServletContext context;
private ComposerData compData = new ComposerData();
    private HashMap Hashcomposers = compData.getComposers();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String action = request.getParameter("action");
        String targedId = request.getParameter("id");

        StringBuffer sb = new StringBuffer();

        if (targedId != null) {

            targedId = targedId.trim().toLowerCase();

        } else {

            context.getRequestDispatcher("/error.jsp").forward(request, response);

        }
        boolean namesAdded = false;
        if (action.equals("complete")) {
            if (!targedId.equals("")) {
                System.out.println(targedId);
                Iterator it = Hashcomposers.keySet().iterator();
                if (it.hasNext()) {

                    String id = (String) it.next();
                    System.out.println(id);
                    Composer composer = (Composer) Hashcomposers.get(id);
                    System.out.println(composer);
                    if (composer.getFirstName().toLowerCase().startsWith(targedId) || composer.getLastName().toLowerCase().startsWith(targedId)
                            || composer.getFirstName().toLowerCase().concat(" ").concat(composer.getLastName().toLowerCase()).startsWith(targedId)) {

                        sb.append("<composer>");
                        sb.append("<id>" + composer.getId() + "</id>");
                        sb.append("<firstName>" + composer.getFirstName() + "</firstName>");
                        sb.append("<lastName>" + composer.getLastName() + "</lastName>");
                        sb.append("</composer>");
                        namesAdded = true;
                    }

                }
            }
            
            if(namesAdded){
            
            response.setContentType("text/xml");
            response.setHeader("Cache-Control", "no-cache");
            response.getWriter().write("<composers>"+sb.toString()+"</composers>");
            }
            else{
           response.setStatus(HttpServletResponse.SC_NO_CONTENT);
            
           
            }

        }
        
        
        if(action.equals("lookup")){
        
        if((targedId !=null )&& Hashcomposers.containsKey(targedId.trim())){
        
        request.setAttribute("composer",Hashcomposers.get(targedId));
        context.getRequestDispatcher("/composer.jsp").forward(request, response);
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
