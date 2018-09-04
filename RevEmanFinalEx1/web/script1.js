var list = [];
var count = 0;
function InsertObject() {

    var ville = document.getElementById("Ville").value;
    var date = document.getElementById("date").value;
    var tempMatin = document.getElementById("tempMatin").value;
    var tempApremidi = document.getElementById("tempApremidi").value;
    var tempSoire = document.getElementById("tempSoire").value;
    var tempNuit = document.getElementById("tempNuit").value;
    var etat = document.getElementsByName("etat");
    document.getElementsByClassName()
    
    for(var i=0,lenght = etat.length; i < lenght ; i++){
        if(etat[i].checked){
            var etatVal = etat[i].value;
            break;
        }
    }
    
    




    var payeNom = document.getElementById("payeNom").value;
    var NoHabitant = document.getElementById("NoHabitant").value;
    var payeNom = document.getElementById("payeNom").value;
    var continent = document.getElementById("continent").value;

    list.push({"ville": ville, "date": date,"temp":[tempMatin,tempApremidi,tempSoire,tempNuit],"etat":etatVal});



}

function lireJson() {

    for (var i in list) {

        document.getElementById("afficher").innerHTML += list[i].ville + "<br />";
        document.getElementById("afficher").innerHTML += list[i].date + "<br />";
      
        
        for(var g in list[i].temp ){
            
                    document.getElementById("afficher").innerHTML += list[i].temp[g] ;
  
        }

                 document.getElementById("afficher").innerHTML += list[i].etat + "<br />";



    }



}