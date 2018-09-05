<%-- 
    Document   : index
    Created on : 4 sept. 2018, 13:04:35
    Author     : 1795162
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
        <%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <title>JSP Page</title>
    </head>
    <body>
        <fmt:setLocale value="${lang}" />
        
        <fmt:bundle basename="properties">

            <p><fmt:message key="welcome" /> </p>
            <fmt:message key="pass" /> <input type="text" name="pass" value="" />


        </fmt:bundle>
    </body>
</html>
