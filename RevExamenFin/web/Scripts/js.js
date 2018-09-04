//
//var markers = [
//    {
//        name: "Rixo the palm",
//        location: [25.2555, 55.1532]
//    },
//    {
//        name: "Amr et hamid",
//        location: [55.9999, 66.9555]
//
//    },
//    {
//        name: "Mazen et joodi",
//        location: [99.7777, 101.505]
//    }];


//var x  = markers[2].location[1];

//document.getElementById("afficher").innerHTML += x ;


//for (var i in markers) {
//
//    document.getElementById("afficher").innerHTML += markers[i].name + "<br />";
//    for (var j in markers[i].location) {
//
//
//        document.getElementById("afficher").innerHTML += markers[i].location[j] + "<br />";
//
//
//
//    }
//}

var req ;
function lireJson(){
     document.getElementById("afficher").innerHTML = "" ;
    req = new XMLHttpRequest();
    req.onreadystatechange = callback;
    req.open("GET","firstJson.txt",true);
    req.send();
    
    
}
function callback(){
    
    if((req.readyState == 4)&&(req.status  == 200)){
        
        var x =  JSON.parse(req.responseText) ;
        
       
       for(var i in x ){
           
           
                  document.getElementById("afficher").innerHTML += x[i].name + "<br />";
                  for(var j in x[i].location){
                      
                                        document.getElementById("afficher").innerHTML += x[i].location[j] + "<br />";

                      
                  }
  
           
       }
        
    }
    
    
}

