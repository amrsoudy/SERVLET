
var requete ; 
function calculer(){
    
  requete =  new XMLHttpRequest();
  //avec  get 
//  url="convertiTemp?vtc="+document.maForm.vtc.value;
//  requete.open("GET",url,true);
//  requete.onreadystatechange=afficher;
//  requete.send(null);

//Avec Post 
url="convertiTemp";
requete.open("POST",url,true);
requete.onreadystatechange=afficher;
var parameters = "vtc="+document.maForm.vtc.value;
requete.setRequestHeader('Content-type','application/x-www-form-urlencoded');
requete.send(parameters);
    
    
    
    
}
function afficher(){

    if ((requete.readyState == 4)&&(requete.status == 200)){
        
        alert(requete.responseText);
        document.maForm.resultat.value = requete.responseText;
        document.getElementById("res").innerHTML=requete.responseText;
        
        
    }
    
    
    
    
}