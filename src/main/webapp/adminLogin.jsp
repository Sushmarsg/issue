<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login</title>
</head>
<body>
<h3>${msg}</h3>
<form action="adminLogin.do" method="post">
userId:<input type="text" name="userId"/><br/>
password:<input type="password" name="password"/><br/>
<input type="reset" value="Reset"/>
<input type="submit" value="submit"/>
</form>

</body>
</html>