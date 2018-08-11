<%-- 
    Document   : index
    Created on : 2018-08-10, 13:21:47
    Author     : 1795162
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body>
        <%@include  file="entete.jspf" %>
        
    <center> <b><h1> Veuiller vous authoentifier </h1></b> </center>

    <center>


        <form action="servPassValidation" method="POST">

            <table border="1">



                <tr>
                    <td>Mot de passe </td>
                    <td> <input type="Password" name="pass" value="" required/></td>

                </tr>
                <tr>
                    <td><input type="submit" value="Se Conecter"/></td>

                </tr>

            </table>

        </form>
    </center>


</body>
</html>
