<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

</head>
<body>
	<form action="trend.joc" method="post">
		<pre>
		<div class="jumbotron text-center">
			<h4>Shadi karoge kya.....?</h4>
			<h5>agar karni hai to niche ki details fill karo.</h5>
		</div>

		<div>
			Name	:<input type="text" name="name" />
			DOB		:<input type="text" name="dob" />
			Gender	:<input type="radio" name="gender" value="Male" />Male <input
					type="radio" name="gender" value="Female" />Female <input
					type="radio" name="gender" value="noSpecified" />notspecify
			Status	:<input type="text" name="status" />
			Occupation	:<input type="text" name="occupation" />
			Looking for	:<input type="text" name="lookingfor" />
		</div>
		<input type="submit" value="register">
		</pre>
	</form>
</body>
</html>