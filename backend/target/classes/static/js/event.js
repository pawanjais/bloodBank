$(document).ready(function() {
	$.ajax({
        type:'GET',
        url:"onload",
        dataType:'json',
        success: function(data){
        	console.log(data);
               $.each(data, function(index, element){
            	   	
            	   /*	var p= "<p class='quo'><span style='font-size: 15px;font-weight: bolder;'>"+element.name+"</span><br>"+element.quote+"</p>"*/
                    var card = "<div class='mySlides1 fade1'>"
                            +" <div class='di'>"
                            +"<img class='i1' src='image/hh.jpg' width='141px' height='123px'>"
                            +"<div class='quote'>"
                            +"<p class='quo'><span style='font-size: 15px;font-weight: bolder;'>"+element.name+"</span><br>"+element.quote+"</p></div>"
                            
                            +"<div class='round'>"
                        
                            +"<p class='rev'><span style='color:#BF163F;font-size: 12px;'>BLOOD<br>DONOR</span><span style='color:black;font-size: 12px;'>LIFE<br>SAVER</span></p></div>"
                            +"<img class='i2' src='image/yy.jpg' width='141px' height='123px'>"
                            +"</div></div>";
            	   	$('.cover').append(card);
                     
               });
        }
 });



});