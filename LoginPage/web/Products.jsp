<%-- 
    Document   : Products
    Created on : 2018-07-02, 15:50:52
    Author     : AMR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous"> 
        <link href="css/css1.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <form action="ProductsServ">
            <div class="container">
                <div class="row">
                    <div class="col-xs-8 col-sm-8 col-lg-8"> <h5> Welcome ${_username}  And We Are So Happy to choose from our Products </h5></div>
                    <div class="col-xs-4 col-sm-4 col-lg-4"><input type="submit" class="btn btn-danger" id="bascet" value="" /></div>
                </div>
            </div>

        </form>


        <form action="ProductsServ">

            <div  class="container">
                <table border="1">

                    <tbody>
                        <c:set var="count" value="0"/>
                        <c:set var="count2" value = "0"/>

                        <c:forEach var="prod" items="${ar}">
                            <c:set var="count" value = "${count+1}"/>

                            <c:if test = "${count == 0}">

                                <tr>
                                </c:if>                         

                                <td>
                                    <img src="${prod.getImg()}" width="300" height="300" alt="pic1"/>
                                    <br>${prod.getName()}
                                    <br> Price : ${prod.getPrice()}
                                    <input type="checkbox" onclick="increase(this)" name="check" value="${count2}" />

                                    <c:set var="count2" value = "${count2+1}"/>


                                </td>
                                <c:if test = "${count == 3}">
                                    <c:set var="count" value = "0"/>


                                </tr> 
                            </c:if>


                        </c:forEach>
                    </tbody>
                </table>

                <center>
                    <input class="btn btn-danger"  type="submit" value="Go To Your Bascet" />
                </center>
            </div>            

        </form>
        <script src="js/script1.js" type="text/javascript"></script>
    </body>
</html>
