<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <title>View</title>
  </head>
  <body>
<form action="process.pattern" method="GET">
	<button class="button" name="param" value="all">Get All Cats</button>
	<button class="button" name="param" value="add">Add Cat</button>
	<button class="button" name="param" value="remove">Remove Cat</button>
	<button class="button" name="param" value="update">Update Cat Notes</button>
	<button class="button" name="param" value="getbyAge">Get Cat by Age</button>
	<button class="button" name="param" value="getByGender">Get Cat by Gender</button>
	<button class="button" name="param" value="getBySize">Get Cat by Size</button>
	<input type="submit" name="submit" value="submit"/>
</form>

<c:forEach var="a" items="${cats}">
${a.name}
${a.age}
${a.color}
${a.size} 
${a.gender} <br />
<%-- ${a.notes} --%>

</c:forEach>
  </body>
</html>