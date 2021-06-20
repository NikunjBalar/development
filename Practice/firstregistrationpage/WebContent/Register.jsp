<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="registerPersonal.joc" method="post">
		<pre>
		<h1>Personal Details</h1>
		Name:<input type="text" name="name"> 
		Email:<input type="text" name="email"> 
		Phone:<input type="text" name="phoneNumber">
		Password:<input type="text" name="password"> 
		Confirm Password:<input type="text" name="cnfPassword"> 
		Add:<input type="text" name="add">

		<h1>Address Details</h1>
		Street:<input type="text" name="street"> 
		City:<input type="text" name="city"> 
		Pincode:<input type="text" name="pincod"> 
		<input type="submit" value="register"> 
		<input type="reset" value="clear">
	
	
	</pre>
	</form>

</body>
</html>