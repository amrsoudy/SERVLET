/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2016-07-16 21:01:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import bdeb.model.Produit;
import bdeb.dao.ProduitDAOImpl;

public final class produit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Produit Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/produit.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       ");

		ProduitDAOImpl produitDAO = new ProduitDAOImpl();
		List<Produit> list = new ArrayList<Produit>();
		list = produitDAO.getList();
                
                String codeCategorie = "0";
		if (request.getParameter("codeCategorie") != null) {
			codeCategorie = request.getParameter("codeCategorie");
		}
		
	
      out.write("\n");
      out.write("        <div id=\"site-wrapper\">\n");
      out.write("            <ul class=\"products homepage\">\n");
      out.write("                   \n");
      out.write("                ");
	
               
                    if(codeCategorie !=null){
			for (Produit p : produitDAO.getListProduitParCategorie(Integer.parseInt(codeCategorie)) ) {
                
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<li class=\"preorder\">\n");
      out.write("                            <span class=\"tagimg \"></span> \n");
      out.write("                                <a href=\"detail.jsp?codeProduit=");
      out.print(p.getCodeProduit());
      out.write("\">\n");
      out.write("                                    <img src=\"produits/");
      out.print(p.getImageProduit());
      out.write("\" width=\"250%\" height=\"250%\" />\n");
      out.write("                                                ");
      out.print(p.getNomProduit());
      out.write("<br>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\tPrix:");
      out.print(p.getPrixProduit());
      out.write("\n");
      out.write("\t\t\t\t\t\tCAD\n");
      out.write("\t\t\t\t\t<span class=\"textkm\">Promotion <strong>20 CAD</strong></span>\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                </a>\n");
      out.write("                        </li>\n");
      out.write("                ");

				}
                    }else {
                        for(Produit p : list){
                        
      out.write(" \n");
      out.write("                        <li class=\"preorder\">\n");
      out.write("                            <span class=\"tagimg \"></span> \n");
      out.write("                                <a href=\"detail.jsp?codeProduit=");
      out.print(p.getCodeProduit());
      out.write("\">\n");
      out.write("                                    <img src=\"produits/");
      out.print(p.getImageProduit());
      out.write("\" width=\"250%\" height=\"250%\" />\n");
      out.write("                                                ");
      out.print(p.getNomProduit());
      out.write("<br>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\tPrix:");
      out.print(p.getPrixProduit());
      out.write("\n");
      out.write("\t\t\t\t\t\tCAD\n");
      out.write("\t\t\t\t\t<span class=\"textkm\">Promotion <strong>20 CAD</strong></span>\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                </a>\n");
      out.write("                        </li>\n");
      out.write("                       ");

				}
                        }
                	
      out.write(" \n");
      out.write("                       \n");
      out.write("            </ul>\n");
      out.write("\t</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
