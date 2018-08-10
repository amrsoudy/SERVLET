<%-- 
    Document   : index
    Created on : 2018-08-09, 13:33:11
    Author     : 1795162
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                    <%@ include file="paner.jspf" %>            

    </head>
    <body class="container">

        <form action="serv_main" method="POST">



            <center>
                <table border="1">
                    <thead>
                        <tr>
                            <th  colspan="2"> <h1 align="center"><b>Sasier votre commande</b></h1></th>

                        </tr>
                    </thead>
                    <tbody>

                        <tr>
                            <td><b>Nom</b></td>
                            <td><input type="text" name="nom"  size="30" placeholder="Nom" required/></td>

                        </tr>
                        <tr>
                            <td><b>prenom</b></td>
                            <td><input type="text" name="prenom" size="30" placeholder="preNom"  required/></td>

                        </tr>
                        <tr>
                            <td><b> Adresse</b></td>
                            <td><input type="text" name="adr" value="" size="60" required/></td>

                        </tr>
                        <tr>
                            <td rowspan="3"><b>Théme</b></td>

                            <td> <input type="radio" name="theme" value="spiderman" checked="checked" />Spider man 
                            </td>

                        </tr>
                        <tr>
                            <td> <input type="radio" name="theme" value="transformer"  /> transformer
                            </td>
                        </tr>
                        <tr>
                            <td> <input type="radio" name="theme" value="Barbie"  /> Barbie
                            </td>
                        </tr>
                        <tr>
                            <td rowspan="2"><b>Glasage</b></td>

                            <td> <input type="radio" name="Glasage" value="Chocoltae" checked="checked" />Chocoltae
                            </td>

                        </tr>
                        <tr>
                            <td> <input type="radio" name="Glasage" value="vanille"  /> vanille
                            </td>
                        </tr>
                        <tr >
                            <td align="center" colspan="2"> <input type="submit" value="envoyer" /></td>
                        </tr>
                    </tbody>
                </table>
            </center>
        </form>
    </body>
</html>
