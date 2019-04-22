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
        <link rel="stylesheet" type="text/css" href="CSS/card.css">
        <!-- The styles -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        
        <link rel="stylesheet" type="text/css" href="CSS/home.css">
       
        <style type="text/css">


        </style>

        <style type="text/css">
           .head{
				text-align: center;
			    font-size: 20px;
			    margin-bottom: 30px;
           } 
           .row{
           		margin:30px;
           }
           .colu{
           		display:inline-block;
           }
           .im{
           		display: inline-block;
			    height: 250px;
			    width: 250px;
           }
           .detail{
           		background-color: #FC575E;
           		color:white;
           }
			.leftcol {
			   overflow:hidden;
			   background-color: #FC575E;
			   color:white;
			   height: calc(100% - 51px);  
			   position:absolute;
			}
			
			.rightcol {
			   overflow-x: hidden;
			  overflow-y: scroll;
			   height: 700px;
			   margin-left:320px;
			}
			
			.rightcol::-webkit-scrollbar {
			  display: none;
			}


        </style>
</head>
<body> 
  <div class="header" style="height:51px;">
    <a href="#default" class="logo"><img class="logo" src="image/logocts.png"></a>
    <div class="header-right">
      <a class="text2" href="#home">How it Works</a>
      <a class="text2" data-toggle="modal" data-target="#ModalLoginForm2" >SIGN IN</a>
      <a id="red" href="#about">EMERGENCY</a>
    </div>
  </div>
  
		<div class="col-sm-12 col-md-3 col-lg-3 leftcol fixed">
			<h4 style="font-size:22px;color:white;margin-top:30px;">No. of Blood Bank in City</h4>
		      <c:if test="${not empty error}">
          		<c:out value="${error }"/>
          		</c:if>
          		
	    		<c:forEach items="${data1}" var="bblood">
	    		 
	    		 <div class="colu" style="margin-bottom: 20px;margin-top: 20px;">
	   
	    			<div class="card-rows">
	    			<div class="card">
	    	
				      
				      <div class="card-body text-center">
				        <h4 class="card-title" style="font-size:18px;color:white;">${bblood.bankName}</h4>
				      	<p class="card-text">${bblood.bankPhone}</p>
				      	<p class="card-text">${bblood.address}</p>
				      </div>
				    </div>
				    </div>
				</div>
				    
	    		</c:forEach>
		     	
			       	
		</div>
	    <div class="col-sm-12 col-md-9 col-lg-9 rightcol scrollit">
	    	<h2 class="head">Donor</h2>
	    	<div class="row">
	    		
	    		<c:if test="${not empty error}">
          		<c:out value="${error }"/>
          		</c:if>
          		
	    		<c:forEach items="${data}" var="donor">
	    		 
	    		 <div class="colu">
	   
	    			<div class="card-rows">
	    			<div class="card">
	    	
				      <img class="card-img-top im" src="image/a1.png" alt="Card image">
				      <div class="card-body text-center">
				        <h4 class="card-title">${donor.donorName}</h4>
				      	<p class="card-text">${donor.bloodGroup.bloodType}</p>
				      	<a class="btn btn-primary" href="GetDetail?empId=${emp.empId}">Send Request</a><br><br>
				      </div>
				    </div>
				    </div>
				</div>
				    
	    		</c:forEach>
	    	</div>
		 </div>


 




</body>
</html>