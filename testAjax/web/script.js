var req = ""
function init(){
    
    req = new XMLHttpRequest();
    
    
    
}
function doSearch(x){
    
    init();
    url = "serv1";
    req.onreadystatechange = afficher;
    req.open("POST",url,true);
    req.setRequestHeader('Content-type','application/x-form-urlencoded');
    req.send("vtc="+x);
    

}
function afficher(){
    
    if((req.readyState == 4)&&(req.status == 200)){
        
        document.getElementById("div1").innerHTML=req.responseText;
        
        
        
    }
    
}