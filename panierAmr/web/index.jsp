<%-- 
    Document   : index
    Created on : 2018-07-30, 14:33:52
    Author     : AMR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
 <title>Music Without Borders</title>
</head>
<body bgcolor="#33EEFF">

    <h1> Musique sans frontières </h1>

 <hr><p>


        <form action="main_servelet" method="POST">
            <div class="container">  
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

                quantity <input type="text" name="qty" value="1" size="10" />
                <input type="hidden" name="action" value="add" />
                <input type="submit" value="ajouter Panier" />
            </div>
        </form>
        <jsp:include page="panier.jsp" /> 
    </body>
</html>
