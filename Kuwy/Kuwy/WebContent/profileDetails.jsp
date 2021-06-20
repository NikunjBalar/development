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

<title>Profile Details</title>
</head>
<body>
	<div class="container">
		<h1>Loan Eligibility Forecast</h1>
	</div>
	<form action="profile.ku" method="post">
		<div class="container">
			<div class="form-group">

				<select class="form-control" required="required" name="selectYourAge">
					<option>Select Your Age</option>
					<option>21</option>
					<option>22</option>
					<option>23</option>
					<option>24</option>
				</select>
			</div>

			<div class="form-group">

				<select class="form-control" required="required" name="selectCustomerProfile">
					<option>Select Customer Profile</option>
					<option>Agriculture</option>
					<option>Salaried</option>
				</select>
			</div>
			<div class="form-group">

				<select class="form-control" required="required" name="SelectMonthlyIncome">
					<option>Select Monthly Income</option>
					<option>20000-50000</option>
					<option>50000+</option>
				</select>
			</div>
			<div class="form-group">

				<select class="form-control" required="required" name="selectLoanAmount">
					<option>Select Loan Amount</option>
					<option>300000-350000</option>
					<option>360000-410000</option>
					<option>410000-460000</option>
					<option>470000-520000</option>
				</select>
			</div>
			<div class="form-group">

				<select class="form-control" required="required" name="SelectExistingEMI">
					<option>Select Existing EMI</option>
					<option>0-5000</option>
					<option>5001-10000</option>
					<option>10001-15000</option>
					<option>15001-20000</option>
				</select>
			</div>
			<div class="form-group">

				<select class="form-control" required="required" name="selectEMIAffordability">
					<option>Select EMI Affordability</option>
					<option>0-5000</option>
					<option>5001-10000</option>
					<option>10001-15000</option>
					<option>15001-20000</option>
				</select>
			</div>
			<div class="form-group">

				<select class="form-control" required="required" name="selectGuarantor">
					<option>Select Guarantor</option>
					<option>No Guarantor</option>
					<option>Family</option>
					<option>Blood Relative</option>
					<option>Friends</option>
				</select>
			</div>
			<div class="form-group">

				<select class="form-control" required="required" name="selectPlaceOfStay">
					<option>Select Place Of Stay</option>
					<option>Bengaluru</option>
					<option>Bidar</option>
				</select>
			</div>
			<button type="submit" class="btn btn-outline-primary btn-block">
				Check Loan</button>
		</div>
	</form>
</body>
</html>