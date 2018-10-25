<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resource login</title>
</head>
<body>
${msg}
<form action="resourceLogin.do" method="post">
Email id:<input type="text" name="email"/><br/>
Password:<input type="password" name="pwd"/><br/>
<input type="reset"> <input type="submit">
</form>

</body>
</html>