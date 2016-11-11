<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>View</title>
</head>
<body>
	<!-- <button class="button" name="param" value="all">Get All Cats</button> -->
	<!-- <button class="button" name="param" value="add">Add Cat</button> -->
	<!-- 	<button class="button" name="param" value="remove">Remove Cat</button>
	<button class="button" name="param" value="update">Update Cat Notes</button> -->
	<h1>Search Filters:</h1>

	<form action="filterCatsByGender.do">
		Filter By Gender <select name="gender">
			<option value="select">Select...</option>
			<option value="Female">Female</option>
			<option value="Male">Male</option>
		</select>
		<input type="submit" value="submit">
	</form>
	
	
	<button class="button" name="param" value="getBySize">Get Cat
		by Size</button>

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
<br />



		<form action="removeCatFromShelter.do">
			<button class="button" name="remove" value="${a.name}">Remove
				Cat</button>
		</form>

		<form action="updateCatNotes.do">
			<input type="text" name="note" value="${a.note}" /> <input
				type="hidden" name="name" value="${a.name}" />
			<button class="button" name="update" value="update">Update
				Cat Notes</button>
		</form>
		<br />


	</c:forEach>
</body>
</html>