<%-- 
    Document   : addUser
    Created on : 2018-08-12, 12:06:10
    Author     : 1795162
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="serv_addUser" method="POST">

            <center>

                <table border="1" >

                    <tbody>
                        <tr>
                            <td>User name </td>
                            <td><input type="text" name="username" value="" size="30" placeholder="Amr" required /></td>
                        </tr>
                        <tr>
                            <td>Password </td>
                            <td><input type="password" name="pass" value="" size="30" required/></td>
                        </tr>
                        <tr>
                            <td>Email  </td>
                            <td> <input type="email" name="email" value="" size="60" autocomplete="on"/></td>
                        </tr>
                        <tr >
                            <td align="center" colspan="2"> <input type="submit" value=" Add User" /></td>

                        </tr>

                    </tbody>
                </table>

            </center>

        </form>
        <c:if test="${!empty destination}">
            <a href="${destination}"> Now  Login please </a>

        </c:if>
    </body>
</html>
