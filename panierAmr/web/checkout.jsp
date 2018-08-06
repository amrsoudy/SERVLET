<%-- 
    Document   : checkout
    Created on : 2018-07-30, 20:33:29
    Author     : AMR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body bgcolor="#33EEFF">
        <h1>Checkout Musique sans frontières </h1>

        <c:if test="${shopingcarte.size() gt 0}">

        <center>
            <table border="0" cellpadding="0" width="100%" bgcolor="#FFFFFF">

                <tr>
                    <th>Alboum </th>
                    <th> Name</th>
                    <th>Country </th>
                    <th> Price</th>
                    <th> quantity</th>
                </tr>


                <c:set var="i" value="0"/>
                

                    <c:forEach var="item" items="${shopingcarte}">
                        <tr align="center">

                            <td>${item.album}</td>
                            <td>${item.artist}</td>
                            <td>${item.country}</td>
                            <td>${item.price}</td>
                            <td>${item.quantity}</td>

                        </tr>  

                    </c:forEach>

                <tr align="center">
                    ${session.invalidate()}
                    <td></td>
                    <td></td>
                    <td>total</td>
                    <td>${amount}</td>



                </tr>


            </table>




            <p>  <a href="index.jsp"> contienue a magasain </a></p>
        </center>
    </c:if>


</body>
</html>
