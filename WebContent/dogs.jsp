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
		</select>
		<input type="submit" value="submit">
	</form>
	
	<form action="filterDogsByBreed.do">
		Filter By Size <select name="breed">
			<option value="select">Select...</option>
			<option value="chihuahua">Chihuahua</option>
			<option value="germanShepard">German Shepard"</option>
			<option value="havanese">Havanese</option>
			<option value="labrador">Labrador</option>
			<option value="other">Other</option>
		</select>
		<input type="submit" value="submit">
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
			<input type="text" name="note" value="${a.note}" /> <input
				type="hidden" name="name" value="${a.name}" />
			<button class="button" name="update" value="update">Update
				Dog Notes</button>
		</form>
		<br />

	</c:forEach>
</body>
</html>