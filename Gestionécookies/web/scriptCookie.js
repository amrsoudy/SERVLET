var Username;
function creeCookie(f){
    
    UserName=f;
    var expireDate = new Date();
    expireDate.setMonth(expireDate.getMonth()+6);
    document.cookie ="user name="+UserName+";expires"+expireDate.toGMTString();
    
    
}
function lireCookie(){
    UserName = document.cookie.split("=")[1];
document.getElementById("valCookie").innerHTML="cookie username "+UserName;
return UserName;
}
function lireTousLesCookies(){
    
    var tousLesCookie="";
    if(document.cookie == ""){
        
        tousLesCookie ="il ya pas cookie";
        
    }else{
        
      var thisCookie = document.cookie.split(";");
      for(var i =0 ;i<thisCookie.length;i++){
          
       tousLesCookie += "Nom Du Cookie est'"+thisCookie[i].split("=")[0];
       tousLesCookie +="',et sa valeur est '"+thisCookie[i].split("=")[1]+"'<br/>";
       
       document.getElementById("lireTousCookiesss").innerHTML =tousLesCookie;   
          
      }
        
        
    }
    
    
    
}

function lireCookieParam(x){
    
    if(x == ""){
        
        document.getElementById("lireTousCookiesss").innerHTML = "il ya pa cookie";
        
        
    }else{
        
                document.getElementById("lireTousCookiesss").innerHTML = "cookie : " +x;

        
        
        
    }
    
    alert(x);
    
}
