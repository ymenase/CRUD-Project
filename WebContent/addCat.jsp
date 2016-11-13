<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add a Cat</title>
</head>
<body>
<form action="addCatToShelter.do">
Name <input type="text" name ="name" value=""/>
Age<input type="text" name ="age" value=""/>
Color <select name ="color">
  <option value="select">Select...</option>
  <option value="Brown">Brown</option>
  <option value="Black">Black</option>
  <option value="Calico">Calico</option>
  <option value="Orange">Orange</option>
  <option value="Striped">Striped</option>
  <option value="Tortoiseshell">Tortoiseshell</option>
  <option value="Tuxedo">Tuxedo</option>
	</select>
Size <select name="size">
  <option value="select">Select...</option>
  <option value="Small">Small</option>
  <option value="Medium">Medium</option>
  <option value="Large">Large</option>
	</select>

Gender <select name="gender">
  <option value="select">Select...</option>
  <option value="Female">Female</option>
  <option value="Male">Male</option>
  
Image <input type="text" name ="image" value=""/>

</select>
	<button class="button" name="add" value="add">Submit Cat</button>
	</form>
</body>
</html>