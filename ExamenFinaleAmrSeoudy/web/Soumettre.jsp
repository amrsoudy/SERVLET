<%-- 
    Document   : Soumettre
    Created on : 6 sept. 2018, 09:32:52
    Author     : 1795162
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %>
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="entetePage.jspf" %>
        <fmt:setLocale value="${sessionScope.lang}" />
        <fmt:bundle basename="Lang" >
            
            <h1> <fmt:message key="Message" /></h1>
            
            
        </fmt:bundle>

    <center>
        <form action="srv_souvgarder">
            
            

            <table border="2" width="9" cellspacing="9" cellpadding="7">

                <tbody >
                    <tr>
                        <td style="width: 50px"> numéro </td>
                        <td> <input type="text" name="nomber" value="" placeholder="Ecrire Votre Nomber SVP" size="50px" required/></td>
                    </tr>
                    <tr>
                        <td style="width: 50px">le Poids</td>
                        <td><input type="text" name="poid" value="" placeholder="Ecrire Votre boids SVP" size="50px"  required/></td>
                    </tr>
                    <tr>
                        <td style="width: 50px">Quelle Semaine</td>
                        <td>
                            <select name="select" >
                                <c:forEach var="i" begin="1" end="52" step="1">
                                    
                                    <option style="width: 50px"> ${i}</option>
                                    
                                </c:forEach>



                            </select>
                        </td>
                    </tr>
                    <tr style="align-content: center" >

                        <td colspan="2"> <center><input  type="submit" value="submit" /></center></td>

                </tr>
                </tbody>
            </table>



        </form>

    </center>


</body>
</html>
