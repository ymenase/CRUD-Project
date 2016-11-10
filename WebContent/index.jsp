<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <title>View</title>
  </head>
  <body>
<form action="process.pattern" method="GET">
	Get All Cats<input type="text" name="param" value="all"><br>
	Add Cat<input type="text" name="param" value="add"><br>
	Remove Cat<input type="text" name="param" value="remove"><br>
	Update Cat Notes<input type="text" name="param" value="update"><br>
	Get Cat by Age<input type="text" name="param" value="getbyAge"><br>
	Get Cat by Gender<input type="text" name="param" value="getByGender"><br>
	Get Cat by Size<input type="text" name="param" value="getBySize"><br>
	Get Cat by Location<input type="text" name="param" value="getByType"><br>
	<input type="submit" name="submit" value="submit"/>
</form>
  </body>
</html>