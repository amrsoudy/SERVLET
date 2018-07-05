<%-- 
    Document   : modifyBean
    Created on : 2018-07-05, 12:54:26
    Author     : 1795162
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="SauvegardeBean" method="POST">
            <center>
            <table border="1">
            <thead>
                <tr >
                    <th colspan="2"><h3>Information Produite</h3></th>
                   
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Description</td>
                    <td><input type="text" name="desc" value="${pr.description}" /> </td>
                </tr>
                <tr>
                    <td>Quantite</td>
                    <td> <input type="text" name="qty" value="${pr.quantite}" /></td>
                </tr>
                <tr>
                    <td>Prix Unitaire</td>
                    <td><input type="text" name="prix" value="${pr.pricunitaire}" /></td>
                </tr>
         
            </tbody>
        </table>

        </center>
            
            <center>
                <input type="submit" value="click ici" />
                </center>
            
        </form>
        
    </body>
</html>
