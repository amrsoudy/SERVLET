//
//$(document).ready(function(){
//    
//   $("button").click(function(){
//       
//      $.getJSON("MaServlet", function (result){
//          
//          $.each(result,function(i,field){$("div").append(field+" ")})
//          
//          
//      });
//        
//              
//       
//       
//   }
//           );
//    
//}
//        );


$(document).ready(function(){
   
   $("button").click(function(){
       
      $.post("autreServlet",
      {
          //ici verifi  que ce que  la pon  fascon 
          text1 : $("input#text1").val(),
          text2 : $("input#text2").val()
      }
       ,
      function (result){
          
          $("h2").text(result);
          
          
      });
        
              
       
       
   });
    
});
