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
        <link rel="stylesheet" type="text/css" href="CSS/card.css">
        <!-- The styles -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        
        <link rel="stylesheet" type="text/css" href="CSS/home.css">
       
        
</head>
<body> 
  <div class="header">
    <a href="#default" class="logo"><img class="logo" src="image/logocts.png"></a>
    <div class="header-right">
      <a class="text2" href="#home">How it Works</a>
      <a class="text2" data-toggle="modal" data-target="#ModalLoginForm2" >SIGN IN</a>
      <a id="red" href="#about">EMERGENCY</a>
    </div>
  </div>

  <div class="container1">
    <p style="text-align:center;opacity:0.8;font-size:35px;margin:30px 0 15px 0;">Connecting Blood Donors and Receivers</p>
    <div class="con">
      <div class="online">
        <h4>ONLINE</h4>
      </div>
      <ul>
        <li></li>
        <li></li>
      </ul>
    </div>
    
    <img src="image/test2.jpg">
    
  </div>
  <div class="section1">
    <div class="img-section">
      <button class="btn2" data-toggle="modal" data-target="#ModalLoginForm"><span style="opacity:0.8;">Donate</span></button>
      <button class="btn3" data-toggle="modal" data-target="#ModalLoginForm1"><span style="opacity:0.8;">Find Donor</span></button>
    </div>
  </div> 

  <div class="info">
  	<div class="row">
        <div class="col-sm-4">
        	<h2>5 cr</h2>
        	<p class="info-par"><span>UNITS OF BLOOD IS NEEDED</span><span>IN INDIA EVERY YEAR</span></p>
        </div>
        <div class="col-sm-4">
        	<h2>38 k+</h2>
        	<p class="info-par"><span>BLOOD DONATIONS ARE</span><span>REQUIRED/DAY</span></p>
        </div>
        <div class="col-sm-4 col-left">
        	<h2>300 ml</h2>
        	<p class="info-par"><span>OF BLOOD CAN SAVE</span><span>3 LIVES</span></p>
        </div>
      </div>
  </div>

  <div class="cent">
    <p id="don">CAMPAIGN GALLERY</p>   
    <p id="don2">our prestigious voluntary work on campaigns by the team</p><br>
  </div>
    
  <div class="slideshow-container">

    <div class="mySlides fade1">
      <div class="container-fluid">
        <img class="col-sm-4" src="image/gallery_1.jpg">
        <img class="col-sm-4" src="image/gallery_2.jpg">
        <img class="col-sm-4" src="image/gallery_3.jpg">
      </div>
    </div>

    <div class="mySlides fade1">
      <div class="container-fluid">
        <img class="col-sm-4" src="image/gallery_4.jpg">
        <img class="col-sm-4" src="image/gallery_5.jpg">
        <img class="col-sm-4" src="image/gallery_6.jpg">
      </div>
    </div>
    <div class="mySlides fade1">
      <div class="container-fluid">
        <img class="col-sm-4" src="image/gallery_7.jpg">
        <img class="col-sm-4" src="image/gallery_8.jpg">
        <img class="col-sm-4" src="image/gallery_1.jpg">
      </div>
    </div>
  </div>
  <br>

  <div style="text-align:center">
    <span class="dot" onclick="currentSlide(1)"></span> 
    <span class="dot" onclick="currentSlide(2)"></span> 
    <span class="dot" onclick="currentSlide(3)"></span> 
  </div>

  <div id="image1" >
    <div class=op>
      <p id="don">Organise a Blood Donation Drive</p>
      <p id="don2">A quick, Simple and safe way to give back to your community</p><br>
    </div>
    <button class="btn1"><span style="opacity:0.8;">Get Started</span></button>
  </div>

  <div class="slideshow-container1" style="background-color:#373A4D; text-align: center;">
    <div style="text-align:center;padding-top: 285px;padding-left: 670px; position: absolute;">
      <span class="dot1" onclick="currentSlide1(1)"></span> 
      <span class="dot1" onclick="currentSlide1(2)"></span> 
      <span class="dot1" onclick="currentSlide1(3)"></span> 
    </div>
     <script src="js/event.js"></script>
    <div class="cover">

    </div>
    <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
    <a class="next" onclick="plusSlides(1)">&#10095;</a>
  </div>

  <!-- Modal HTML Markup -->
  <div id="ModalLoginForm" class="modal fade">
      <div class="modal-dialog" role="document">
          <div class="modal-content">
              <div class="modal-header">
                  <h1 class="modal-title">Login</h1>
              </div>
              <div class="modal-body">
                  <form role="form" method="POST" action="RegistrationController">
                      <input type="hidden" name="_token" value="">
                      <div class="form-group">
                          <label >Donor Name</label>
                          <input type="text"  name="donorName" value=""><br>
                          <label >Donor Password</label>
                          <input type="password"  name="password" value=""><br>
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
                          <input type="text" name="phoneNo" value=""><br>
                          <label >Street</label>
                          <input type="text"  name="address.street" value=""><br>
                          <label >City</label>
                          <input type="text"  name="address.city" value=""><br>
                          <label >State</label>
                          <input type="text"  name="address.state" value=""><br>
                          <label >Pincode</label>
                          <input type="text"  name="address.pincode" value=""><br>
                          <label >Age</label>
                          <input type="text"  name="age" value=""><br>
                          <label >Date of Birth</label>
                          <input type="date"  name="date" value=""><br>
                          <label >Medical History</label>
                          <input type="text"  name="medical" value=""><br>
                          <button type="submit" class="but">Submit</button>

                      </div>
                      
                  </form>
                  
              </div>
          </div><!-- /.modal-content -->
      </div><!-- /.modal-dialog -->
  </div><!-- /.modal -->

  <div id="ModalLoginForm1" class="modal fade">
      <div class="modal-dialog" role="document">
          <div class="modal-content">
              <div class="modal-header">
                  <h1 class="modal-title">Login</h1>
              </div>
              <div class="modal-body">
                  <form role="form" method="POST" action="Search">
                      <input type="hidden" name="_token" value="">
                      <div class="form-group">
                          <label >Reciver Name</label>
                          <input type="text"  name="name" value=""><br>
                          <label >Identity Proof</label>
                          <input type="text" name="identity" value=""><br>
                          <label >Phone</label>
                          <input type="text"  name="phone" value=""><br>
                          <label >Upload Blood Request Report</label>
                          <input type="file" name="report" value="fileupload" id="fileupload"><br>
                          <label >Blood Group</label>
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
                          <label >City</label>
                          <input type="text"  name="city" value=""><br>
                          <label >State</label>
                          <input type="text"  name="state" value=""><br>
                          <button type="submit" class="but">Submit</button>

                      </div>
                      
                  </form>
                  
              </div>
          </div><!-- /.modal-content -->
      </div><!-- /.modal-dialog -->
  </div>
  
  
  <div id="ModalLoginForm2" class="modal fade">
      <div class="modal-dialog" role="document">
          <div class="modal-content">
              <div class="modal-header">
                  <h1 class="modal-title">Login</h1>
              </div>
              <div class="modal-body">
                  <form role="form" method="POST" action="LoginController">
                      <input type="hidden" name="_token" value="">
                      <div class="form-group">
                          <label >User Name</label>
                          <input type="text"  name="username" value=""><br>
                          <label >Password</label>
                          <input type="password" name="password" value=""><br>
                          <button type="submit" class="but">Submit</button>

                      </div>
                      
                  </form>
                  
              </div>
          </div><!-- /.modal-content -->
      </div><!-- /.modal-dialog -->
  </div>
  
  
  
  <script src="js/main.js"></script>
