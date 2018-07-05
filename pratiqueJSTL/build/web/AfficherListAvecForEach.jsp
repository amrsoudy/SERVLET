<%-- 
    Document   : AfficherListAvecForEach
    Created on : 2018-07-05, 14:07:21
    Author     : 1795162
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th>Nom</th>
                    <th>Prenom</th>
                    <th>Revenu</th>
                    <th>MontantPret</th>

                </tr>
            </thead>
            <c:forEach var="info" items="${sessionScope.maList}">
                <tr>

                    <td>${info.nom}</td>
                    <td>${info.prenom}</td>
                    <td>${info.revenu}</td>
                    <td>${info.montantPret}</td>


                </tr>
            </c:forEach>>
        </table>


    </body>
</html>
