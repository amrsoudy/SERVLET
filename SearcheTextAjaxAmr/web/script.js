var completeFiled ;
var completeTable ;
var autorow ;



function init(){
    
  completeFiled = document.maForm.txt1.value ;
  completeTable =document.getElementById("complete-table");
  autorow =document.getElementById("auto-row");
  completeTable.style.top = getElementY(autorow)+"px"

}

function getElementY(element){
    var targetTop = 0 ; 
    
    if(element.offsetParent){
        
        while(element.offsetParent){
            
            
            
        }
        
    }
    
    
    
    
}