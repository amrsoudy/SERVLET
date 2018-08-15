function clikmetoShowFullName() {
    var person, i, x = "";
    person = {
        "firstName": ["John", "Amr", "Ahmed"],
        "lastName": "Doe",
        "id": 5566,
        fullName: function (i) {
            return this.firstName[i] + " " + this.lastName;
        }
    };

    for (i in person.firstName) {

        document.getElementById("demo").innerHTML += person.fullName(i) + "<br>";
    }
}

function clikmetoShowAddress() {

    var personee = {
        "nom": "Amr",
        "prenom": "Seoudy",
        "age": 32,
        adress: {"num": 1105, "rue": "juel poitra", "ville": "Montral"},
        telephone: ["44444444", 666666666]


    };
    personee.telephone[2] = "99999999";
    personee.adress.province = "Montreal";
    document.getElementById("demo").innerHTML += personee.adress.province + "<br>";
    for (i in personee.telephone) {

        document.getElementById("demo").innerHTML += personee.telephone[i] + "<br>";



    }

}
var req;
function calcule() {

    var val1 = document.getElementById("val1").value;
    req = new XMLHttpRequest();
    var url = "serv_main?val1=" + val1;
    req.open("GET", url, true);
    req.onreadystatechange = afficher;
    req.send();

}

function afficher() {

    if ((req.readyState == 4) && (req.status == 200)) {

        var x = JSON.parse(req.responseText);

        document.getElementById("demo").innerHTML = x.firstname;
        document.getElementById("demo1").innerHTML = x.lastname;
        
        
        var listage = x.age ;
        document.getElementById("demo2").innerHTML = listage[1];





    }


}