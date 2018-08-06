<%-- 
    Document   : panier
    Created on : 2018-07-30, 14:31:22
    Author     : AMR
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   
    
        <c:if test="${shopingcarte.size() gt 0}">

        <center>      
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
                   
                    <c:forEach var="item" items="${shopingcarte}" varStatus="loop">

                        <tr align="center">

                            <td>${item.album}</td>
                            <td>${item.artist}</td>
                            <td>${item.country}</td>
                            <td>${item.price}</td>
                            <td>${item.quantity}</td>
                            <td>
                                <form action="main_servelet" method="POST">
                                    <input type="hidden" name="delindex" value="${loop.index}" />
                                    <input type="hidden" name="action" value="delete" />
                                    <input type="submit" value="delete" name="del" />
                                   
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
        </center>

        <p>  <a href="test"> pdf</a></p>

    </c:if>


</html>
