<%-- 
    Document   : testLang
    Created on : 2018-08-16, 12:45:25
    Author     : 1795162
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="es_ES"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <fmt:setBundle basename="modele.ApplicationResources" />
        <h1><fmt:message key="message.welcome" /></h1>
        
        
    </body>
</html>
