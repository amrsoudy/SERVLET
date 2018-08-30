<%-- 
    Document   : pageAvecLocale
    Created on : 30 août 2018, 09:28:30
    Author     : 1795162
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib  prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <fmt:bundle basename="ressources_i18n.Messages">
            <fmt:message key="count.one" /> <br/>
            <fmt:message key="count.two" /><br/>
            <fmt:message key="count.three" /><br/>
       
        </fmt:bundle>
            
            <fmt:setLocale value="es_ES" />    
            <fmt:bundle basename="ressources_i18n.Messages">
                
                <fmt:message key="count.one" /><br/>
                <fmt:message key="count.two" /><br/>
                
                
            </fmt:bundle>
        
        
    </body>
</html>
