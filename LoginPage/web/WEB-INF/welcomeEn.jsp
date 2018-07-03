<%-- 
    Document   : welcomeEn
    Created on : 2018-06-24, 13:18:02
    Author     : 1795162
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet">
        <style src="css1.css">
            </style>
        <title>WelcomeEn Page</title>
    </head>
    <body>
        <%  String _username = request.getParameter("UserName");%>
    <center><h1>welcome  <%= _username  %> </h1></center>
       <h2> Hi <%= session.getAttribute("_username")   %> </h2>


    <div class="container">
        <a href="index.jsp">Home</a>
        <a href="AdminEN.jsp">Admin</a>
        
    </div>
    
    


</body>
</html>
