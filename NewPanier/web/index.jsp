<%-- 
    Document   : index
    Created on : 2018-08-10, 11:41:26
    Author     : AMR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <form action="serv_main" method="POST">
  
        <select name= "cd">
                    <option>Yuan | The Guo Brothers | China | 4.95</option>
                    <option>Drums of Passion | Babatunde Olatunji | Nigeria | 6.95</option>
                    <option>Kaira | Tounami Diabate| Mali | 6.95</option>
                    <option>The Lion is Loose | Eliades Ochoa | Cuba | 3.95</option>
                    <option>Dance the Devil Away | Outback | Australia | 4.95</option>
                    <option>Record of Changes | Samulnori | Korea | 2.95</option>
                    <option>Djelika | Tounami Diabate | Mali | 4.95</option>
                    <option>Rapture | Nusrat Fateh Ali Khan | Pakistan | 2.95</option>
                    <option>Cesaria Evora | Cesaria Evora | Cape Verde | 6.95</option>
                    <option>Ibuki | Kodo | Japan | 3.95</option>
                </select>
        <input type="hidden" name="action" value="add" />
        <input type="submit" value="Ajouter au Panier" />
          </form>
        
        <jsp:include page="/panier.jsp" />
    </body>
</html>
