<%-- 
    Document   : index
    Created on : 2018-09-05, 19:11:32
    Author     : 1795162
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <fmt:setLocale value="${lang}" />
        <fmt:bundle basename="properties">

            <fmt:message key="welcome" />


        </fmt:bundle>

        <form  action="checkLang">
            <select name="sel" onchange="submit()" >
                <option > choisir </option>
                <option value="fr_CA" > Francais </option>
                <option value="en_US" > English </option>


            </select>

        </form>





    </body>
</html>
