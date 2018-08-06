<%-- 
    Document   : newjspindex
    Created on : 2018-08-05, 14:58:47
    Author     : AMR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="stylesheet.css">

    </head>
    <body onload="init()">
        <h1>Auto-Completion using AJAX</h1>

        <p>Cet exemple montre la technique "real time auto-completion" en utiliant  AJAX(Asynchronous
            JavaScript and XML)</p>

        <p>In the form below enter a name. Possible names that will be completed are displayed below
            the form. For example, try typing in &quot;Bach,&quot &quot;Mozart,&quot; or &quot;Stravinsky,&quot;
            then click on one of the selections to see composer details.</p>
        <form name="autofillform" action="autocomplete">
            <table border="0" cellpadding="5"> 
                <tbody>
                    <tr>
                        <td><strong>Composer Name:</strong></td>
                        <td> <input type="text"size="40" id="complete-field" onkeyup="doCompletion()"> </td>
                    </tr>
                    <tr>
                        <td id="auto-row" colspan="2">
                            <table id="complete-table" class="popupBox" />
                        </td>
                    </tr>
                </tbody>
            </table>
        </form>
        <script src="javascript.js" type="text/javascript"></script>
    </body>
</html>
