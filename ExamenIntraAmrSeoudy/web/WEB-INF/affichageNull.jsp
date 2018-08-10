<%-- 
    Document   : affichageNull
    Created on : 2018-08-10, 15:25:53
    Author     : 1795162
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     
    </head>
    <body>
         <%@include  file="/entete.jspf" %>
        <h1>Aucune formation prévue pour le language ${lang}</h1>
        <a href="passValid.jsp">essayer une nouvelle recherche</a>
    </body>
</html>
