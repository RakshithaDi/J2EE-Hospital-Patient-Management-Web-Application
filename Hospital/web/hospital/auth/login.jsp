<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Log In</title>
    <link rel="icon" href="../assets/img/logo.png">
    <link rel="stylesheet" href="../assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:400,600,700">
    <link rel="stylesheet" href="../assets/fonts/fontawesome-all.min.css">
    <link rel="stylesheet" href="../assets/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="../assets/fonts/ionicons.min.css">
    <link rel="stylesheet" href="../assets/fonts/fontawesome5-overrides.min.css">
    <link rel="stylesheet" href="../assets/css/Contact-Form-Clean.css">
    <link rel="stylesheet" href="../assets/css/Footer-Basic.css">
    <link rel="stylesheet" href="../assets/css/Footer-Clean.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
    <link rel="stylesheet" href="../assets/css/Login-Form-Clean.css">
    <link rel="stylesheet" href="../assets/css/Login-Form-Dark.css">
    <link rel="stylesheet" href="../assets/css/Navbar-Dropdown-List-Item.css">
    <link rel="stylesheet" href="../assets/css/Navigation-with-Button.css">
    <link rel="stylesheet" href="../assets/css/Navigation-with-Search.css">
    <link rel="stylesheet" href="../assets/css/styles.css">
    
   
    

</head>

     <%
          
       
        String message = (String)session.getAttribute("message");
        
        %>

<body style="background: url(&quot;../assets/img/pexels-tara-winstead-7722646.jpg&quot;) center / contain;">
 
    <section class="login-dark" style="background: url(&quot;../assets/img/pexels-tara-winstead-7722646.jpg&quot;) center / cover, rgb(71, 93, 98);opacity: 1;transform: perspective(0px);">
        <form method="post" action="../../Login" style="background: rgb(248,248,248);">
            <div class="text-center"><span>t<i class="fa fa-hospital-o" style="color: rgb(41,41,41);font-size: 31px;"></i></span><br>
                <h4 class="text-center" style="color: rgb(57,57,57);font-size: 18px;">Welcome to the Central Hospital Digital Work Area</h4><br>
                <h4 class="text-center" style="color: rgb(84,84,84);font-size: 18px;">Log in to continue</h4>
            </div>
            <div class="form-group"><input class="border rounded-0 form-control" type="text" name="username" placeholder="Username" style="color: rgb(0,0,0);height: 45px;" required=""></div>
            <div class="form-group"><input class="border rounded-0 form-control" type="password" name="password" placeholder="Password" style="color: rgb(0,0,0);height: 45px;" required=""></div>
            <div class="form-group">
                <div class="form-check"><input class="form-check-input" type="radio" id="usertype" name="usertype" value="Admin"><label class="form-check-label" for="formCheck-3" style="color: rgb(0,0,0);">Admin</label></div>
                <div class="form-check"><input class="form-check-input" type="radio" id="usertype" name="usertype" value="Doctor"> <label class="form-check-label" for="formCheck-1" style="color: rgb(0,0,0);">Doctor&nbsp;</label></div>
                <div class="form-check"><input class="form-check-input" type="radio" id="usertype" name="usertype" value="Pharmacist"><label class="form-check-label" for="formCheck-2" style="color: rgb(0,0,0);">Pharmacist</label></div>
                <div class="form-check"><input class="form-check-input" type="radio" id="usertype" name="usertype" value="Receptionist"><label class="form-check-label" for="formCheck-3" style="color: rgb(0,0,0);">Receptionist</label></div>
            </div>
            <div class="form-group"><button class="btn btn-primary btn-block" type="submit" style="background: var(--blue);">LOG IN</button></div><a class="forgot" href="#">Forgot your email or password?</a><br>
            <p style="color:red"><%=message%>!</p>
        </form>
    </section>
    <script src="../assets/js/jquery.min.js"></script>
    <script src="../assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="../assets/js/bs-init.js"></script>
</body>

</html>