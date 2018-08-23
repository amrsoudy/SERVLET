function cacher() {

    $('#p1').hide();


}
var count = 0;
$(document).ready(function () {

    $("button").click(function () {
        if (count == 0) {
            $("p").hide(2000);
            count++;


        } else {

            $("p").toggle(2000);
            count = 0;

        }
        //  $("#p3").hide();
    });

});