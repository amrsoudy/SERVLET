function creeCookie(x){
    alert("java script");
    var expireDate = new Date();
    expireDate.setMonth(expireDate.getMonth()+6);
    document.cookie ="lang="+x+";expires="+expireDate.toGMTString()+";tel=555555555";
    
    
    
}



