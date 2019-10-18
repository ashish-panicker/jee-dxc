<%@page import="java.util.Collection"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%! String text = "some value..."; %>
	<%  String text2 = "some value 2 ..."; %>
	
	<h1>Request Headers</h1>
	<%
		out.println("printing some content...");
	%>
	<br>
	<%= text2 %>
	<br>
	
	<table>
	<tr>
		<td>Request Header</td>
		<td>Value</td>
	</tr>
	<%
		Enumeration<String> headerNames =  request.getHeaderNames();
		while(headerNames.hasMoreElements()){
			String name = headerNames.nextElement();
			out.println("<tr>");
			out.println("<td>" + name + "</td><td>" + request.getHeader(name) + "</td>");
			out.println("</tr>");
		}
	%>
	</table>
	
</body>
</html>