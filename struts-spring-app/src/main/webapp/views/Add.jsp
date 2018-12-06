<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add</title>
</head>
<body>
	<s:form action="Add">
		<s:hidden name="post" value="true"/>
		<s:textfield name="rollNo" key="Roll No" />
		<s:textfield name="name" key="Name" />
		<s:textfield name="score" key="Score" />
		<s:submit value="Add" />
	</s:form>


</body>
</html>