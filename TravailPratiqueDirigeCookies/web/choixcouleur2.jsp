<%-- 
    Document   : choixcouleur2
    Created on : 2018-07-09, 15:26:11
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
        <form name="maform" action="CreeCookie" method="POST">
            <table border="1">
                <tbody>
                    <tr>
                        <td>Nom</td>
                        <td><input type="text" name="nom" value="" /></td>
                    </tr>
                    <tr>
                        <td>Prenom</td>
                        <td><input type="text" name="prenom" value="" /></td>
                    </tr>
                    <tr>
                        <td>couleur</td>
                        <td><input type="radio" name="couleur" value="jaune" checked="checked" /><input type="radio" name="couleur" value="Rouge" /></td>
                    </tr>
                    <tr>
                
                        <td colspan="2"> <center><input type="submit" value="Send" /></center></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
