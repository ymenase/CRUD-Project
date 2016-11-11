<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Dogs List</title>
</head>
<body>
	<h1>Search Filters:</h1>
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
			<option value="Ghihuahua">Chihuahua</option>
			<option value="German Shepard">German Shepard</option>
			<option value="Havanese">Havanese</option>
			<option value="Labrador">Labrador</option>
			<option value="Other">Other</option>
		</select> <input type="submit" value="submit">
	</form>

	<h1>New Arrivals</h1>
	<form method="link" action="addDog.jsp">
		<input type="submit" value="Add Dog">
	</form>

	<h1>Actions to Take on Current Dogs</h1>
	<c:forEach var="a" items="${dogs}">
		<strong>${a.name}</strong>
${a.age}
${a.breed}
${a.gender} <br />

		<form action="removeDogFromShelter.do">
			<button class="button" name="remove" value="${a.name}">Remove
				Dog</button>
		</form>
		<form action="updateDogNotes.do">
			Current Note: ${a.note} <br /> <input type="text" name="note"
				value="" /> <input type="hidden" name="name" value="${a.name}" />
			<button class="button" name="update" value="update">Update
				Dog Notes</button>
		</form>
		<form action="clearDogNotes.do">
			<button class="button" name="clear" value="${a.name}">Clear
				Dog Notes</button>
		</form>
		<br />

	</c:forEach>
</body>
</html>