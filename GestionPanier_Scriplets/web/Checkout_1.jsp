<%-- 
    Document   : Checkout
    Created on : 2010-02-21, 10:02:47
    Author     : Toshiba
--%>

<%@ page session="true" import="java.util.*,modele.CD" %>

<html>
<head>
<title>Checkout Musique sans frontières</title>
</head>
<body bgcolor="#33CCFF">
 <font face="Times New Roman,Times" size=+3>
  Checkout Musique sans frontières
 </font>
 <hr><p>
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
  Vector buylist = (Vector) session.getAttribute("shoppingcart");
  String amount = (String) request.getAttribute("amount");
  for (int i=0; i < buylist.size();i++) {
   CD anOrder = (CD) buylist.elementAt(i);
 %>
 <c:set var="buylist" value="$amount"/>;
 <c:forEach var="anOrder" items="${shoppingcart}">
 
  <tr>
 <td><b><%= anOrder.getAlbum() %></b></td>
 <td><b><%= anOrder.getArtist() %></b></td>
 <td><b><%= anOrder.getCountry() %></b></td>
 <td><b><%= anOrder.getPrice() %></b></td>
 <td><b><%= anOrder.getQuantity() %></b></td>
 </tr>
 </c:forEach>

 <tr>
 <td><b><%= anOrder.getAlbum() %></b></td>
 <td><b><%= anOrder.getArtist() %></b></td>
 <td><b><%= anOrder.getCountry() %></b></td>
 <td><b><%= anOrder.getPrice() %></b></td>
 <td><b><%= anOrder.getQuantity() %></b></td>
 </tr>
 <%
  }
  session.invalidate();
 %>
 <tr>
 <td>     </td>
 <td>     </td>
 <td><b>TOTAL</b></td>
 <td><b>$<%= amount %></b></td>
 <td>     </td>
 </tr>
 </table>
 <p>
 <a href="EShop.jsp">Continuer à magasiner!</a>
 </center>
</body>
</html>

