<%-- 
    Document   : index
    Created on : 2018-06-24, 16:58:47
    Author     : 1795162
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet">
          <link rel="stylesheet" href="css/css1.css">

        <title>JSP Page</title>
    </head>
    <body>
        <center>
        <div class="container">

            <form action="NewServelet" method="GET">
<center>
                <table border="1">
                    <thead>
                        <tr>
                            <th colspan="2"> Coversion de temperature</th>

                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>Valuer a convertir</td>
                            <td><input type="text" name="valeurSaisir" value="" /></td>
                        </tr>
                        <tr>
                            <td>Vers</td>
                            <td>

                                <input type="radio" name="choix" value="Celsius" checked="checked" /> Celsius <br>
                                <input type="radio" name="choix" value="Fehrnhite"  /> Fehrnhite


                            </td>



                        </tr>
                        <tr>
                            <td colspan="2" style="text-align: center"> <input type="submit" value="Envoyer" /></td>

                        </tr>

                    </tbody>
                </table>
</center>
            </form>
        </div>
            </center>
    </body>
</html>
