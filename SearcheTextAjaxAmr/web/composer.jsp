<%-- 
    Document   : composer
    Created on : 2018-07-14, 20:42:06
    Author     : 1795162
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <table >
            <thead>
                <tr>
                    <th colspan="2"> Composer Information </th>

                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>First Name</td>
                    <td>${requestScope.composer.firstName}</td>
                </tr>
                <tr>
                    <td>Last Name </td>
                    <td>${requestScope.composer.lastName}</td>
                </tr>
                <tr>
                    <td> ID </td>
                    <td>${requestScope.composer.id}</td>
                </tr>
                <tr>
                    <td> Categorie </td>
                    <td>${requestScope.composer.category}</td>
                </tr>
            </tbody>
        </table>
                <p>Go back  to  
                <a href="index.html"></a> application Home 
 </p>
    </body>
</html>
