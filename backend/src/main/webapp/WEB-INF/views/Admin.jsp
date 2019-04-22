<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
        
        <link rel="stylesheet" type="text/css" href="CSS/home.css">
	<script src="js/chart.js"></script>
        <style type="text/css">
          .container{min-width: 100%;overflow: hidden;}
          .left-side {
              background-color: #FC575E;
              width: 18%;
              position: absolute;
              border: none;
              overflow: hidden;
          }
          .right-side {
              background-color: #f5f5f5;
              width: 82%;
              margin-left: 18%;
              z-index: 1;
          }
          .dashboard-header-area {
              padding: 15px 0 0px 0;
          }
          
          .panel {
			    margin-bottom: 20px;
			    background-color: #fff;
			    border: 1px solid transparent;
			        border-top-color: transparent;
			        border-right-color: transparent;
			        border-bottom-color: transparent;
			        border-left-color: transparent;
			    border-radius: 4px;
			    -webkit-box-shadow: 0 1px 1px rgba(0,0,0,.05);
			    box-shadow: 0 1px 1px rgba(0,0,0,.05);
		   }
		   
		   .panel-default {
			    border-color: #ddd;
			}
		   
		   .panel-body {
			    padding: 15px;
			}
		   .panel-heading {
			    padding: 10px 15px;
			    border-bottom: 1px solid transparent;
			        border-bottom-color: transparent;
			    border-top-left-radius: 3px;
			    border-top-right-radius: 3px;
			}
			.title-stats.title-blue {
			    background-color: #0073b7;
			}
			.title-stats {
			    position: relative;
			    display: block;
			    background-color: #303641;
			    color: #fff;
			    padding: 10px 20px 20px;
			    margin-bottom: 30px;
			    border-radius: 5px;
			    transition: .4s;
			}
			.title-stats .icon {
			    color: rgba(0, 0, 0, 0.1);
			    position: absolute;
			    right: 5px;
			    bottom: 8px;
			}
						
			.title-stats .icon i {
			    font-size: 100px;
			    line-height: 0;
			}
			.title-stats .number {
			    font-size: 38px;
			    font-weight: 600;
			    color: white;
			}
			
			.title-view-btn {
			    background-color: #fff;
			    border-radius: 30px;
			    display: inline-block;
			    padding: 3px 8px;
			    color: #000;
			    font-size: 12px;
			}
			.title-stats h4 {
			    margin-bottom: 10px;
			    font-weight: 100;
			}
			
          .panel.admin {margin-top: 15px; margin-bottom: 15px; border-radius: 0;margin-left: 15px;}
          .panel.admin.top-reference-area {margin-top: 55px;}
          .panel-default.admin>.panel-heading {background-color: #fff; font-size: 25px;}
          .panel-default > .panel-heading {
              font-size: 30px;
              font-weight: 700;
              border-color: #ddd;
          }
          .panel-body.dashboard-body {padding: 0 15px;}
          
          .title-stats.title-green {
              background-color: #00a65a;
          }
          .title-stats.title-gray {
              background-color: #8A6D3B;
          }
          .title-stats {
			    color: #fff;
			}
          
          
          .title-stats.title-blue:hover {background-color: #00639e;}
			.title-stats.title-green:hover {background-color: #008d4c;}
			.title-stats.title-skyblue:hover {background-color: #009AC0;}
			.title-stats.title-red:hover {background: #f4543c;}
			.title-stats.title-gray:hover {background-color: #7C6235;}
          .leftcol {
             overflow:hidden;
          }

          .rightcol {
             overflow-x: hidden;
            overflow-y: scroll;
             
          }
          .scrollit{
            overflow-y: scroll;
          }

          .rightcol::-webkit-scrollbar {
            display: none;
          }
          
          
            .example-1 {
            position: relative;
            overflow-y: scroll;
            height: 500px; }
            
            .example-1::-webkit-scrollbar {
            display: none;
          }
          
            .example-2 {
            position: relative;
            overflow-y: scroll;
            height: 500px; }
            
           .example-2::-webkit-scrollbar {
            display: none;
          }
          .example-3 {
            position: relative;
            overflow-y: scroll;
            height: 500px; }
            
           .example-3::-webkit-scrollbar {
            display: none;
          }
          
          .example-4 {
            position: relative;
            overflow-y: scroll;
            height: 500px; }
            
           .example-4::-webkit-scrollbar {
            display: none;
          }
          
          .example-5 {
            position: relative;
            overflow-y: scroll;
            height: 500px; }
            
           .example-5::-webkit-scrollbar {
            display: none;
          }
            .nonedisplay{
              visibility: hidden;
            }

            .b{
              background-color: #FC575E;
              margin-bottom: 5px;
              border: none;
            }
            
            
            
            
            .flip-card {
			  background-color: transparent;
			  width: 300px;
			  height: 300px;
			  perspective: 1000px;
			}
			
			.flip-card-inner {
			  position: relative;
			  width: 100%;
			  height: 100%;
			  text-align: center;
			  transition: transform 0.6s;
			  transform-style: preserve-3d;
			  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
			}
			
			.flip-card:hover .flip-card-inner {
			  transform: rotateY(180deg);
			}
			
			.flip-card-front, .flip-card-back {
			  position: absolute;
			  width: 100%;
			  height: 100%;
			  backface-visibility: hidden;
			}
			
			.flip-card-front {
			  background-color: #bbb;
			  color: black;
			  z-index: 2;
			}
			
			.flip-card-back {
			  background-color: #2980b9;
			  color: white;
			  transform: rotateY(180deg);
			  z-index: 1;
			}
</style>


        </style>
        <script>
          $(document).ready(function(){
        	
            $(".tag1").click(function(){
              $(".reference-OS-area").hide();
              $(".example-1").show();
              $(".example-2").hide();
              $(".example-3").hide();
              $(".example-4").hide();
              $(".example-5").hide();
            });
            $(".tag2").click(function(){
                $(".reference-OS-area").hide();
                $(".example-1").hide();
                $(".example-2").show();
                $(".example-3").hide();
                $(".example-4").hide();
                $(".example-5").hide();
              });
            $(".tag3").click(function(){
                $(".reference-OS-area").hide();
                $(".example-1").hide();
                $(".example-2").hide();
                $(".example-3").show();
                $(".example-4").hide();
                $(".example-5").hide();
              });
            $(".tag4").click(function(){
                $(".reference-OS-area").hide();
                $(".example-1").hide();
                $(".example-2").hide();
                $(".example-3").hide();
                $(".example-4").show();
                $(".example-5").hide();
              });
            $(".tag5").click(function(){
                $(".reference-OS-area").hide();
                $(".example-1").hide();
                $(".example-2").hide();
                $(".example-3").hide();
                $(".example-4").hide();
                $(".example-5").show();
              });
            $(".tag6").click(function(){
                $(".reference-OS-area").show();
                $(".example-1").hide();
                $(".example-2").hide();
                $(".example-3").hide();
                $(".example-4").hide();
                $(".example-5").hide();
              });
            
          });
          


                
        </script>
</head>
<body> 
  <div class="header">
    <a href="#" class="logo"><img class="logo" src="image/logocts.png"></a>
    <div class="header-right">
      <a class="text2" href="#home">How it Works</a>
      <a class="text2" href="#">Home</a>
      <a id="red" href="#about">EMERGENCY</a>
    </div>
  </div>

        <div class="container">
          <div class="row" style="overflow:hidden !important;">
            <div class="left-side leftcol fixed" style="height: 94.4%;">
            
                
                
      
                  <div class="card" style="background-color: #FC575E; border: none;">
                  
                    <img class="card-img-top" src="image/a1.png" alt="Card image" style="width:90%;height:180px;margin-left: 12px;">
                    <div class="card-body text-center">
                      <p class="card-title" style="font-size: 25px;color: white;">Admin Name<i class="fa fa-angle-down" data-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample"></i></p>
                      <div class="collapse" id="collapseExample">
						  <div>
						    <a class="btn btn-primary b" href="GetDetail?empId=${emp.empId}">Edit Profile</a><br>
                      		<a class="btn btn-primary b" href="GetDetail?empId=${emp.empId}">Add Admin</a><br>
                      		<a class="btn btn-primary b" href="adminlogout">Logout</a><br>
						  </div>
						</div>
					  <a class="btn btn-primary b tag6" onclick="myFunction()">Dashboard</a><br>
                      <a class="btn btn-primary b tag1" onclick="myFunction()">Donor List</a><br>
                      <a class="btn btn-primary b tag2" onclick="myFunction()">Blood Types</a><br>
                      <a class="btn btn-primary b tag3" onclick="myFunction()">Campaign</a><br>
                      <a class="btn btn-primary b tag4" onclick="myFunction()" <%-- href="GetDetail?empId=${emp.empId}" --%>>Accept Campaign</a><br>
                      <a class="btn btn-primary b tag5" onclick="myFunction()" <%-- href="GetDetail?empId=${emp.empId}" --%>>Accept Review</a><br>
                      <a class="btn btn-primary b" href="GetDetail?empId=${emp.empId}">Accept NGO</a><br>
                      
                    </div>
                  </div>
                  
                
            <!-- Ending of Dashboard Sidebar menu area --> 
            </div>
                   <div class="right-side " >
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 fixed">
                        <!-- Starting of Dashboard header items area -->
                        <div class="panel panel-default admin">
                          <div class="panel-heading admin-title" style="margin-left: 15px;">Admin Dashboard!</div>
                              <div class="panel-body dashboard-body">
                                  <div class="dashboard-header-area">
                                    <div class="row">
                                        <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
                                            <a  class="title-stats title-blue" >
                                                <div class="icon" ><i class="fa fa-newspaper-o fa-5x"></i></div>
                                                <div class="number" >${count }</div>
                                                <p style="color: white;">Total Blood Donors!</p>
                                                <span class="title-view-btn tag1" onclick="myFunction()" >View All</span>
                                            </a>
                                        </div>
                                        <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
                                            <a  class="title-stats title-green">
                                                <div class="icon" ><i class="fa fa-sitemap fa-5x"></i></div>
                                                <div class="number" >${typecount }</div>
                                                <p style="color: white;">Total Blood Groups!</p>
                                                <span class="title-view-btn tag2"  onclick="myFunction1()">View All</span>
                                            </a>
                                        </div>
                                        <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
                                            <a  class="title-stats title-gray">
                                                <div class="icon"><i class="fa fa-link fa-5x"></i></div>
                                                <div class="number" >${eventcount }</div>
                                                <p style="color: white;">Total Campaign!</p>
                                                <span class="title-view-btn tag3" onclick="myFunction2()" >View All</span>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- Ending of Dashboard header items area -->
                   <!-- Starting of Dashboard Top reference + Most Used OS area -->
                    <div class="reference-OS-area tag6" id="hides">
                        <div class="row ">
                            <div class="col-lg-6 col-md-6 col-sm-6">
                                <div class="panel panel-default admin top-reference-area" style="margin-left: 15px;">
                                    <div class="panel-heading">Campaign/New Donor</div>
                                    <div class="panel-body">
                                        <div id="chartContainer" style="height: 300px; width: 100%;"></div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-6 col-md-6 col-sm-6">
                                <div class="panel panel-default admin top-reference-area">
                                    <div class="panel-heading">Blood Group Ratio</div>
                                    <div class="panel-body">
                                        <div id="chartContainer1" style="height: 300px; width: 100%;"></div>
                                    </div>
                                </div>
                            </div>
						


                        </div>
                    </div>
					<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
                     <div class="card example-1" id="hides" style="display: none;margin-left: 15px;">
                      <div class="card-body">
                        <div class="row">
	    		
				    		<c:if test="${not empty error}">
			          		<c:out value="${error }"/>
			          		</c:if>
			          		
				    		<c:forEach items="${data}" var="donor">
				    		 
				    		 <div class="col-sm-6 col-md-4 col-lg-3">
				   
				    			<div class="card-rows">
				    			<div class="card">
				    	
							      <img class="card-img-top" src="image/a1.png" alt="Card image">
							      <div class="card-body text-center">
							        <h4 class="card-title">${donor.donorName}</h4>
							      	<p class="card-text">${donor.bloodGroup.bloodType}</p>
							      	<a class="btn btn-primary" href="GetDetail?empId=${donor.donorId}">Edit Profile</a><br><br>
			                        <a class="btn btn-primary" href="Delete?empId=${donor.donorId}">Delete Profile</a>
							      </div>
							    </div>
							    </div>
							    </div>
							    
				    		</c:forEach>
				    		</div>
                      </div>
                    </div>
                    
                    
                    
                    <div class="card example-2" id="hides" style="display: none;margin-left: 15px;">
                      <div class="card-body">
                        <div class="row">
	    		
				    		<c:if test="${not empty error}">
			          		<c:out value="${error }"/>
			          		</c:if>
			          		
				    		<c:forEach items="${data1}" var="bloodGroup">
				    		 
				    		 <div class="col-sm-6 col-md-4 col-lg-3" style="margin-bottom:20px;">
				   
				    			<div class="card-rows">
				    			<div class="card">
				    	
							      <img class="card-img-top" src="image/blo.png" alt="Card image">
							      <div class="card-body text-center">
							        <h4 class="card-title">${bloodGroup.bloodType}</h4>
							      </div>
							    </div>
							    </div>
							    </div>
							    
				    		</c:forEach>
				    		</div>
                      </div>
                    </div>
                    
                    
                    <div class="card example-3" id="hides" style="display: none;margin-left: 15px;">
                      <div class="card-body">
                        <div class="row">
	    		
				    		<c:if test="${not empty error}">
			          		<c:out value="${error }"/>
			          		</c:if>
			          		
				    		<c:forEach items="${data2}" var="event">
				    		 
				    		 <div class="col-sm-6 col-md-4 col-lg-4" style="margin-bottom: 110px;">
				   
				    			<div class="card-rows">
				    			<div class="card" style="width:300px;">
				    			<div class="flip-card">
								  <div class="flip-card-inner">
								    <div class="flip-card-front">
							      <img class="card-img-top" src="image/blo.png" alt="Card image">
							      <div class="card-body text-center">
							        <p class="card-title">${event.eventDate}</p>
							        <p class="card-text">${event.location}</p>
							        
							      </div>
							      </div>
							      <div class="flip-card-back">
								      <p class="card-text">${event.desciption}</p>
								    </div>
							      </div>
							      </div>
							    </div>
							    </div>
							    </div>
							    
				    		</c:forEach>
				    		</div>
                      </div>
                    </div>
                    
                    
                    
                    <div class="card example-4" id="hides" style="display: none;margin-left: 15px;">
                      <div class="card-body">
                        <div class="row">
	    		
				    		<c:if test="${not empty error}">
			          		<c:out value="${error }"/>
			          		</c:if>
			          		
				    		<c:forEach items="${data4}" var="accev">
				    		 
				    		 <div class="col-sm-6 col-md-4 col-lg-3" style="margin-bottom:20px;">
				   
				    			<div class="card-rows">
				    			<div class="card">
				    	
							      <img class="card-img-top" src="image/blo.png" alt="Card image">
							      <div class="card-body text-center">
							        <p class="card-title">${accev.eventDate}</p>
							        <p class="card-text">${accev.location}</p>
							        <p class="card-text">${accev.desciption}</p>
							        <a class="btn btn-primary" href="GetDetail?empId=${accev.eventId}">Accept</a><br><br>
			                        <a class="btn btn-primary" href="Delete?empId=${accev.eventId}">Delete</a>
							      </div>
							    </div>
							    </div>
							    </div>
							    
				    		</c:forEach>
				    		</div>
                      </div>
                    </div>
                    
                    
                    
                <div class="card example-5" id="hides" style="display: none;margin-left: 15px;">
                      <div class="card-body">
                        <div class="row">
	    		
				    		<c:if test="${not empty error}">
			          		<c:out value="${error }"/>
			          		</c:if>
			          		
				    		<c:forEach items="${data3}" var="accrev">
				    		 
				    		 <div class="col-sm-6 col-md-4 col-lg-3" style="margin-bottom:20px;">
				   
				    			<div class="card-rows">
				    			<div class="card">
				    	
							      <img class="card-img-top" src="image/blo.png" alt="Card image">
							      <div class="card-body text-center">
							        <p class="card-title">${accrev.name}</p>
							        <p class="card-text">${accrev.quote}</p>
							        <a class="btn btn-primary" href="GetDetail?empId=${accrev.reviewId}">Accept</a><br><br>
			                        <a class="btn btn-primary" href="Delete?empId=${accrev.reviewId}">Delete</a>
							      </div>
							    </div>
							    </div>
							    </div>
							    
				    		</c:forEach>
				    		</div>
                      </div>
                    </div>
                    <!-- Ending of Dashboard Top reference + Most Used OS area -->

                </div>
            </div>
          </div>
        </div>
    </div>

</div>
<script>

function myFunction() {
   var element = document.getElementById("myDIV");
   element.classList.toggle("nonedisplay");
}
</script>
</body>
</html>