<%-- 
    Document   : affichage
    Created on : 2018-08-10, 15:24:56
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
         <%@include  file="/entete.jspf" %>
    <center> <b><h1>Bienvenue ${nom} , voici les information ertouvé pour ${lang}</h1></b></center>
    <center>
        <table border="1">
            <thead>
                <tr>
                    <th>Titre</th>
                    <th>Ville</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="item" items="${list}">

                    <tr>
                        <td>${item.formation}</td>
                        <td>${item.ville}</td>
                    </tr>

                </c:forEach>

            </tbody>
        </table>
            <a align="center" href="passValid.jsp"> une uter recherche</a>

    </center>

</body>
</html>
