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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://fonts.googleapis.com/css?family=Oxygen"
	rel="stylesheet">
<title>Cats by Selected Size</title>
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
		<h1>Cats By Size</h1>
		<br />
		<c:forEach var="catS" items="${catsBySize}">
			<strong>${catS.name}</strong>
			<br />
${catS.age}<br />
${catS.color}<br />
${catS.size} <br />
${catS.gender}<br />
			<img src="${catS.image}">
			<br />
		</c:forEach>
	</div>
	<footer class="container-fluid text-center" id="footer">
	<p>Yvette Menase | Skill Distillery SD7 | Week 7 Project</p>
	</footer>
</body>