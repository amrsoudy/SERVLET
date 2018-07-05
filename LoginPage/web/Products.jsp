<%-- 
    Document   : Products
    Created on : 2018-07-02, 15:50:52
    Author     : AMR
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Controleur.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous"> 
        <link href="css/css1.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <form action="ProductsServ">
            <div class="container">
                <div class="row">
                    <div class="col-xs-8 col-sm-8 col-lg-8"> <h5> Welcome <%= session.getAttribute("_username")%>  And We Are So Happy to choose from our Products </h5></div>
                    <div class="col-xs-4 col-sm-4 col-lg-4"><input type="submit" class="btn btn-danger" id="bascet" value="" /></div>
                </div>
            </div>

        </form>


        <form action="ProductsServ">

            <div  class="container">
                <left>
                    <table border="2" width="10" cellspacing="10">
                        <%
                            int count = 0;
                            for (Product p : (ArrayList<Product>) application.getAttribute("ar")) {
                                count++;
                                if (count == 0) {
                        %>
                        <tr>
                            <%}
                            %>
                            <td><img src="<%= p.getImg()%>" width="300" height="300" alt="pic1"/><br><%= p.getName()%> <br> Price : <%= p.getPrice()%> <input type="checkbox" onclick="increase(this)" name="check" value="0" /></td>

                            <% if (count == 3) {
                                    count = 0;
                            %>
                        </tr>

                        <%}
                            }

                        %>



                    </table>
                </left>
                <center>
                    <input class="btn btn-danger"  type="submit" value="Go To Your Bascet" />
                </center>
            </div>            

        </form>
        <script src="js/script1.js" type="text/javascript"></script>
    </body>
</html>
