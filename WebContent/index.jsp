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
	<button class="button" name="param" value="getbyAge">Get Cat
		by Age</button>
	<button class="button" name="param" value="getByGender">Get
		Cat by Gender</button>
	<button class="button" name="param" value="getBySize">Get Cat
		by Size</button>

	<h1>New Arrivals</h1>
	<form method="link" action="addCat.jsp">
		<input type="submit" value="Add Cat">
	</form>
	
	<h1>Actions to Take on Current Cats</h1>
	<c:forEach var="a" items="${cats}">
${a.name}
${a.age}
${a.color}
${a.size} 
${a.gender} <br />

		<form action="removeCatFromShelter.do">
			<input type="hidden" name="name" value="${a.name}" />
			<button class="button" name="param" value="remove">Remove
				Cat</button>
		</form>

		<form action="addCatNotes.do">
			<input type="hidden" name="name" value="${a.name}" />
			<input type="text" name="text" value="" />
			
			<button class="button" name="param" value="addCN">Add Cat 
				Notes</button>
		</form>

		<form action="updateCatNotes.do">
			<input type="hidden" name="name" value="${a.name}" />
			<button class="button" name="param" value="update">Update
				Cat Notes</button>
		</form>


		<%-- ${a.notes} --%>

	</c:forEach>
</body>
</html>