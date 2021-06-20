<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- Scriplet -->
<%
String name= request.getParameter("name");
String place= request.getParameter("place");
%>

<!-- Expression -->
<%= name +" "+place %>

<!-- Declarative -->
<%!
int i=10;
public void jspInit(){
	System.out.println(i);
	System.out.println("Initializing the resources of jsp");
}

public void jspDestroy(){
	System.out.println("cosed all costly resources  ");}
%>

</body>
</html>