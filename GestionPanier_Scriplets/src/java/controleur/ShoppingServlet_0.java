/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controleur;

import java.io.IOException;
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
 * @author Toshiba
 */
public class ShoppingServlet_0 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

    //on récupère la session de la requête
    HttpSession session = request.getSession();
    if (session == null) {
      response.sendRedirect("http://localhost:82/error.html");
    }
    
    //on essaye de récupérer le panier 
    //s'il n'existe pas l'objet retourné est nul
    Vector buylist = (Vector)session.getAttribute("shoppingcart");
    
    //on récupère l'action reçue avec la requête 
    //pour savoir quoi faire (Ajout, supp, checkout)
    String action = request.getParameter("action");
    
    if (!action.equals("CHECKOUT")) {
        
        //si clic sur supprimer
      if (action.equals("DELETE")) {
          
        //on récupère l'indice de l'item à supprimer  
        String del = request.getParameter("delindex");
        
        //on supprime l'item du panier
        int d = (new Integer(del)).intValue();
        buylist.removeElementAt(d);
        
        // si clic sur ajouter au panier
      } else if (action.equals("ADD")) {
          
       //booleen qui va être utilisé pour vérifier si l'item est déjà 
       //dans le panier
        boolean match=false;
        CD aCD = getCD(request);
        
        //si panier inexistant on va le créer(cas du 1er item à ajouter)
        if (buylist==null) {
            
          //on crée le panier
          buylist = new Vector();
          
          //on ajoute le premier CD
          buylist.addElement(aCD);
          
         //si le panier existe déjà (buylist non null) 
        } else { 
            
          //on vérifie si le CD est déjà dans le panier?
          //pour ne pas l'ajouter une autre fois 
          for (int i=0; i< buylist.size(); i++) {
            
            //on récupère l'item à la position i
            CD cd = (CD) buylist.elementAt(i);
            
            // si on trouve l'item dans le panier
            if (cd.getAlbum().equals(aCD.getAlbum())) {

               //on va modifier la quantité en lui ajoutantant la
               // nouvelle quantité
              cd.setQuantity(cd.getQuantity()+aCD.getQuantity());

              //on replace l'item dans le panier
              buylist.setElementAt(cd,i);

              //on active la variable qui montre qu'on a trouvé l'item
              //dans le panier
              match = true;
            } //end of if name matches
          } // end of for

          //si match est à false, donc item non déjà dans le panier,
          //on va devoir l'ajouter
          if (!match)
              //on ajoute l'item au panier
            buylist.addElement(aCD);
        }
      }

      //suuite à l'ajout ou à la suppression on doit RÉ-ATTACHER à la session
      //à la place de l'ancien
      session.setAttribute("shoppingcart", buylist);

      //et on redirige la requête vers la page EShop.jsp qui va afficher
      //le nouveau panier (grâce au INCLUDE)
      String url="/EShop.jsp";
      ServletContext sc = getServletContext();
      RequestDispatcher rd = sc.getRequestDispatcher(url);
      rd.forward(request, response);

      //Dans le cas du clic sur Checkout
    } else if (action.equals("CHECKOUT"))  {

     //on va calculer le prix total
      float total =0;
      for (int i=0; i< buylist.size();i++) {
        CD anOrder = (CD) buylist.elementAt(i);
        float price= anOrder.getPrice();
        int qty = anOrder.getQuantity();
        total += (price * qty);
      }

      //deviner à quoi cela sert ??????
      total += 0.005;
      String amount = new Float(total).toString();
      int n = amount.indexOf('.');
      amount = amount.substring(0,n+3);
      request.setAttribute("amount",amount);

      //on redirige la requête vers la page de Checkout
      String url="/Checkout.jsp";
      ServletContext sc = getServletContext();
      RequestDispatcher rd = sc.getRequestDispatcher(url);
      rd.forward(request,response);
    }

    }

    //méthode utilitaire qui sert à récupérer les différentes
    //parties d'un item (CD)choisi de la liste (séparéespar le |)
    // et retourne un objet de type CD qui va être utlisé par la servlet
    private CD getCD(HttpServletRequest req) {
    //imagine if all this was in a scriptlet...ugly, eh?
    //on récupère l'item choisi par l'utilisateur dans la liste
    String myCd = req.getParameter("CD");

    //on récupère la quantité saisie
    String qty = req.getParameter("qty");

    // onrécupère les différentes parties
    StringTokenizer t = new StringTokenizer(myCd,"|");
    String album= t.nextToken();
    String artist = t.nextToken();
    String country = t.nextToken();
    String price = t.nextToken();
    price = price.replace('$',' ').trim();

    //on crée un objet CD avec les informations et on le retourne
    // à la servlet
    CD cd = new CD();
    cd.setAlbum(album);
    cd.setArtist(artist);
    cd.setCountry(country);
    cd.setPrice((new Float(price)).floatValue());
    cd.setQuantity((new Integer(qty)).intValue());
    return cd;
  }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
