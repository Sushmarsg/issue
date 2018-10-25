<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>project details</h1><br>
<table border="2">
<tr>
<th>SlNo.</th>
<th>ProjectName</th>
<th>ProjectDomain</th>
<th>ProjectCode</th>
<th>ProjectStartDate</th>
<th>ProjectETADate</th>
<th>Status</th>
<th>Action</th>
</tr>
<c:forEach var="pdto" items="${pDTOList}">
<tr>
<td>${pdto.pId}</td>
<td>${pdto.projectName}</td>
<td>${pdto.projectDomain}</td>
<td>${pdto.projectCode}</td>
<td>${pdto.projectStartDate}</td>
<td>${pdto.projectEndDate}</td>
<td>${pdto.projectStatus}</td>
<td><a href="updateProjectStatus.do?id=${pdto.pId}&st=${pdto.projectStatus}">Edit</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>