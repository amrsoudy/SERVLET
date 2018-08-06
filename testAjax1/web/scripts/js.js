var requet;
function calculinit() {
    requet = new XMLHttpRequest();


}
function calucler(vtc) {
    calculinit();
    url = "convertTemp";
    requet.onreadystatechange = afficher;

    requet.open("POST", url, true);
    requet.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');

    requet.send("vtc=" + vtc);



}
function afficher() {
    if ((requet.readyState == 4) && (requet.status == 200)) {
        document.maForm.res.value = requet.responseText;
        document.getElementById("result").innerHTML = requet.responseText;
    }


}