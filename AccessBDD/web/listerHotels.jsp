<%-- 
    Document   : listerHotels
    Created on : 2018-08-02, 15:43:25
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
        <h1>voici la list de hotels </h1>

        <table>
            <c:forEach var="hotel" items="${hotels}">

                <tr>
                    <td><a href="RechDetail?id=${hotel.hotelId}">${hotel.hotelId}</a></td>
                    <td>${hotel.nom}</td>

                </tr>

            </c:forEach>

        </table>


    </body>
</html>
