<%-- 
    Document   : Rechercher
    Created on : 6 sept. 2018, 09:33:07
    Author     : 1795162
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
              <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %>
    </head>
    <body>
        <%@include file="entetePage.jspf" %>
        <fmt:setLocale value="${sessionScope.lang}" />
        <fmt:bundle basename="Lang" >

            <h1> <fmt:message key="Message" /></h1>


        </fmt:bundle>
    <center>
        <form action="srv_chercher">

            Ecrire Votre nomber SVP <input type="text" name="nombre" value=""  width="50px" required/><br /><br />
            <input type="submit" value="Afficher" />
            <h1>${Message}</h1>

            <c:forEach var="item" items="${ar}">

                <h4> Semaine  :  ${item.semain}   poide  :  ${item.poid} </h4>





            </c:forEach>




        </form>
    </center>
</body>
</html>
