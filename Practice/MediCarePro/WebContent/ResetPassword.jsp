<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Employee ResetPassword...............</h1>
	<form action="resetpassword.mdc" method="post">
		<div class="form-group">
			<div class="row">
				<div class="col-sm-4">
					<label for="dob">Existing Password:</label> <input type="text"
						class="form-control" name="existingpassword" id="existingpassword"
						placeholder="Enter existing password">
				</div>
			</div>
		</div>
		<div class="form-group">
			<div class="row">
				<div class="col-sm-4">
					<label for="dob">New Password:</label> <input type="password"
						class="form-control" name="newpassword" id="newpassword"
						placeholder="Enter new password">
				</div>
			</div>
		</div>
		<div class="form-group">
			<div class="row">
				<div class="col-sm-4">
					<label for="dob">ConfirmPassword:</label> <input type="password"
						class="form-control" name="cpassword" id="cpassword"
						placeholder="Enter ConfirmPassword">
				</div>
			</div>
		</div>

		<button type="submit" class="btn btn-primary">change</button>



	</form>

</body>
</html>