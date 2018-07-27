<%-- 
    Document   : AfficherLaListDObjet
    Created on : 2018-07-05, 14:43:18
    Author     : 1795162
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body>
    <center>
        <table border="1">
            <thead>
                <tr>
                    <th>Nom</th>
                    <th>Prix</th>
                    <th>Photo</th>
                </tr>
            </thead>
            <tbody>
                    <c:set var="count" value = "0"/>

                <c:forEach var="prod" items="${list}">
                <center>

                    <tr  BGCOLOR="${(count % 2 == 0)? "RED":"BLUE"}">

                        <td>${prod.nom}</td>
                        <td>${prod.prix}</td>
                        <td><img src="${prod.photo}"/></td>
                        
                        
                            <c:set var="count" value = "${count+1}"/>
                    </tr>
                </center>

            </c:forEach>
            </tbody>
        </table>
    </center>

</body>
</html>
