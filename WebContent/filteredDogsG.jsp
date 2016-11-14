<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="styles.css">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://fonts.googleapis.com/css?family=Oxygen" rel="stylesheet">
<title>Dogs by Selected Gender</title>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand">Adoptable Dogs from the Denver Animal Shelter</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="index.html">Home</a></li>
      <li><a href="index.jsp">All Cats</a></li>
      <li><a href="dogs.jsp">All Dogs</a></li>
      <li><a href="about.html">About</a></li>
    </ul>
  </div>
</nav>
Here are your dogs<br/>
	<c:forEach var="dog" items="${dogsByGender}">
			<strong>${dog.name}</strong>
${dog.age}
${dog.breed}
${dog.gender} 
${dog.note} 
<img src="${dog.image}" /> <br />
	</c:forEach>
	<footer class="container-fluid bg-4 text-center" id="footer">
	  		<p>Yvette Menase | Skill Distillery SD7 | Week 7 Project</p>
		</footer>
</body>
