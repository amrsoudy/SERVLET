<%-- 
    Document   : index
    Created on : 2018-08-05, 13:49:57
    Author     : AMR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>

    <body class="container" bgcolor="gray">
        <form name="maForm">

            Write what You Want here and start Your Search    <p>
                <input type="text" name="ser" value="" size="60" onkeyup="show(this.value)" />

        </form>
        <div id="res"></div>

        <script src="scripts/js.js" type="text/javascript"></script>
    </body>

</html>
