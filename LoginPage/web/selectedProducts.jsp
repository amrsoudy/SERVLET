<%-- 
    Document   : selectedProducts
    Created on : 2018-07-02, 22:31:24
    Author     : AMR
--%>

<%@page import="Controleur.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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


                <%
                    double sum = 0;
                    double sum5Tax = 0;
                    double sumTotal = 0;
                    ArrayList<Product> arr = (ArrayList<Product>) application.getAttribute("ar");

                    for (Integer i : (ArrayList<Integer>) session.getAttribute("ARChecked")) {
                        sum += arr.get(i).getPrice();
                        sum5Tax += arr.get(i).getPrice() * 0.05;

                %>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Product Name</th>
                            <th>Price </th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td class="bg-success"><%= arr.get(i).getName()%></td>
                            <td class="bg-warning"><%= arr.get(i).getPrice()%></td>
                        </tr>
                    </tbody>
                </table>

                <%}
                    sumTotal = sum + sum5Tax;
                %>
                <left><p>Total before Tax : <%= sum%> </p></left>
                <left><p>Tax: <%= sum5Tax%> </p></left>
                <left><p>Total after Tax  <%= sumTotal%> </p></left>
                <input class="btn-danger" type="submit" value="Confirm To Go Pay" />


                <%%>
            </div>
        </form>
    </body>
</html>
