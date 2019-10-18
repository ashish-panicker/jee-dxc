<%@page import="com.jsp.web.Person"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Page</title>
</head>
<body>

	<div>
	<a href="index.jsp">Home</a>
	<a href="list.jsp">List</a>
	</div>


	<table>
		<tr>
			<td>Name</td><td>Email</td>
		</tr>
		<%
			List<Person> people = (List<Person>)  session.getAttribute("data");
			if(people != null){
				for(Person p : people){
					out.println("<tr><td>" + p.getName() + "<td><td>" + p.getEmail()+"</td></td>");
				}
			}
			else{
				out.println("<tr><td>No data</td></tr>");
			}
		%>
	</table>
</body>
</html>