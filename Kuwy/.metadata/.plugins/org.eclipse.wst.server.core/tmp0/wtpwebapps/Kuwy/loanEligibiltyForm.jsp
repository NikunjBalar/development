<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Loan Eligibility</title>
</head>
<body>
	<div class="container">
		<h1>Loan Eligibility Forecast</h1>
	</div>
	<form action="loan.ku" method="post">
		<div class="container">
			<div class="form-group">
				<span>VEHICLE</span><br>
				<button type="button" class="btn btn-primary btn-block" disabled>Used</button>

			</div>
			<!-- 	<div class="form-group">
				<span>VEHICLE TYPE</span><br>
				<div class="btn-group">
					<button type="button" class="btn btn-primary">Private</button>
				</div>
				<div class="btn-group">
					<button type="button" class="btn btn-primary">Taxi</button>
				</div>
			</div> -->
			<div class="form-group">
				<span>LOAN TYPE</span>
				<button type="button" class="btn btn-primary btn-block" disabled>Purchase</button>
			</div>

			<div class="form-group">

				<select class="form-control" required="required" name="mfgYear">
					<option>mfg year</option>
					<option>2020</option>
					<option>2019</option>
					<option>2018</option>
					<option>2017</option>
				</select>
			</div>

			<div class="form-group">

				<select class="form-control" required="required" name="selectBrand">
					<option>Select Brand</option>
					<option>Suzuki</option>
					<option>Honda</option>
				</select>
			</div>
			<div class="form-group">

				<select class="form-control" required="required"
					name="selectLocation">
					<option>Select Location</option>
					<option>Bengaluru</option>
					<option>Bidar</option>
				</select>
			</div>
			<div class="form-group">
				OWNERSHIP<input name="ownerShip" type="hidden"><br>
				<button type="button" class="btn btn-outline-primary">1st</button>
				<button type="button" class="btn btn-outline-primary">2nd</button>
				<button type="button" class="btn btn-outline-primary">3rd</button>
				<button type="button" class="btn btn-outline-primary">3+</button>
			</div>
			<div class="form-group">
				CONDITION<input name="condition" type="hidden"><br>
				<button type="button" class="btn btn-outline-primary">Excellent</button>
				<button type="button" class="btn btn-outline-primary">Good</button>
				<button type="button" class="btn btn-outline-primary">Average</button>
				<button type="button" class="btn btn-outline-primary">Bad</button>
			</div>
			<div class="form-group">
				VEHICLE PRICE<input name="vehiclePrice" type="hidden"><br>
				<input type="text" placeholder="Enter Vehicle Price"
					required="required">
			</div>
			<button type="submit" class="btn btn-outline-primary btn-block">Check
				Vehicle</button>
		</div>
	</form>
</body>
</html>