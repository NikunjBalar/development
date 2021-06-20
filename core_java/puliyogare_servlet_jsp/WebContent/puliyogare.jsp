<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

 <%@ page errorPage="exception.jsp" %>
    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>${scope}</h1>
<body>
<%-- <%
String brand=(String)request.getAttribute("scope");

%>
<%= brand %> --%>

<!-- firs way to add page -->
<%@ include file="Header.jsp" %>
	<form action="puliyogare" method="post">
	
	brand<input  type="text" name="brand"><br>
	isShenga<input type="radio" name="shenga" value="yes"><br>
	<input type="submit" value="SUBMIT">
	
	</form>
	<%
	int i=9/0;
	%>
	<%@ include file="Footer.jsp" %>
	
<!-- second way to add page -->


</body>
</html>