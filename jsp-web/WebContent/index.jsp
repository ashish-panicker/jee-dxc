
<%@page import="com.jsp.web.Person"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index Page</title>
</head>
<body>

<div>
	<a href="index.jsp">Home</a>
	<a href="list.jsp">List</a>
	</div>

	<form method="post" action="process.do">
		Name: <input type="text" name="username" /> <br> Email: <input
			type="text" name="email" /> <br> <input type="submit"
			value="Add" />
	</form>

</body>
</html>