<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Add Physician Details</title>
<style type="text/css">
body {
	background-image:
		url('https://image.freepik.com/free-vector/medical-team-cartoon_18591-2283.jpg');
	background-size: cover;
}

center {
	margin: auto;
	width: 50%;
}

td {
	background-color: pink;
	color: black;
}

h3 {
	color: #DA1884;
	font-size: 50px;
}
</style>
</head>
<body>
	<center>


		<h3>Add Physician Details</h3>
		<c:url var="action" value="/add"></c:url>
		<form:form action="${action}" method="post"
			commandName="physicianForm" novalidate="novalidate">
			<table>

				<tr>
					<td>Physician First Name:</td>
					<td><form:input path="firstName" /><font color="red"><form:errors
								path="firstName" /></font></td>
				</tr>
				<tr>
					<td>Physician Last Name:</td>
					<td><form:input path="lastName" /><font color="red"><form:errors
								path="lastName" /></font></td>
				</tr>

				<tr>
					<td>Department:</td>
					<td><form:input path="department" /><font color="red"><form:errors
								path="department" /></font></td>
				</tr>
				<tr>
					<td>Educational qualification :</td>
					<td><form:input path="qualification" /><font color="red"><form:errors
								path="qualification" /></font></td>
				</tr>

				<tr>
					<td>Years of Experience:</td>
					<td><form:input path="experience" /><font color="red"><form:errors
								path="experience" /></font></td>
				</tr>

				<tr>
					<td>State:</td>
					<td><form:input type="text" path="state" /><font color="red"><form:errors
								path="state" /></font></td>
				</tr>

				<tr>
					<td>Insurance Plan :</td>
					<td><form:input type="text" path="insPlan" /><font
						color="red"><form:errors path="insPlan" /></font></td>
				</tr>

				<tr>
					<td><input type="submit" value="Register" /></td>
					<td><input type="reset" value="Reset" /></td>
				</tr>

			</table>
		</form:form>
		</div>
		</div>
	</center>
</body>
</html>