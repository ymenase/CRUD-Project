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
Color <input type="text" name ="color" value=""/>
Size <input type="text" name ="size" value=""/>
Gender <input type="text" name ="gender" value=""/>
	<button class="button" name="add" value="add">Submit Cat</button>
	</form>
</body>
</html>