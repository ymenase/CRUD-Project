<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- Latest compiled and minified CSS -->
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="styles.css">
<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="https://fonts.googleapis.com/css?family=Oxygen"
	rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cats by Selected Gender</title>
</head>
<body>
	<div class="container1">
		<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand">Adoptable Cats from Angels With Paws</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="index.html">Home</a></li>
				<li><a href="catsIndex.do">All Cats</a></li>
				<li><a href="dogsIndex.do">All Dogs</a></li>
				<li><a href="about.html">About</a></li>
			</ul>
		</div>
		</nav>
		<h1>Cats by Gender</h1>
		<br />
		<div class="container-fluid2">
			<div class=row>
				<div class="col-sm-6">
					<p>
						<c:forEach var="cat" items="${catsByGender}">
			<p class="name">${cat.name}</p><br />
${cat.age}</br>
${cat.color}</br>
${cat.size} </br>
${cat.gender}</br>
							<img src="${cat.image}" />
							<br />
						</c:forEach>
				</div>
			</div>
		</div>
	</div>
	<footer class="container-fluid text-center" id="footer">
			<p>Yvette Menase | Skill Distillery SD7 | Week 7 Project</p>
	</footer>
</body>