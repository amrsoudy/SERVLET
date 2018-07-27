<%-- 
    Document   : selectedProducts
    Created on : 2018-07-02, 22:31:24
    Author     : AMR
--%>

<%@page import="Beans.Product"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
    </head>
    <body>
        <h1>Confirmation Selected Items to <%= session.getAttribute("_username")%></h1>
        <form action="pay" method="POST">

            <div class="container">
                <table class="table">
                    <thead>
                        <tr>
                            <th>Product Name</th>
                            <th>Price </th>
                        </tr>
                    </thead>
                    <tbody>

                        <c:set var="sum" value="0"/>
                        <c:set var="sum5Tax" value="0"/>
                        <c:set var="sumTotal" value="0"/>

                        <c:forEach var="indexCheckedItems" items="${ARChecked}">
                            <c:set var="sum" value="${sum + ar[indexCheckedItems].getPrice() }"/>
                            <tr>
                                <td class="bg-success">${ar[indexCheckedItems].getName()}</td>
                                <td class="bg-warning">${ar[indexCheckedItems].getPrice()}</td>
                            </tr>

                        </c:forEach> 
                        <c:set var="sum5Tax" value="${sum *  0.05 }"/>

                    </tbody>
                </table>
                <c:set var="sumTotal" value="${sum + sum5Tax}"/>

                <left><p>Total before Tax : ${sum} </p></left>
                <left><p>Tax: ${sum5Tax} </p></left>
                <left><p>Total after Tax  ${sumTotal} </p></left>
                <input class="btn-danger" type="submit" value="Confirm To Go Pay" />


            </div>
        </form>
    </body>
</html>
