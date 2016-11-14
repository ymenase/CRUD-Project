<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="styles.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://fonts.googleapis.com/css?family=Oxygen"
	rel="stylesheet">
<title>Add a Dog</title>
</head>
<body>
	<div class="container1">
		<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand">Adoptable Dogs from the Denver Animal
					Shelter</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="index.html">Home</a></li>
				<li><a href="catsIndex.do">All Cats</a></li>
				<li><a href="dogsIndex.do">All Dogs</a></li>
				<li><a href="about.html">About</a></li>
			</ul>
		</div>
		</nav>
		<form action="addDogToShelter.do">
			Name <input type="text" name="name" value=""> Age<input
				type="text" name="age" value=""> Breed <select name="breed">
				<option value="select">Select...</option>
				<option value="Chihuahua">Chihuahua</option>
				<option value="German Shepard">German Shepard</option>
				<option value="Havanese">Havanese</option>
				<option value="Labrador">Labrador</option>
				<option value="Other">Other</option>
			</select> Gender <select name="gender">
				<option value="select">Select...</option>
				<option value="Female">Female</option>
				<option value="Male">Male</option>
			</select> Image <input type="text" name="image" value="" />
			<button class="button" name="add" value="add">Submit Dog</button>
		</form>
	</div>
	<footer class="container-fluid text-center" id="footer">
	<p>Yvette Menase | Skill Distillery SD7 | Week 7 Project</p>
	</footer>
</body>
</html>