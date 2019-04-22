<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- saved from url=(0063)https://templates.bwlthemes.com/blood_donation/v_2/home-2.html# -->
<html lang="en"><!--<![endif]--><head><meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        
        <title>Blood Donation</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta name="description" content="Reddrop Buddies - Blood Donation Campaign &amp; Multi-Concept Activism Template">
        <meta name="author" content="xenioushk">
        <link rel="shortcut icon" href="https://templates.bwlthemes.com/blood_donation/v_2/images/favicon.png">

        <!-- The styles -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="test.js"></script>
<style>
* {box-sizing: border-box;}


body { 
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.header {
  overflow: hidden;
  background-color: white;
  padding: 0  150px 0 20px;
  border-bottom: 2px solid rgb(211,211,211,0.6);
}

.header a {
    
  float: left;
  color: black;
  text-align: center;
  padding: 12px 20px;
  text-decoration: none;
  font-size: 12px; 
  font-weight: 100;
  line-height: 25px;
   
}

.header a.logo {
  font-size: 25px;
  font-weight: bold;
  padding: 3px 100px;
}
.header-right a.text1{
    opacity:0.6;
}

#red{

background-color: #FC575E;
color: white;
margin:0;
padding:12px 30px;
font-weight: 300;
font-size: 15px;
}
.header-right {
  float: right;
 
}

.mySlides
 {display: none}
img {
    vertical-align: middle;
    padding-right
}

/* Slideshow container */
.slideshow-container {
  max-width: 1000px;
  position: relative;
  margin: auto;
}

/* Next & previous buttons */
.prev, .next {
  cursor: pointer;
  position: absolute;
  top: 50%;
  width: auto;
  padding: 16px;
  margin-top: -22px;
  color: white;
  font-weight: bold;
  font-size: 18px;
  transition: 0.6s ease;
  border-radius: 0 3px 3px 0;
  user-select: none;
}

/* Position the "next button" to the right */
.next {
  right: 0;
  border-radius: 3px 0 0 3px;
}

/* On hover, add a black background color with a little bit see-through */
.prev:hover, .next:hover {
  background-color: rgba(0,0,0,0.8);
}

/* Caption text */
.text {
  color: #f2f2f2;
  font-size: 15px;
  padding: 8px 12px;
  position: absolute;
  bottom: 8px;
  width: 100%;
  text-align: center;
}

/* Number text (1/3 etc) */
.numbertext {
  color: #f2f2f2;
  font-size: 12px;
  padding: 8px 12px;
  position: absolute;
  top: 0;
}

/* The dots/bullets/indicators */
.dot {
  cursor: pointer;
  height: 15px;
  width: 15px;
  margin: 0 2px;
  background-color: #bbb;
  border-radius: 50%;
  display: inline-block;
  transition: background-color 0.6s ease;
}

.active, .dot:hover {
  background-color: #717171;
}

/* Fading animation */
.fade1 {
  -webkit-animation-name: fade;
  -webkit-animation-duration: 1.5s;
  animation-name: fade;
  animation-duration: 1.5s;
}

@-webkit-keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

@keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}
.cent{
    text-align: center;

}
label, input {
    /* in order to define widths */
    display: inline-block;
}
label{
    width:35%;
  padding: 14px 15px;
    margin: 10px 10px;
    border: none;
}
input[type=text], input[type=password],input[type=date] ,input[type=file]{
    
    margin: 10px 25px;
    width: 45%;
    background: transparent;
    padding: 12px 20px;
    
    border: 1px solid #ccc;
    box-sizing: border-box;
    
}
input[type=file]{
  display: inline-block;

}

.but {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 250px;
    border: none;
    cursor: pointer;
    width: 30%;
    align :left;
}

.but:hover {
    opacity: 0.8;
}

::placeholder {
  color: black;
}




@media screen and (max-width: 500px) {
  .header a {
    float: none;
    display: block;
    text-align: left;

  }
  
  .header-right {
    float: none;
  }
  .nonedisplay{
    visibility: hidden;
  }





</style>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
  $(".btn").click(function(){
    $(".slideshow-container").hide();
  });
  $(".btn").click(function(){
    $(".profiles").show();
  });
});


      
</script>

 <body> 
<div class="header colla" id="myNavbar1">
  
  <a href="#default" class="logo"><img class="logo" src="image/logocts.png" style="height: 43px;"></a>
  <div class="header-right">
    <a class="text1" href="#home">How it Works</a>
    <a class="text1" href="#contact" style="margin-right: 30px; ">HOME</a>
    <a id="red" href="#about">EMERGENCY</a>
  </div>

</div>


<div class="col-sm-4 col-xs-4 col-md-4 col-lg-4" style="border-right: solid; color: red; height: 600px; ">
  <div class="container">
  
  <div class="xy cardcol-lg-4 col-md-4 col-xs-4 col-sm-4" style=" color: black; opacity: 0.8; ">
    <h2>Profile</h2>
    <img class="card-img-top" src="image/user.png" alt="Card image" style="width:100%">
    <div class="card-body">
      <h4 class="card-title">${donor.donorName }</h4>
      <p class="card-text">Some example text some example text. ${donor.donorName } is an architect and engineer</p>
      <a href="#" id="hid" class="btn btn-primary" onclick="myFunction()">Edit Profile</a>
      <a href="logOut" id="hid" class="btn btn-primary">Log Out</a>
    </div>
  </div>
