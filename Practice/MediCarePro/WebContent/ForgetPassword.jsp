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

	<h1>Employee Forget Password...............</h1>
	<form action="forgetPassword.mdc" method="post">
		
		<div class="form-group">
			<div class="row">
				<div class="col-sm-4">
					<label for="dob">Email:</label> <input type="email"
						class="form-control" name="email" id="email"
						placeholder="Enter email">
				</div>
			</div>
		</div>
		
		<button type="submit" class="btn btn-primary">ResetPassword</button>
		<button type="button" class="btn btn-primary">Cancle</button>
	</form>

</body>
</html>