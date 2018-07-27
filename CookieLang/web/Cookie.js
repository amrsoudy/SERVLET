function creeCookie(x){
     var expireDate = new Date();
    expireDate.setMonth(expireDate.getMonth()+6);
    document.cookie ="lang="+x+";expires="+expireDate.toGMTString();
  
    
}

function lireCookie (){
    
    var lang = document.cookie.split("=")[1];
    alert(lang);
    
    
};

