<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="styles.css">
<html lang="en">
<head>
<link href="https://fonts.googleapis.com/css?family=Oxygen"
	rel="stylesheet">
<meta charset="UTF-8">
<title>Cat List</title>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand">Adoptable Cats from Angels With Paws</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="index.html">Home</a></li>
				<li><a href="about.html">About</a></li>
				<li><a href="dogs.jsp">All Dogs</a></li>
			</ul>
		</div>
	</nav>
	<h1>Search Filters</h1>

	<form action="filterCatsByGender.do">
		Filter By Gender <select name="gender">
			<option value="select">Select...</option>
			<option value="Female">Female</option>
			<option value="Male">Male</option>
		</select> <input type="submit" value="submit">
	</form>

	<form action="filterCatsBySize.do">
		Filter By Size <select name="size">
			<option value="select">Select...</option>
			<option value="Small">Small</option>
			<option value="Medium">Medium</option>
			<option value="Large">Large</option>
		</select> <input type="submit" value="submit">
	</form>

	<h1>Add New Arrivals</h1>
	<form method="link" action="addCat.jsp">
		<input type="submit" value="Add Cat">
	</form>
	<h1>Current Cat Information and Notes</h1>
	<div class="container-fluid2">
		<div class=row>
			<div class="col-sm-6">
				<c:forEach var="a" items="${cats}">
					<strong>${a.name}</strong>
					<br />
${a.age}<br />
${a.color}<br />
${a.size} <br />
${a.gender}<br />

					<form action="removeCatFromShelter.do">
						<button class="button" name="remove" value="${a.name}">Remove
							Cat</button>
					</form>
					<form action="updateCatNotes.do">
						Current Note: ${a.note} <br /> <input type="text" name="note"
							value="" /> <input type="hidden" name="name" value="${a.name}" />
						<button class="button" name="update" value="update">Update
							Cat Notes</button>
					</form>

					<form action="clearCatNotes.do">
						<button class="button" name="clear" value="${a.name}">Clear
							Cat Notes</button>
					</form>

					<br />
				</c:forEach>
			</div>
			<div class="col-sm-6">
				<c:forEach var="a" items="${cats}">
					<img src="${a.image}" />
					<br />
				</c:forEach>
			</div>
		</div>
		<div>
</body>
</html>