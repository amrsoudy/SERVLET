<%-- 
    Document   : passValid
    Created on : 2018-08-10, 14:24:40
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
         <%@include  file="entete.jspf" %>
    <center> <b><h1> Saisir le language recherché </h1></b> </center>
    <center>
        <form action="servtraitment" method="POST">

            <table border="1">

                <tbody>
                    <tr>
                        <td>Nom</td>
                        <td><input type="text" name="nom" value="" size="30" required/></td>
                    </tr>
                    <tr>
                        <td>Language</td>
                        <td><input type="text" name="lang" value="" size="30" required/></td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" value="Envoyer" />

                        </td>

                    </tr>
                </tbody>
            </table>
            </form>
    </center>

</body>
</html>
