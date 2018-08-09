

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <%@ include file="paner.jspf" %>            

    </head>
    <body>
      
            <center>
                <table border="1">
                    <thead>
                        <tr>
                            <th  colspan="2"> <h1 align="center"><b> ${commande.nom}    votre commande est : </b></h1></th>

                        </tr>
                    </thead>
                    <tbody>

                        <tr>
                            <td><b>Nom</b></td>
                            <td><p>${commande.nom}</p></td>

                        </tr>
                        <tr>
                            <td><b>prenom</b></td>
                            <td><p>${commande.prenom}</p></td>

                        </tr>
                        <tr>
                            <td><b> Adresse</b></td>
                            <td><p>${commande.adress}</p></td>

                        </tr>
                        <tr>
                            <td ><b>Théme</b></td>

                            <td> <p>${commande.theme}</p>
                            </td>

                        </tr>
                      
                        <tr>
                            <td ><b>Glasage</b></td>

                            <td> <p>${commande.glasage}</p>
                            </td>

                        </tr>
                     
                        <tr >
                            <td>Prix Total </td>
                            <td><p>${commande.prixTotal}</p></td>
                        </tr>
                    </tbody>
                </table>
            </center>
    <center>
    <a  href="index.html">magasiner un autre fois  suppremez la session</a>
    </center>
    </body>
</html>
