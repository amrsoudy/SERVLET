
package controleur;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modele.Composer;
import modele.ComposerData;

public class AutoComplete extends HttpServlet {
    private ComposerData compData = new ComposerData();
    private HashMap composers = compData.getComposers();
    private ServletContext context ;
   
    
    @Override
    public void init(ServletConfig config){
    this.context = config.getServletContext();
    
    
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String action = request.getParameter("action");
        String targetId =request.getParameter("id");
        StringBuffer sb = new StringBuffer();
        
        if(targetId != null){
        targetId = targetId.trim().toLowerCase();
        
        }else{
            context.getRequestDispatcher("/error.jsp").forward(request, response);
            
            }
        boolean nameAdded = false;
        if(action.equals("complete")){
        
        if(!targetId.equals("")){
        
        Iterator it = composers.keySet().iterator();
        
        while(it.hasNext()){
        String id = (String)it.next();
        Composer composer = (Composer)composers.get(id);
        
        
        if (composer.getFirstName().toLowerCase().startsWith(targetId)||composer.getLastName().toLowerCase().startsWith(targetId)
                || composer.getFirstName().toLowerCase().concat(" ").concat(composer.getLastName().toLowerCase()).startsWith(targetId))
                {
        
        sb.append("composer");
        sb.append("id"+composer.getId()+"</id>");
        sb.append("<firstName>"+composer.getFirstName()+"</firstName>");
        sb.append("<lastName>"+composer.getLastName()+"</lastName>");
        sb.append("</composer>");
        nameAdded = true;
        
        }
        
        }
        
        
        
        }
        if(nameAdded){
        
        response.setContentType("text/xml");
        response.setHeader("case", targetId);
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
