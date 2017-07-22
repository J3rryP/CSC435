
<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Home  Page</title>
</head>
<body>
<h3>Hi <%=session.getAttribute("username") %></h3>
<strong>Your Email</strong>: <%=session.getAttribute("email") %><br>
<strong>Your Age</strong>: <%=session.getAttribute("age") %><br>
<strong>Your gender</strong>: <%=session.getAttribute("gender") %><br>
<strong>Your id</strong>: <%=session.getAttribute("id") %><br>
<br>
<form action="Logout" method="post">
<input type="submit" value="Logout" >
</form>
</body>
</html>
