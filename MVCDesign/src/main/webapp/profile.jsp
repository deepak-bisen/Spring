<%@page import="user.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	User user = (User) session.getAttribute("user_session");
	%>
	<h2 style="color: blue">WELCOME	</h2>
	<h3 style="color: green"><%=user.getName()%></h3>
</body>
</html>