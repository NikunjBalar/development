<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
a {
	text-decoration: none;
	display: inline-block;
	padding: 8px 16px;
}

a:hover {
	background-color: #ddd;
	color: black;
}

.previous {
	background-color: #f1f1f1;
	color: black;
}

.next {
	background-color: #4CAF50;
	color: white;
}

.round {
	border-radius: 50%;
}
</style>
</head>
<body>
<form action="home.hasi" method="post">

	<!-- <a href="#" class="previous">&laquo; Previous</a>
	<a href="#" class="next">Next &raquo;</a> -->

	<a href="signUp.jsp" class="next round"> Sign Up </a>
	<a href="signIn.jsp" class="next round"> Sign In </a> 
<br>
	<!-- <a href="signUp.jsp" class="next"> Sign Up</a>
	<a href="signIn.jsp" class="next"> Sign In</a> -->
</form>
</body>
</html>