<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Blood Bank</title>

        <link href="http://demo.geniusocean.com/bloodbank/assets/admin/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
        <link href="CSS/style.css" rel="stylesheet">
        <link href="CSS/responsive.css" rel="stylesheet">
    <link rel="icon" type="image/png" href="">         
    </head>
    <body>
        <section class="login-area">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 col-lg-offset-3 col-md-8 col-md-offset-2 col-sm-10 col-sm-offset-1">
                        <div class="login-form">
                            <div class="login-icon"><i class="fa fa-user"></i></div>
                            
                            <div class="section-borders">
                                <span></span>
                                <span class="black-border"></span>
                                <span></span>
                            </div>
                            
                            <div class="login-title">Please Sign In</div>

                            <form action="adminController" method="POST">
                            <input type="hidden" name="_token" value="77Nd9ylu51LTNet3N8xJT0oqRWley8tvtNx7Q14y">
                              <div class="form-group">
                                <div class="input-group">
                                  <div class="input-group-addon">
                                      <i class="fa fa-envelope"></i>
                                  </div>
                                  <input type="email" name="adminUsername" class="form-control" placeholder="Type Email Address" required="">
                                </div>
                              </div>
                              <div class="form-group">
                                <div class="input-group">
                                  <div class="input-group-addon">
                                        <i class="fa fa-unlock-alt"></i>
                                    </div>
                                  <input type="password" class="form-control" name="adminPassword" placeholder="Type Password" required="">
                                </div>
                              </div>
                              <div class="form-group text-center">
                                    <button type="submit" class="btn login-btn" >LOGIN</button>
                              </div>
                            </form>
                        </div>
                    </div>
                </div>

            </div>
        </section>
        
        

        <script src="http://demo.geniusocean.com/bloodbank/assets/admin/js/jquery.min.js"></script>
        <script src="http://demo.geniusocean.com/bloodbank/assets/admin/js/bootstrap.min.js"></script>
        <script src="http://demo.geniusocean.com/bloodbank/assets/admin/js/main.js"></script>
    </body>
</html>
