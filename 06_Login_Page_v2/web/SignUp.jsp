<%-- 
    Document   : SignUp
    Created on : 26-Mar-2023, 12:49:49 am
    Author     : krtuh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    </head>
    <body style="background: url(image/img.png); background-size: cover; background-attachment: fixed;">
        <div class="container">
            <div class="row">
                <div class="col m6 offset-m3">
                    <div class="card">
                        <div class="card-content center-align">
                            <h3 class="center-align" style="margin-top: 7px;">Register here...!!</h3>
                            
                            <!--success of failure message-->
                            <h5 class="center-align" id="msg"></h5>
                            <!--creating form-->
                            
                            <div class="form">
                                <form action="Register" method="post" id="myForm">
                                    <input name="user_name" type="text" placeholder="Enter your name">
                                    <input name="user_password" type="password" placeholder="Enter your password">
                                    <input name="user_email" type="email" placeholder="Enter your email">
                                    
<!--                                    <div class="file-field input-field">
                                        <div class="btn">
                                          <span>File</span>
                                          <input name="image" type="file">
                                        </div>
                                        <div class="file-path-wrapper">
                                          <input class="file-path validate" type="text">
                                        </div>
                                      </div>-->
                                    
                                    <button class="btn   #26c6da cyan lighten-1" type="submit">Submit</button>
                                </form>
                                
                            </div>
                            <div class="loder" style="margin-top: 10px; display: none">
                                <div class="preloader-wrapper big active">
                                <div class="spinner-layer spinner-blue">
                                  <div class="circle-clipper left">
                                    <div class="circle"></div>
                                  </div><div class="gap-patch">
                                    <div class="circle"></div>
                                  </div><div class="circle-clipper right">
                                    <div class="circle"></div>
                                  </div>
                                </div>

                                <div class="spinner-layer spinner-red">
                                  <div class="circle-clipper left">
                                    <div class="circle"></div>
                                  </div><div class="gap-patch">
                                    <div class="circle"></div>
                                  </div><div class="circle-clipper right">
                                    <div class="circle"></div>
                                  </div>
                                </div>

                                <div class="spinner-layer spinner-yellow">
                                  <div class="circle-clipper left">
                                    <div class="circle"></div>
                                  </div><div class="gap-patch">
                                    <div class="circle"></div>
                                  </div><div class="circle-clipper right">
                                    <div class="circle"></div>
                                  </div>
                                </div>

                                <div class="spinner-layer spinner-green">
                                  <div class="circle-clipper left">
                                    <div class="circle"></div>
                                  </div><div class="gap-patch">
                                    <div class="circle"></div>
                                  </div><div class="circle-clipper right">
                                    <div class="circle"></div>
                                  </div>
                                </div>
                              </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
        <script
            src="https://code.jquery.com/jquery-3.6.4.min.js"
            integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8="
            crossorigin="anonymous">
        </script>
  
        <script>
            $(document).ready(function(){
                console.log("ready....!!");

                $("#myForm ").on('submit',function(event){
                    event.preventDefault();
                    var f = $(this).serialize();
                //    let f = new FormData(this);
                    console.log(f);

                    $('.loder').show();
                    $(".form").hide();


                    $.ajax({
                        url: "Register",
                        data:f,
                        type:"POST",
                        success: function(data,textStatus, jqXHR){
                            console.log(data);
                            console.log("Success..");

                            $('.loder').hide();
                            $(".form").show();

                            if(data.trim()=="done"){
                                $('#msg').html("Registered successfully..!")
                                $('#msg').addClass("green-text")

                            }else{
                                $("#msg").html("Something went wrong....!!")
                                $('#msg').addClass("red-text")
                            }
                        },
                        error: function(jqXHR,textStatus,ErrorThrown){
                            console.log(data);
                            console.log("Error....");

                            $('.loder').hide();
                            $(".form").show();
                        }
                    })
                })
            })
        </script>
    </body>
</html>
