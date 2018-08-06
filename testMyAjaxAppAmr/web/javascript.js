var req;
var completeFileld;
var completeTable;
var autoRow;

function init() {
    completeFileld = document.getElementById("complete-field");
    completeTable = document.getElementById("complete-table");
    autoRow = document.getElementById("auto-row");
    completeTable.style.top = getElementY(autoRow) + "px";


}


function doCompletion() {
    initRequest();
    url = "AutoComplete?action=complete&id="+escape(completeFileld.value);
    req.open("GET",url,true);
    req.onreadystatechange = callback;
    req.send(null);

}
function initRequest() {

    req = new XMLHttpRequest();

}
function callback(){
    
    if((req.readyState == 4)&&(req.status == 200)){
        
       parsMessage(req.responseXML);
        
        
    }
    
    
}

function parsMessage(responseXML){
    
  if (responseXML == null) {
      
      return flase;
      
  } else{
      
      
      
  }
    
}

function getElementY(element) {

    var targetTop = 0;

    if (element.offsetParent) {
        while (element.offsetParent) {
            targetTop += element.offsetTop;
            element = element.offsetParent;
        }
    } else if (element.y) {
        targetTop += element.y;
    }
    return targetTop;
}