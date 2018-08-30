<%-- 
    Document   : ExChoisirLang
    Created on : 30 août 2018, 09:47:18
    Author     : 1795162
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <fmt:setLocale value="${lang}" />
        <fmt:bundle basename="ApplicationRessource.Messages" >

            <h1> <fmt:message key="message.welcome" /> </h1>
            <form name="maForm" action="ControlerServlet" >

                <fmt:message key="message.lang" />
                <select name="lang" onchange="submit()">
                    <c:if test="${lang == null}">
                        <option value="en_US"><fmt:message key="message.anglais" /></option>
                        <option value="fr_CA"><fmt:message key="message.francais" /></option>


                    </c:if>
                    <c:if test="${lang == 'fr_CA'}">
                        <option value="fr_CA"><fmt:message key="message.francais" /></option>
                        <option value="en_US"><fmt:message key="message.anglais" /></option>


                    </c:if>   
                    <c:if test="${lang == 'en_US'}">
                        <option value="en_US"><fmt:message key="message.anglais" /></option>
                        <option value="fr_CA"><fmt:message key="message.francais" /></option>



                    </c:if>  


                </select>

            </form>


        </fmt:bundle>



    </body>
</html>
