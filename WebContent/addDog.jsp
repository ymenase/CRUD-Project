<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="styles.css">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://fonts.googleapis.com/css?family=Oxygen" rel="stylesheet">
<title>Add a Dog</title>
</head>
<body>
<form action="addDogToShelter.do">
Name <input type="text" name ="name" value=""/>
Age<input type="text" name ="age" value=""/>
Breed <input type="text" name ="breed" value=""/>
Gender <input type="text" name ="gender" value=""/>
	<button class="button" name="add" value="add">Submit Dog</button>
	</form>
</body>
</html>