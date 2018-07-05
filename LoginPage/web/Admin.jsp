<%-- 
    Document   : Admin
    Created on : 2018-06-24, 14:29:06
    Author     : 1795162
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="css/css1.css">

    </head>
    <body>
        <a href="AddProd.jsp">For Add Products</a>
    <center>  

        <center><h1><u>Add User</u></h1></center>
        <center>
            <div>
                <form action="AdminSer" method="POST">

                    <table>

                        <tr>
                            <td>User Name   </td>
                            <td><input type="text" class="form-control" name="UserName1"  size="30" placeholder="Username"/></td>
                        </tr>
                        <tr>
                            <td>Password    </td>
                            <td><input type="password" class="form-control" name="PWD1" placeholder="Password" size="30" /></td>
                        </tr>
                        <tr>
                            <td>Age  </td>
                            <td><input type="text" class="form-control" name="age1"  size="30" placeholder="Your Age"/></td>
                        </tr>
                        <tr>
                            <td>Email </td>
                            <td><input type="text" class="form-control" name="email1"  size="30" placeholder="xyz@xyz.com"/></td>
                        </tr>
                        <tr>
                            <td colspan="2" style="text-align:center"><input  class="btn btn-success" type="submit" value="Save" /></td>

                        </tr>

                    </table>

                </form>  

                <p><%= request.getAttribute("x")%> lignes  inseré </p>
            </div>
        </center>

    </center>

</body>
</html>
