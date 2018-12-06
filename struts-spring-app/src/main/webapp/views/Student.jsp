<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
</head>
<body>
	<div>
		<a href="Add">Add</a>
	</div><br>

	Students Count :
	<s:property value="count" /><br><br>

	List Of Students:
	<table>
		<tr>
			<td>Roll No</td>
			<td>Name</td>
			<td>Score</td>
		</tr>
		<s:iterator value="students">
			<tr>
				<td><s:property value="rollNo" /></td>
				<td><s:property value="name" /></td>
				<td><s:property value="score" /></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>