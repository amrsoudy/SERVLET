/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var count = 0;
function increase(x) {
    if (x.checked) {
        count++;
        document.getElementById("bascet").value = count;

    } else {

        count--;
        document.getElementById("bascet").value = count;


    }



}
;