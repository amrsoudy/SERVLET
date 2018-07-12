

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="scripts/scriptAjax.js" 
        type="text/javascript"></script>

    </head>
    <body >
  <form name="maForm">
      <table border="2">
         <tr>
             <td colspan="2">TempCel
               <input name="vtc" onkeyup="calculer()"  /></td>
         </tr>
         <tr>
           <td colspan="2"> <input type="button"  value="Convertir une unité"  onclick="calculer()"/></td>
           
         </tr>
         <tr>
          <td colspan="2">Resultat
              <input type="text"  name="resultat" /> </td>
         </tr>
       </table>
        </form>
       
        <br><br>
        <div id="res" ></div>
        <table id="resultats"/>
</body>
</html>
