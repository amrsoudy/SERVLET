<%-- 
    Document   : panier
    Created on : 2010-02-21, 09:55:15
    Author     : Toshiba
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true" import="java.util.*, modele.CD" %>
<%
 Vector buylist = (Vector) session.getAttribute("shoppingcart");
 if (buylist != null && (buylist.size() > 0)) {
%>

<center>
<table border="0" cellpadding="0" width="100%" bgcolor="#FFFFFF">
 <tr>
 <td><b>ALBUM</b></td>
 <td><b>ARTIST</b></td>
 <td><b>COUNTRY</b></td>
 <td><b>PRICE</b></td>
 <td><b>QUANTITY</b></td>
 <td></td>
 </tr>
 <%
  for (int index=0; index < buylist.size();index++) {
   CD anOrder = (CD) buylist.elementAt(index);
 %>
 <tr>
  <td><b><%= anOrder.getAlbum() %></b></td>
  <td><b><%= anOrder.getArtist() %></b></td>
  <td><b><%= anOrder.getCountry() %></b></td>
  <td><b><%= anOrder.getPrice() %></b></td>
  <td><b><%= anOrder.getQuantity() %></b></td>
  <td>
   <form name="deleteForm" action="ShoppingServlet_0"    method="POST">
   <input type="submit" value="Delete">
   
   <input type="hidden" name= "delindex" value='<%= index %>'>
   
   <input type="hidden" name="action" value="DELETE">
  </form>
      </td>
    </tr>
    <% } %>
  </table>
  <p>
  <form name="checkoutForm"action="ShoppingServlet_0"    method="POST">
    <input type="hidden" name="action" value="CHECKOUT">
    <input type="submit" name="Checkout" value="Checkout">
  </form>
  </center>
    <a href="Test" >pdf</a>
<% } %>

