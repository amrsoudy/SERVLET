/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
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
public class main_servelet extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String Action = request.getParameter("action");
        HttpSession session = request.getSession();
        if (session == null) {
            
            response.sendRedirect("error.html");
        }
        Vector buylist = (Vector) session.getAttribute("shopingcarte");
     
        
        if (!Action.equals("checkout")) {
            if (Action.equals("delete")) {
                
                int del = Integer.valueOf(request.getParameter("delindex"));
                buylist.removeElementAt(del);
                
            } else if (Action.equals("add")) {
                boolean match = false;
                CD acd = getCD(request);
                
                if (buylist == null) {
                    
                    buylist = new Vector();
                    buylist.addElement(acd);
                    
                } else {
                    
                    for (int i = 0; i < buylist.size(); i++) {
                        
                        CD cd = (CD) buylist.elementAt(i);
                        if (cd.getAlbum().equals(acd.getAlbum())) {
                            
                            cd.setQuantity(cd.getQuantity() + acd.getQuantity());
                            
                            buylist.setElementAt(cd, i);
                            match = true;
                            
                        }
                        
                    }
                    if (!match) {
                        
                        buylist.addElement(acd);
                        
                    }
                    
                }
                
            }
            session.setAttribute("shopingcarte", buylist);
            String url = "/index.jsp";
            ServletContext sc = getServletContext();
            RequestDispatcher rd = sc.getRequestDispatcher(url);
            rd.forward(request, response);
        } else if (Action.equals("checkout")) {
            
            float total = 0;
            for (int i = 0; i < buylist.size(); i++) {
                CD cd = (CD) buylist.elementAt(i);
                
                float price = cd.getPrice();
                int qty = cd.getQuantity();
                
                total += (price * qty);
                
            }
            
            total += 0.005;
            String amount = String.valueOf(total);
            int n = amount.indexOf(".");
            amount = amount.substring(0, n + 3);
            
            request.setAttribute("amount", amount);
            String url = "/checkout.jsp";
            RequestDispatcher rd = request.getRequestDispatcher(url);
            rd.forward(request, response);
            
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

    private CD getCD(HttpServletRequest request) {
        
        String mycd = request.getParameter("cd");
        String qty = request.getParameter("qty");
        
        StringTokenizer stk = new StringTokenizer(mycd, "|");
        String album = stk.nextToken();
        String artist = stk.nextToken();
        String country = stk.nextToken();
        String price = stk.nextToken();
        price.replace('$', ' ').trim();
        
        CD acd = new CD();
        acd.setAlbum(album);
        acd.setArtist(artist);
        acd.setCountry(country);
        acd.setPrice((new Float(price)).floatValue());
        acd.setQuantity(new Integer(qty).intValue());
        
        return acd;
        
    }
    
}
