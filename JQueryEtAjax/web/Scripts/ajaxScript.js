$(document).ready(function(){
    
   $("button").click(function(){
       
      $.ajax({
          
          url ="MaServlet",
          success:function(resultat){$("#div").html(resultat);}
          
      }
              ); 
       
       
   }
           );
    
}
        );
