<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<style>
body,h1,h2,h3,h4,h5,h6 {font-family: "Lato", sans-serif}
.w3-bar,h1,button {font-family: "Montserrat", sans-serif}
.fa-anchor,.fa-coffee {font-size:200px}
#footer{
    background-color: lightgrey;
}
</style>
</head>
<body>
<!-- Navbar -->
<div class="w3-top">
  <div class="w3-bar w3-red w3-card w3-left-align w3-large">
    <a class="w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-red" href="javascript:void(0);" onclick="myFunction()" title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a>
    <a href="C:\Users\ora\Desktop\Vaccine distribution campaign\Vaccine distribution campaign\index.html" class="w3-bar-item w3-button w3-padding-large w3-hover-white">Home</a>
    <a href="#" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Login</a>
    <a href="http://localhost:8080/index.jsp" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-white">Paths</a>
    <a href="./contactUs.html" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Contact Us</a>
    <a href="aboutUs.html" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">About us</a>
  </div>

  <!-- Navbar on small screens -->
  <div id="navDemo" class="w3-bar-block w3-white w3-hide w3-hide-large w3-hide-medium w3-large">
    <a href="C:\Users\ora\Desktop\Vaccine distribution campaign\Vaccine distribution campaign\index.html" class="w3-bar-item w3-button w3-padding-large">Home</a>
    <a href="#" class="w3-bar-item w3-button w3-padding-large">Login</a>
    <a href="http://localhost:8080/index.jsp" class="w3-bar-item w3-button w3-padding-large">Paths</a>
    <a href="contactUs.html" class="w3-bar-item w3-button w3-padding-large">Contact us</a>
    <a href="aboutUs.html" class="w3-bar-item w3-button w3-padding-large">About us</a>
  </div>
</div>
<br>
<br>
<div style="height:200px; margin:10px; padding:10px; ">
<div>
<a href="/admin/login"><b>Admin</b></a>
</div>
<div>
<a href="/user/firstpage"><b>User</b></a>
</div>
<div>
<a href="/vaccine/login"><b>Vaccine Supplier</b></a>
</div>
</div>
<!-- Footer -->
<footer class="w3-container w3-padding-64 w3-center w3-opacity"id="footer">  
  <div class="w3-xlarge w3-padding-32">
    <i class="fa fa-facebook-official w3-hover-opacity"></i>
    <i class="fa fa-instagram w3-hover-opacity"></i>
    <i class="fa fa-snapchat w3-hover-opacity"></i>
    <i class="fa fa-pinterest-p w3-hover-opacity"></i>
    <i class="fa fa-twitter w3-hover-opacity"></i>
    <i class="fa fa-linkedin w3-hover-opacity"></i>
 </div>
 <p>Powered by <a href="#" target="">True_Indian</a></p>
</footer>

<script>
// Used to toggle the menu on small screens when clicking on the menu button
function myFunction() {
  var x = document.getElementById("navDemo");
  if (x.className.indexOf("w3-show") == -1) {
    x.className += " w3-show";
  } else { 
    x.className = x.className.replace(" w3-show", "");
  }
}
</script>

</body>
</html>
