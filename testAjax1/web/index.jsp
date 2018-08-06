<%-- 
    Document   : newjspindex
    Created on : 2018-08-05, 13:10:13
    Author     : AMR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="maForm">

            <table border="1">

                <tbody>
                    <tr>
                        <td>Temp1</td>
                        <td><input type="text" name="temp1" value="0" size="20" onkeyup="calucler(this.value)"/></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" value="convert" /></td>

                    </tr>
                    <tr>
                        <td>Temp2</td>
                        <td><input type="text" name="res" value="0" size="20" /></td>
                    </tr>
                </tbody>
            </table>



        </form>
        <div id="result"></div>

        <script src="scripts/js.js" type="text/javascript"></script>
    </body>
</html>
