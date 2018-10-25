<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Issue</title>
</head>
<body>

	<h1>Create Issue page</h1>
	<h3>${msg}</h3>
	<form action="createIssue.do" method="post">
		Issue Number:<input type="text" name="issueNum"><br />
		Project	Name:<select name="projName">
			<option>----projectName----</option>
			<c:forEach var="pn" items="${plist}">
				<option >${pn.projectName}</option>
			</c:forEach>
		</select><br />
		type:<select name="issueType">
			<option>----select---</option>
			<option>Task</option>
			<option>Bug</option>
		</select><br /> 
		Priority:<select name="issuePriority">
			<option>---select---</option>
			<option value="1">High</option>
			<option value="2">Low</option>
		</select><br /> 
		Description:<textarea rows="5" cols="30" name="issueDesc"></textarea><br/>
		Assign To:<select name="resourceEmail">
			<option>----select----</option>
			<c:forEach var="rdto" items="${rlist}">
				<option value="${rdto.resrcEmail}">${rdto.resrcName}/${rdto.resrcEmpNo}</option>
			</c:forEach>
		</select><br /> 
		Status:<select name="status">
			<option>---select---</option>
			<option>Pending</option>
			<option>Reject</option>
			<option>Completed</option>
		</select><br /> 
		<input	type="reset" value="Reset"> <input type="submit" value="create"> 
	</form>
</body>
</html>