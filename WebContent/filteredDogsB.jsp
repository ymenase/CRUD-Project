<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dogs by Selected Breed</title>
</head>
<body>
Here are your dogs<br/>
	<c:forEach var="dogB" items="${dogsByBreed}">
			<strong>${dogB.name}</strong>
${dogB.age}</br>
${dogB.breed}</br>
${dogB.gender} </br>
${dogB.note} </br>
<img src="${dogB.image}" /> <br />
	</c:forEach>
</body>
