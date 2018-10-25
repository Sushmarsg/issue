<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	${msg}
	<form action="createResource.do" method="post">

		Name:<input type="text" name="resrcName"> <br /> 
		Designation :
		<select name="resrcDesignation">
			<option>----------</option>
			<option>Developer</option>
			<option>Tester</option>
			<option>Team Lead</option>
			<option>Project Manager</option>
		</select> <br /> 
		Employee Number:<input type="text" name="resrcEmpNo"><br /> 
		Project:<select name="resrcProjName">
			<c:forEach var="project" items="${projects}">
				<option >${project}</option>
			</c:forEach>
		</select> <br /> 
		Email:<input type="text" name="resrcEmail"> <br />
		Manager Email:<input type="text" name="resrcMgrEmail"> <br />
		<input type="reset" name="Reset" value="Reset"> <input
			type="submit" name="create" value="Create">

	</form>
	
<br/> <a href="adminHome.jsp">Home</a>
</body>
</html>