</body>
</html>



  
    <!-- <div class="mySlides1 fade1">
      <div class="di">
        <img class="i1" src="image/hh.jpg" width="141px" height="123px">
        <div class="quote">
          <p class="quo"><span style="font-size: 15px;font-weight: bolder;">Naman Gaur</span><br>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s</p>
        </div>
        <div class="round">
          <p class="rev"><span style="color:#BF163F;font-size: 12px;">BLOOD<br>DONOR</span><span style="color:black;font-size: 12px;">LIFE<br>SAVER</span></p>
        </div>
        <img class="i2" src="image/yy.jpg" width="141px" height="123px">
      </div>
    </div>

    <div class="mySlides1 fade1">
      <div class="di">
        <img class="i1" src="image/hh.jpg" width="141px" height="123px">
        <div class="quote">
          <p class="quo"><span style="font-size: 15px;font-weight: bolder;">Palak Srivastava</span><br>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s</p>
        </div>
        <div class="round">
          <p class="rev"><span style="color:#BF163F;font-size: 12px;">BLOOD<br>DONOR</span><span style="color:black;font-size: 12px;">LIFE<br>SAVER</span></p>
        </div>
        <img class="i2" src="image/yy.jpg" width="141px" height="123px">
      </div>
    </div>

    <div class="mySlides1 fade1">
      <div class="di">
        <img class="i1" src="image/hh.jpg" width="141px" height="123px">
        <div class="quote">
          <p class="quo"><span style="font-size: 15px;font-weight: bolder;">Gagan Deep Singh</span><br>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s</p>
        </div>
        <div class="round">
          <p class="rev"><span style="color:#BF163F;font-size: 12px;">BLOOD<br>DONOR</span><span style="color:black;font-size: 12px;">LIFE<br>SAVER</span></p>
        </div>
         <img class="i2" src="image/yy.jpg" width="141px" height="123px">
      </div>
    </div> -->