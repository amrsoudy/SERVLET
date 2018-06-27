<%-- 
    Document   : BIENVENUE
    Created on : 2018-06-21, 22:50:40
    Author     : AMR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!-- Bienvenu all  in  <%= new java.util.Date()%>  -->
        <div class="container">
            <form action="NewServlet" method="post">
                USER NAME <input type="text" name="NOM" value="" /><br>
                PASSWORD <input type="password" name="PWD" value="" /><br>
                <input type="submit" value="ENVOYER" name="submit" />submit
            </form>
        </div>    
    </body>
</html>
