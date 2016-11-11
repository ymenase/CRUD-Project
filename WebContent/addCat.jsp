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
Color <select>
  <option value="select">Select...</option>
  <option value="brown">Brown</option>
  <option value="black">Black</option>
  <option value="calico">Calico</option>
  <option value="orange">Orange</option>
  <option value="striped">Striped</option>
  <option value="tortoiseshell">Tortoiseshell</option>
  <option value="tuxedo">Tuxedo</option>
	</select>
Size <select>
  <option value="select">Select...</option>
  <option value="small">Small</option>
  <option value="medium">Medium</option>
  <option value="large">Large</option>
	</select>

Gender <select>
  <option value="select">Select...</option>
  <option value="female">Female</option>
  <option value="male">Male</option>
</select>
	<button class="button" name="add" value="add">Submit Cat</button>
	</form>
</body>
</html>