<%-- 
    Document   : index
    Created on : 6 sept. 2018, 09:09:29
    Author     : 1795162
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
              <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
   
        <%@include file="entetePage.jspf" %>
                <fmt:setLocale value="${sessionScope.lang}" />
        <fmt:bundle basename="Lang" >
            
            <h1> <fmt:message key="Message" /></h1>
            
            
        </fmt:bundle>
        
        
        <div  style=" height:600px; background-color: #333; background-image: url('images/Lighthouse.jpg');">


        
    </body>
</html>
