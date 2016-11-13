<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Cat List</title>
</head>
<body>
	<h1>Search Filters:</h1>

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

	<h1>New Arrivals</h1>
	<form method="link" action="addCat.jsp">
		<input type="submit" value="Add Cat">
	</form>

	<h1>Actions to Take on Current Cats</h1>
	<c:forEach var="a" items="${cats}">
		<strong>${a.name}</strong>
${a.age}
${a.color}
${a.size} 
${a.gender}
<img src="${a.image}">
<br />

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
</body>
</html>