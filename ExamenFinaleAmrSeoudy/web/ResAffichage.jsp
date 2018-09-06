<%-- 
    Document   : ResAffichage
    Created on : 6 sept. 2018, 10:15:09
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

    <Center> 
        
        <h1>${details}</h1>
        
        <h2 > ${msg}</h2>
        
        <a href="Soumettre.jsp"> <h1> Return </h1> </a>
        
        
        </Center>
    </body>
</html>
