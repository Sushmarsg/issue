<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Project</title>
</head>
<body>
	<h3>${msg}</h3><br/>
	<h1>Create Project</h1>
	<form action="createProject.do" method="post">

		project Name:<input type="text" name="projectName" /> <br /> 
		Domain:<select name="projectDomain">
			<option>--------</option>
			<option>IT</option>
			<option>Banking</option>
			<option>Education</option>
			<option>Logistics</option>
		</select> <br /> 
		Project Code:<input type="text" name="projectCode" /> <br />
		Start Date:<input type="date" name="projectStartDate" /> <br />
		Estimated Date:<input type="date" name="projectEndDate" /> <br />
		Project Description:
		<textarea rows="5" cols="30" name="projectDescription"></textarea>
		<br /> Status:<input type="radio" name="projectStatus" value="active" />
		Active <input type="radio" name="projectStatus" value="inActive"
			checked="checked" /> Inactive <br /> <input type="reset"
			value="Reset"> <input type="submit" value="Create">
	</form>
	<a href="adminHome.jsp">Admin Home</a><br/>
</body>
</html>