<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Matrimony-Registration</title>
<h1 align="center" style="font-style: italic;">Welcome to Matrimony</h1>
</head>
<body>
<div class="container">
	<form action="matrimony.om" method="post">
		
		<div class="form-group ">
		<div class="row">
			<label for="name">Name</label> <input class="form-control" type="text" name="name"
				placeholder="enter the your name" required>
		</div>
		</div>
		<div class="form-group">
		<div class="row">
			<label for="">DOB</label> <input class="form-control" type="date" name="DOB"
				placeholder="enter the your date" required>
		</div>
		</div>
		<div class="form-group">
		<div class="row">
			<label for="gender">Gender</label> <input type="radio" name="gender"
				value="male" > Male <input type="radio" name="gender"
				value="female"> Female <input type="radio" name="gender"
				value="other"> Other
		</div>
		</div>
		<div class="form-group">
		<div class="row">
			<label for="status">Status</label> <select  class="form-control" name="status">
				<option>----Select------</option>
				<option>Married</option>
				<option>UN-Married</option>
				<option>Divorced</option>
				<option>Widow</option>
			</select>
		</div>
		</div>
	<div class="form-group">
		<div class="row">
		<label for="occupation">Occupation</label> 
		<select class="form-control" name="occupation" >
				<option>----Select------</option>
				<option>govt</option>
				<option>private</option>
				<option>public</option>
				<option>Self-Employed</option>
				<option>Student</option>
			</select>
		</div>
		</div>
	<div class="form-group">
		<div class="row">
			<label for="lookingFor">Looking For</label> 
			<select class="form-control" name="lookingFor">
			<option>----Select------</option>
			<option>Married</option>
				<option>UN-Married</option>
				<option>Divorced</option>
				<option>Widow</option>
			</select>
		</div>
		</div>
		<button type="submit" class="btn-success">Register</button>
		<button type="reset" class="btn-dark">Clear</button>
	</form>
	</div>
</body>
</html>