<%-- 
    Document   : afficherDetails
    Created on : 2018-08-02, 17:05:50
    Author     : 1795162
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="${hotel != null}">
            
            <table border="1">
                <thead>
                    <tr>
                        <th colspan="4">voici les ddetailes de la houtel   </th>
                      
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Id</td>
                        <td> Name</td>
                        <td>City</td>
                        <td> stars</td>
                    </tr>
                    <tr>
                        <td>${hotel.hotelId}</td>
                        <td>${hotel.nom}</td>
                        <td>${hotel.ville}</td>
                        <td>${hotel.stars}</td>
                    </tr>
                </tbody>
            </table>

            
            
            
            
            
        </c:if>
    </body>
</html>
