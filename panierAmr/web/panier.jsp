<%-- 
    Document   : panier
    Created on : 2018-07-30, 14:31:22
    Author     : AMR
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="${shopingcarte.size() gt 0}">

        <centre>      
            <table border="0" cellpadding="0" width="100%" bgcolor="#FFFFFF">
                <thead>
                    <tr>
                        <th>Alboum </th>
                        <th> Name</th>
                        <th>Country </th>
                        <th> Price</th>
                        <th> quantity</th>
                    </tr>
                </thead>
                <tbody>
                    <c:set var="i" value="0"/>
                    <c:forEach var="item" items="${shopingcarte}">

                        <tr>

                            <td>${item.album}</td>
                            <td>${item.artist}</td>
                            <td>${item.country}</td>
                            <td>${item.price}</td>
                            <td>${item.quantity}</td>
                            <td>
                                <form action="main_servelet" method="POST">
                                    <input type="hidden" name="delindex" value="${i}" />
                                    <input type="hidden" name="action" value="delete" />
                                    <input type="submit" value="delete" name="del" />
                                    <c:set var="i" value="${i+1}" />
                                </form>
                            </td>  
                        </tr>  

                    </c:forEach>
                
                </tbody>
            </table>
      
    <p>
        <p>
           
                <form action="main_servelet" method="POST">

                    <input type="hidden" name="action" value="checkout" />
                    <input type="submit" name="checkout" value="CHECK OUT" />


                </form>
        </centre>
         
      <p>  <a href="test"> pdf</a></p>

    </c:if>


</body>
</html>
