<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Flipkart</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default rounded borders and increase the bottom margin */ 
    .navbar {
      margin-bottom: 10px;
      border-radius: 0;
    }
    
    /* Remove the jumbotron's default bottom margin */ 
     .jumbotron {
     background-image: url("https://sageerpinsights.com/wp-content/uploads/2014/09/freezing-inventory.jpg");
      margin-bottom: 0;
      
      height: 150px;
    }
   
    /* Add a gray background color and some padding to the footer */
    footer {
      background-image: url("https://sageerpinsights.com/wp-content/uploads/2014/09/freezing-inventory.jpg");
     /* background-color: #f2f2f2;*/
     /* padding: 15px;*/
     
    }
    
  
    
  </style>
</head>
<body background="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQNB5arPstK8hSWGwTsz-iFkhsZI2wJ0wZxaxrbocUNg93YswLfUg">

  <div class="jumbotron"> 
  <div class="container text-center">
    <h2><b></b><i>FLIPKART</i></b></h2>      
    <p><i>One Shop For Everyone</i></p>
  </div>
</div>

 <nav class="navbar navbar-inverse"> 
  <!--<div class="container-fluid">
      <div class="navbar-header"> -->
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
         <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                       
      </button>
      </div> 
   
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Products</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
         <% if(session.getAttribute("username")==null){ %>
         <li><a href="login">Login</a></li>
        <li><a href="register">Register</a></li>
        <% } else { %>
        	<li><a href="LogoutServletPath">Logout</a></li>
        <% } %>
        <li><a href="cart">Cart</a></li>
      </ul>
    </div>
  </div>
</nav>


<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">DIGITAL WRIST WATCH</div>
       <a href="watch"><div class="panel-body"><img src="https://cdn.shopify.com/s/files/1/0072/9677/8306/products/SMAEL-Luxury-Men-s-Wristwatch-Dual-Display-Digital-Watches-Mens-LED-50M-Waterproof-Sport-Watch-2018_c3ef4d21-3290-4dec-b7bc-7d9e2cacba4b_300x300.jpg?v=1536296016" style="width:60%" alt="Image"></div></a>
        <% if(session.getAttribute("username")==null) { %>
        <a href="register"><div class="panel-footer"><input type="button" value="Add to cart" /></div></a>
        <% } else { %>
        <a href="cart"><div class="panel-footer"><input type="button" value="Add to cart" /></div></a>
        <% } %>      
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger">
        <div class="panel-heading">BOAT HEADPHONE</div>
         <a href="headphone"><div class="panel-body"><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTgOoK-TwS6m3zoFxCwHvWq7HmFmoYYl6Hr0iRlhHoqbuJ4QPd2" style="width:60%" alt="Image"></div></a>
          <% if(session.getAttribute("username")==null) { %>
         <a href="register"><div class="panel-footer"><input type="button" value="Add to cart" /></div></a>
           <% } else { %>
        <a href="cart"><div class="panel-footer"><input type="button" value="Add to cart" /></div></a>
        <% } %> 
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">OPPO SMARTPHONE</div>
        <a href="phone"><div class="panel-body"><img src="https://telefonika.com/wp-content/uploads/2018/12/Oppo-A3s.png" class="img-responsive" style="width:60%" alt="Image"></div></a>
         <% if(session.getAttribute("username")==null) { %>
         <a href="register"><div class="panel-footer"><input type="button" value="Add to cart" /></div></a>
           <% } else { %>
        <a href="cart"><div class="panel-footer"><input type="button" value="Add to cart" /></div></a>
        <% } %> 
      </div>
    </div>
  </div>
</div><br>

<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">DELL CONVERTIBLE LAPTOP</div>
         <a href="laptop"><div class="panel-body"><img src="https://reliancedigital.in/medias/Dell-New-Inspiron-13-7373-Convertible-Laptop-33.78-cm-13.3-491351101-i-1-1200Wx1200H-300Wx300H?context=bWFzdGVyfGltYWdlc3wxOTMxMXxpbWFnZS9qcGVnfGltYWdlcy9oZTMvaGU2Lzg4OTE5MjU0NjMwNzAuanBnfDViYzc1ZTE4NzJjNTQzNzc5MDEyMDJiNGY2MTYzOGI1NTFhZTkzNjg3NGYzYTJmNjQ3ZGZmZmEyZGI2NjA1N2I" class="img-responsive" style="width:60%" alt="Image"></div></a>
         <% if(session.getAttribute("username")==null) { %>
         <a href="register"><div class="panel-footer"><input type="button" value="Add to cart" /></div></a>
           <% } else { %>
        <a href="cart"><div class="panel-footer"><input type="button" value="Add to cart" /></div></a>
        <% } %> 
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        <div class="panel-heading">PHILIPS TRIMMER</div>
         <a href="trimmer"><div class="panel-body"><img src="https://m.media-amazon.com/images/S/aplus-media/sota/4021251c-0453-444f-b788-754762a49e3f._CR0,0,1000,1000_PT0_SX300__.jpg" class="img-responsive" style="width:60%" alt="Image"></div></a>
        <% if(session.getAttribute("username")==null) { %>
         <a href="register"><div class="panel-footer"><input type="button" value="Add to cart" /></div></a>
           <% } else { %>
        <a href="cart"><div class="panel-footer"><input type="button" value="Add to cart" /></div></a>
        <% } %> 
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        <div class="panel-heading">JBL BLUETOOTH SPEAKERS</div>
         <a href="speaker"><div class="panel-body"><img src="https://powercity.ie/product/image?pcode=JBLGOBK" class="img-responsive" style="width:60%" alt="Image"></div></a>
          <% if(session.getAttribute("username")==null) { %>
         <a href="register"><div class="panel-footer"><input type="button" value="Add to cart" /></div></a>
           <% } else { %>
        <a href="cart"><div class="panel-footer"><input type="button" value="Add to cart" /></div></a>
        <% } %> 
      </div>
    </div>
  </div>
</div><br><br>

<footer class="container-fluid text-center">
  <p>Online Store Copyright</p>  
 <li><a href="about">ABOUT US</a></li>

</footer>

</body>
</html>
    