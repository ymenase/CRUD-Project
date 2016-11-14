<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<!-- Latest compiled and minified CSS -->
<html lang="en">
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="styles.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="https://fonts.googleapis.com/css?family=Oxygen"
	rel="stylesheet">

<meta charset="UTF-8">

<title>Dogs List</title>
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
					<li><a href="about.html">About</a></li>
				</ul>
			</div>
		</nav>
		<h1>Search Filters</h1>
		<form action="filterDogsByGender.do">
			Filter By Gender <select name="gender">
				<option value="select">Select...</option>
				<option value="Female">Female</option>
				<option value="Male">Male</option>
			</select> <input type="submit" value="submit">
		</form>

		<form action="filteredDogsByBreed.do">
			Filter By Breed <select name="breed">
				<option value="select">Select...</option>
				<option value="Chihuahua">Chihuahua</option>
				<option value="German Shepard">German Shepard</option>
				<option value="Havanese">Havanese</option>
				<option value="Labrador">Labrador</option>
				<option value="Other">Other</option>
			</select> <input type="submit" value="submit">
		</form>

		<h1>Add New Arrivals</h1>
		<form method="link" action="addDog.jsp">
			<input type="submit" value="Add Dog">
		</form>
		<h1>Current Dog Information and Notes</h1>
					<c:forEach var="a" items="${dogs}">
		<div class="container-fluid2">
			<div class=row>
				<div class="col-sm-6">
					<p class="name">${a.name}</p>
					<br />
					${a.age}<br />
					${a.breed}<br />
					${a.gender}<br />

						<form action="removeDogFromShelter.do">
							<button class="button" name="remove" value="${a.name}">Remove
								Dog</button>
						</form>
						<form action="updateDogNotes.do">
							Current Note: ${a.note} <br /> <input type="text" name="note"
								value="" /> <input type="hidden" name="name" value="${a.name}" />
							<button class="button" name="update" value="update">Update
								Dog Notes</button>
							<br />
						</form>
						<form action="clearDogNotes.do">
							<button class="button" name="clear" value="${a.name}">Clear
								Dog Notes</button>
						</form>
						<br />
						<br />

				</div>
				<div class="col-sm-6">
						<img src="${a.image}" />
						<br />
				</div>
			</div>
		</div>
					</c:forEach>
	</div>
	<footer class="container-fluid text-center" id="footer">
		<p>Yvette Menase | Skill Distillery SD7 | Week 7 Project</p>
	</footer>
</body>
</html>