</div>
</div>

  
<div class="slideshow-container col-sm-8 col-xs-8 col-md-8 col-lg-8" id="hides" style="padding-top: 200px;">

<div class="mySlides fade1">
  <div class="container" style=" margin: 0px; ">
  <img class="col-sm-3 col-xs-3 col-md-3 col-lg-3" src="image/gallery_1.jpg">
  <img class="col-sm-3 col-xs-3 col-md-3 col-lg-3" src="image/gallery_2.jpg">
  <img class="col-sm-3 col-xs-3 col-md-3 col-lg-3" src="image/gallery_3.jpg">
 </div>
</div>
<div class="mySlides fade1">
  <div class="container" style=" margin: 0px; ">
  <img class="col-sm-3 col-xs-3 col-md-3 col-lg-3" src="image/gallery_4.jpg">
  <img class="col-sm-3 col-xs-3 col-md-3 col-lg-3" src="image/gallery_5.jpg">
  <img class="col-sm-3 col-xs-3 col-md-3 col-lg-3" src="image/gallery_6.jpg">
 </div>
</div>
<div class="mySlides fade1">
  <div class="container" style=" margin: 0px; ">
  <img class="col-sm-3 col-xs-3 col-md-3 col-lg-3" src="image/gallery_7.jpg">
  <img class="col-sm-3 col-xs-3 col-md-3 col-lg-3" src="image/gallery_8.jpg">
  <img class="col-sm-3 col-xs-3 col-md-3 col-lg-3" src="image/gallery_1.jpg">
 </div>
</div>


<br>






<div style="text-align:center">
  <span class="dot" onclick="currentSlide(1)"></span> 
  <span class="dot" onclick="currentSlide(2)"></span> 
  <span class="dot" onclick="currentSlide(3)"></span> 
</div>
</div>



</div>

<div class="profiles col-sm-8 col-xs-8 col-md-8 col-lg-8" id="hides" style="padding-top: 100px; display: none; ">
        <div class="modal-body" style=" opacity: 0.8; ">

        <form role="form" method="POST" action="RegistrationController">
                      <input type="hidden" name="_token" value="">
                      <div class="form-group">
                          <label >Donor Name</label>
                          <input type="text"  name="donorName" value="${donor.donorName }"><br>
                          <label >Donor Password</label>
                          <input type="password"  name="password" value="${donor.password }"><br>
                          <label >Select Blood Group :</label>
                          <select name="bloodGroup.bloodId"  style="width: 30%;" placeholder="Select">
                              <option value="100">A+</option>
                              <option value="101">A-</option>
                              <option value="102">B+</option>
                              <option value="103">B-</option>
                              <option value="104">AB+</option>
                              <option value="105">AB-</option>
                              <option value="106">O+</option>
                              <option value="107">O-</option>
                          </select><br>
                          <label >Select Gender :</label>
                          <select name="gender"  style="width: 30%;" placeholder="Select">
                              <option value="1">MALE</option>
                              <option value="2">FEMALE</option>
                          </select><br>
                          <label >Phone Number</label>
                          <input type="text" name="phoneNo" value="${donor.phoneNo }"><br>
                          <label >Street</label>
                          <input type="text"  name="address.street" value="${donor.address.street }"><br>
                          <label >City</label>
                          <input type="text"  name="address.city" value="${donor.address.city }"><br>
                          <label >State</label>
                          <input type="text"  name="address.state" value="${donor.address.state }"><br>
                          <label >Pincode</label>
                          <input type="text"  name="address.pincode" value="${donor.address.pincode }"><br>
                          <label >Age</label>
                          <input type="text"  name="age" value="${donor.age }"><br>
                          <label >Date of Birth</label>
                          <input type="date"  name="date" value="${donor.date }"><br>
                          <label >Medical History</label>
                          <input type="text"  name="medical" value="${donor.medical }"><br>
                          <button type="submit" class="but">Submit</button>

                      </div>
                      
                  </form>
        
        </div>
  





</div>


<script>

function myFunction() {
   var element = document.getElementById("myDIV");
   element.classList.toggle("nonedisplay");
}

var slideIndex = 1;
showSlides(slideIndex);

function plusSlides(n) {
  showSlides(slideIndex += n);
}

function currentSlide(n) {
  showSlides(slideIndex = n);
}

function showSlides(n) {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  if (n > slides.length) {slideIndex = 1}    
  if (n < 1) {slideIndex = slides.length}
  for (i = 0; i < slides.length; i++) {
      slides[i].style.display = "none";  
  }
  for (i = 0; i < dots.length; i++) {
      dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " active";
}
</script>



<script type="text/javascript">
    function showSlides(n) {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  if (n > slides.length) {slideIndex = 1}    
  if (n < 1) {slideIndex = slides.length}
  for (i = 0; i < slides.length; i++) {
      slides[i].style.display = "none";  
  }
  for (i = 0; i < dots.length; i++) {
      dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " active";
}



</script>


</body>
</html>