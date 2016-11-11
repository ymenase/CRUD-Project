<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dogs by Selected Gender</title>
</head>
<body>
Here are your dogs<br/>
	<c:forEach var="dog" items="${dogsByGender}">
			<strong>${dog.name}</strong>
${dog.age}
${dog.breed}
${dog.gender} 
${dog.note} 
<img src="${dog.image}" /> <br />
	</c:forEach>
</body>
