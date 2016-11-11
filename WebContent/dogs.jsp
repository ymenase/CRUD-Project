<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Dogs List</title>
</head>
<body>
	<h1>Search Filters:</h1>
	<button class="button" name="param" value="getByGender">Get
		Dog by Gender</button>
	<button class="button" name="param" value="getBySize">Get Dog
		by Size</button>

	<h1>New Arrivals</h1>
	<form method="link" action="addDog.jsp">
		<input type="submit" value="Add Dog">
	</form>
	
	<h1>Actions to Take on Current Dogs</h1>
	<c:forEach var="a" items="${dogs}">
${a.name}
${a.age}
${a.breed}
${a.gender} <br />

	<c:forEach var="note" items="${a.notes}">
	${note}<br>
	</c:forEach>


		<form action="removeDogFromShelter.do">
			<button class="button" name="remove" value="${a.name}">Remove
				Dog</button>
		</form>

		<form action="addDogNotes.do">
			<input type="hidden" name="dogName" value="${a.name}" />
			<input type="text" name="notes" value="" />
			
			<button class="button" name="param" value="addCN">Add Dog 
				Notes</button>
		</form>
		
		<form action="updateDogNotes.do">
			<input type="hidden" name="name" value="${a.name}" />
			<button class="button" name="param" value="update">Update
				Dog Notes</button>
		</form>
		<br />


	</c:forEach>
</body>
</html>