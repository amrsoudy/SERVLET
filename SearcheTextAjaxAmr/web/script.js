var completeFiled;
var completeTable;
var autorow;
var req;
var isIE;



function init() {

    completeFiled = document.getElementById("complete-field");
    completeTable = document.getElementById("complete-table");
    autorow = document.getElementById("auto-row");
    completeTable.style.top = getElementY(autorow) + "px";

}

function getElementY(element) {
    var targetTop = 0;

    if (element.offsetParent) {

        while (element.offsetParent) {
            targetTop += element.offsetTop;
            element = element.offsetParent;

        }

    } else if (element.y) {
        targetTop + element.y;

    }
    return targetTop;

}

function doCompletion() {
  

    var url = "autocomplete?action=complete&id=" + escape(completeFiled.value);
    req = initRequest();
    req.open("GET", url, true);
    req.onreadystatechange = callback;
    req.send();


}
function initRequest() {

    if (window.XMLHttpRequest) {
        if (navigator.userAgent.indexOf('MSIE') != 1) {

            isIE = true;

        }
        return new XMLHttpRequest();



    } else if (window.ActiveXObject) {

        isIE = true;
        return new ActiveXObject(Microsoft.XMLHTTP);

    }


}

function callback() {

    clearTabel();
    if (req.readyState == 4 && req.status == 200) {


        parseMessage(req.responseXML);

    }


}
function clearTabel() {

    if (completeTable.getElementsByTagName("tr").length > 0) {

        completeTable.style.display = 'none';
        for (loop = completeTable.getElementsByTagName("tr").length - 1; loop >= 0; loop--) {

            completeTable.removeChild(completeTable.childNodes[loop]);
        }


    }

}

function parseMessage(responseXML) {

    if (responseXML == null) {

        return false;

    } else {

       

        var composers = responseXML.getElementsByTagName("composers")[0];

        if (composers.childNodes.length > 0) {

            completeTable.setAttribute("bordercolor", "black");
            completeTable.setAttribute("class", "liste");


            for (loop = 0; loop < composers.childNodes.length; loop++) {

                var composer = composers.childNodes[loop];
                var firstName = composer.getElementsByTagName("firstName")[0];
                var lastName = composer.getElementsByTagName("lastName")[0];
                var composerId = composer.getElementsByTagName("id")[0];
                

                appendComposer(firstName.childNodes[0].nodeValue, lastName.childNodes[0].nodeValue, composerId.childNodes[0].nodeValue);

            }


        }



    }

}

function appendComposer(firstName, LastName, composerId) {
    var row;
    var cell;
    var linkElement;
    if (isIE) {

        completeTable.style.display = 'block';
        row = completeTable.insertRow(completeTable.rows.length);
        cell = row.insertCell(0);

    } else {

        completeTable.style.display = 'table';
        row = document.createElement("tr");
        cell = document.createElement("td");
        row.appendChild(cell);
        completeTable.appendChild(row);


    }
    cell.className = "popupCell";

    linkElement = document.createElement("a");
    linkElement.className = "popupItem";
    linkElement.setAttribute("href", "autocomplete?action=lookup&id=" + composerId);
    linkElement.appendChild(document.createTextNode(firstName + " " + LastName));
    cell.appendChild(linkElement);


}