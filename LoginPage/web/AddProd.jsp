<%-- 
    Document   : AddProducts
    Created on : 2018-07-04, 23:24:11
    Author     : AMR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/css1.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
 <center><h1><u>Add Product</u></h1></center>
        <center>
            <div>
                <form action="AddProducts" method="POST">

                    <table>

                        <tr>
                            <td>Product  Name </td>
                            <td><input type="text" class="form-control" name="ProductName"  size="30" placeholder="Product name"/></td>
                        </tr>
                        <tr>
                            <td>Price    </td>
                            <td><input type="password" class="form-control" name="Price" placeholder="Price" size="30" /></td>
                        </tr>
                        <tr>
                            <td>Image Path  </td>
                            <td><input type="text" class="form-control" name="ImgPath"  size="30" placeholder="Image Path"/></td>
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
