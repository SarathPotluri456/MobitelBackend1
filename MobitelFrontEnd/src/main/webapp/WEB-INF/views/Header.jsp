<%@ page language="java" contentType="text/html"%>
<html>
<head>
<title> Navbar Example </title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" 
href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<!-- Starting the Navbar Code -->

<nav class="navbar navbar-inverse">
	<div class="container-fluid">
	
	<div class="navbar-header">
      	<a class="navbar-brand" href="index.jsp">Mobitel</a>
    	</div>
	
	 <ul class="nav navbar-nav">
      		<li class="active"><a href="index.jsp"><span class="glyphicon glyphicon-home"></span>Home</a></li>
      		<li><a href="Login.jsp"><span class="glyphicon glyphicon-search"></span>Login</a></li>
      		<li><a href="Register.jsp"><span class="glyphicon glyphicon-search"></span>Register</a></li>
      		<li><a href="AboutUs">AboutUs</a></li>
      		<li><a href="ContactUs">ContactUs</a></li>
    	</ul>

	  <div class="nav navbar-nav navbar-right">
		<a href="#">Sign In</a>
	  </div>

	</div>
</nav>