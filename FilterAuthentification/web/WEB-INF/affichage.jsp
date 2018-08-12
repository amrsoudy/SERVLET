<%-- 
    Document   : affichage
    Created on : 2018-08-12, 11:56:39
    Author     : 1795162
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="margin-top: 60px">
    <center>
        
        <table border="1">
            <thead>
                <tr>
                    <th>user Name </th>
                    <th> Password </th>
                    <th> Email </th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>${persone.userName}</td>
                    <td>${persone.pass}</td>
                    <td>${persone.email}</td>
                </tr>
            
            </tbody>
        </table>

        
        
    </center>
        
      
    </body>
</html>
