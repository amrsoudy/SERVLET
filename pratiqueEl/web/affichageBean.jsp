<%-- 
    Document   : affichageBean
    Created on : 2018-07-05, 12:25:08
    Author     : 1795162
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Voici les information sur le produite</h1>
  
            
            <ul>
                <li>Nom : ${pr.description}</li>
                <li>Qty : ${pr.quantite}</li>
                 <li>Prix : ${pr.pricunitaire}</li>

            </ul>
    



    </body>
</html>
