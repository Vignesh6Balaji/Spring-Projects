<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Alien Datas</title>
</head>
<body>
	<h1>Insert Alien</h1>
	<form action="addAlien" method="post">
		<label>Alien ID : </label> <br> <input type="number" name="aId">
		<br> <label>Alien Name : </label> <br> <input type="text"
			name="aName"> <br> <input type="submit">
	</form>
	<h1>Get Alien By ID</h1>
	<form action="getAlien">
		<label>Alien ID : </label> <br> <input type="number" name="aId">
		<br>
		<input type="submit">
	</form>
	<h1>Update Alien By ID</h1>
	<form action="updateAlien" method="post">
		<label>Alien ID : </label> <br> <input type="number" name="aId">
		<br> <label>Alien Name : </label> <br> <input type="text"
			name="aName"> <br> <input type="submit">
	</form>
	<h1>Delete Alien By ID</h1>
	<form action="deleteAlien" method="post">
		<label>Alien ID : </label> <br> <input type="number" name="aId">
		<br>
		<input type="submit">
	</form>
</body>
</html>