<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- Latest compiled and minified CSS -->
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="styles.css">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="https://fonts.googleapis.com/css?family=Oxygen"
	rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add a Cat</title>
</head>
<body>
<div class="container1">
	<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand">Adoptable Cats from Angels With Paws</a>
		</div>
		<ul class="nav navbar-nav">
			<li><a href="index.html">Home</a></li>
			<li><a href="catsIndex.do">All Cats</a></li>
			<li><a href="dogsIndex.do">All Dogs</a></li>
			<li><a href="about.html">About</a></li>
		</ul>
	</div>
	</nav>
	<form action="addCatToShelter.do">
		Name <input type="text" name="name" value="" /> Age<input type="text"
			name="age" value="" /> Color <select name="color">
			<option value="select">Select...</option>
			<option value="Brown">Brown</option>
			<option value="Black">Black</option>
			<option value="Calico">Calico</option>
			<option value="Orange">Orange</option>
			<option value="Striped">Striped</option>
			<option value="Tortoiseshell">Tortoiseshell</option>
			<option value="Tuxedo">Tuxedo</option>
		</select> Size <select name="size">
			<option value="select">Select...</option>
			<option value="Small">Small</option>
			<option value="Medium">Medium</option>
			<option value="Large">Large</option>
		</select> Gender <select name="gender">
			<option value="select">Select...</option>
			<option value="Female">Female</option>
			<option value="Male">Male</option></select> 
			<br/>
			Image
			<input type="text" name="image" value="" />

		</select> 
		<button class="button" name="add" value="add">Submit Cat</button>
	</form>
	</div>
	<footer class="container-fluid text-center" id="footer">
	  		<div id="footer">Yvette Menase | Skill Distillery SD7 | Week 7 Project</div>
		</footer>
</body>
</html>