<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add</title>
<style type="text/css">
.errorMessage {
	color: red;
}
</style>

</head>
<body >
	<s:form action="Add" method="post">
		<s:hidden name="post" value="true" />
		<s:textfield name="addName" key="Name"/>
		<s:label for="addName" name="labelName"/>
		<s:textfield name="addNumber" key="Number"/>
		<s:label for="addNumber" name="labelNumber"/>
		<s:textfield name="addAddress" key="Address"/>
		<s:label for="addAddress" name="labelAddress"/>
		<s:submit value="Add"/>
	</s:form>
</body>
</html>