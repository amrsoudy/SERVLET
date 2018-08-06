var requet;
function show(letter) {
    letter = escape(letter).trim();
    requet = new XMLHttpRequest();
    url = "searchWords";
    requet.onreadystatechange = afficher;

    requet.open("POST", url, true);
    requet.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');

    requet.send("letter="+letter);

}

function afficher(){
    
if((requet.readyState == 4 )&&(requet.status == 200)){
    
    document.getElementById("res").innerHTML = requet.responseText;
    
    
    
    
}    
    
    
}

