<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit resource</title>
</head>
<body>
<h1>Edit resource</h1>
<form action="updateResource.do" method="post">
Name:<input type="text" value="${rdto.resrcName}">
Designation:<input type="text" value="${rdto.resrcDesignation}">
EmpNo:<input type="text" value="${rdto.resrcEmpNo}">
Email Id:<input type="text" value="${rdto.resrcEmail}">
Manager Email Id:<input type="text" value="${rdto.resrcMgrEmail}">
Project Name:<input type="text" value="${rdto.resrcName}">
</form>
</body>
</html>