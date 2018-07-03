<%-- 
    Document   : Products
    Created on : 2018-07-02, 15:50:52
    Author     : AMR
--%>

<%@page import="Controleur.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">        <title>JSP Page</title>
        <link href="css/css1.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>

        <div class="row">
            <div class="col-xs-8 col-sm-8 col-lg-8"> <h5> Welcome <%= session.getAttribute("_username")%>  And We Are So Happy to choose from our Products </h6></div>
            <div class="col-xs-2 col-sm-2 col-lg-2"></div>
            <div class="col-xs-2 col-sm-2 col-lg-2"><input type="submit" class="bascet-button" value="" /></div>
        </div>
       
        <form action="ProductsServ">

            <div  class="container">
                <div class="container">
                    <center>
                        <table border="2" width="10" cellspacing="10">
                            <thead>
                                <tr>
                                    <% Product product1 = new Product("product1",20.55);%>
                                    
                                    <th><img src="Images/pic1.jpg" width="200" height="200" alt="pic1"/><br> Price : 20.55 $ <input type="checkbox" name="check" value="0" /></th>
                                    <th><img src="Images/pic2.jpg" width="200" height="200" alt="pic2"/><br> Price : 30.55 $ <input type="checkbox" name="check" value="1" /></th>
                                    <th><img src="Images/pic3.jpg" width="200" height="200" alt="pic3"/><br> Price : 40.55 $ <input type="checkbox" name="check" value="2" /> </th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td><img src="Images/pic4.jpg" width="200" height="200" alt="pic4"/><br> Price : 50.55 $ <input type="checkbox" name="check" value="3" /></td>
                                    <td><img src="Images/pic5.jpg" width="200" height="200" alt="pic5"/><br> Price : 60.55 $ <input type="checkbox" name="check" value="4" /></td>
                                    <td><img src="Images/pic6.jpg" width="200" height="200" alt="pic6"/><br> Price : 70.55 $ <input type="checkbox" name="check" value="5" /></td>
                                </tr>

                            </tbody>
                        </table>
                    </center>
                    <center>
                        <input class="btn btn-danger" type="submit" value="Go To Your Bascet" />
                    </center>
                </div>
            </div>            

        </form>

    </body>
</html>
