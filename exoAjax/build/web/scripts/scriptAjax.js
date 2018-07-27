function initRequest() {
    if (window.XMLHttpRequest) {
        if (navigator.userAgent.indexOf('MSIE') != -1) {
            isIE = true;
        }
        return new XMLHttpRequest();
    } else if (window.ActiveXObject) {
        isIE = true;
        return new ActiveXObject("Microsoft.XMLHTTP");
    }
}
var requete;
function calculer()
{
    
    requete = new XMLHttpRequest();

    url="ConvertirTemp?vtc="+document.maForm.vtc.value;

  
    requete.onreadystatechange = afficher;
    
    requete.open("GET",url,true);
    
    requete.send(null);
}
function afficher()
{
   if ((requete.readyState == 4) && (requete.status == 200))
   {
    
    //alert(requete.responseText);
    document.maForm.resultat.value=requete.responseText;
    
    document.getElementById("res").innerHTML=requete.responseText;

  }
 // else
 //     alert("Erreur sur appel AJAX"+"req.readySate"+requete.readyState+"status="+requete.status);
}

//OAjax.setRequestHeader('Content-type','application/x-www-form-urlencoded');
 //OAjax.send('Id='+Id+'&Nom='+Nom);

function calculerPost(vtc)
{

   requete = initRequest();

    url="ConvertirTemp";// url pattern de servlet

    requete.onreadystatechange = afficher; // fonction de callback

    requete.open("POST",url,true);

   
    requete.setRequestHeader('Content-type','application/x-www-form-urlencoded');
    
    requete.send("vtc="+vtc);
    
}

