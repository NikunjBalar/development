<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="member.joc" method="post">
		<pre>

Family Name <input type="text" name="familyName" />
Member Name <input type="text" name="memberName" />
Occupation  <input type="text" name="occupation" />
Place 		<input type="text" name="place">
Gender  	<select name="gender"> 
	<option value="N">No Specified</option>
	<option value="F">Female</option>
	<option value="M">Male</option>
	<option value="O">Other</option>
			</select>

			<input type="submit" value="Add">

</pre>

	</form>
</body>
</html>