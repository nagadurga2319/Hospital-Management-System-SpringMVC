<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Enroll Patient Details</title>
<style>
body {
	background-image:
		url('https://th.bing.com/th/id/OIP.T03zf7SK1WU1lZfcM5WRKQHaE8?pid=Api&rs=1');
	background-size: cover;
}

center {
	margin: auto;
	width: 50%;
}

td {
	background-color: #B0BF1A;
	color: black;
}

h3 {
	color: maroon;
	font-size: 50px;
}
</style>
</head>
<body>
	<center>
		<h3>Enroll Patient Details</h3>
		<c:url var="action" value="/enroll"></c:url>
		<form:form action="${action}" method="post" commandName="enrollForm"
			novalidate="novalidate">
			<table>

				<tr>
					<h3>
					<td>First Name:</td>
					</h3>
					<td><form:input path="firstName" /><font color="red"><form:errors
								path="firstName" /></font></td>
				</tr>
				<tr>
					<h3>
					<td>Last Name:</td>
					</h3>
					<td><form:input path="lastName" /><font color="red"><form:errors
								path="lastName" /></font></td>
				</tr>
				<tr>
					<h3>
					<td>Password:</td>
					</h3>
					<td><form:input type="password" path="password" /><font
						color="red"><form:errors path="password" /></font></td>
				</tr>

				<tr>
					<h3>
					<td>Date of Birth:</td>
					</h3>
					<td><form:input type="date" path="dob" /><font color="red"><form:errors
								path="dob" /></font></td>
				</tr>
				<tr>
					<h3>
					<td>Email Address:</td>
					</h3>
					<td><form:input type="email" path="email" /><font color="red"><form:errors
								path="email" /></font></td>
				</tr>
				<tr>
					<h3>
					<td>Contact Number:</td>
					</h3>
					<td><form:input path="conNum" /><font color="red"><form:errors
								path="conNum" /></font></td>
				</tr>
				<tr>
					<h3>
					<td>Status:</td>
					</h3>
					<td><form:input path="status" /><font color="red"><form:errors
								path="status" /></font></td>
				</tr>

				<tr>
					<h3>
					<td>Insurance Plan :</td>
					</h3>
					<td><form:input type="text" path="insPlan" /><font
						color="red"><form:errors path="insPlan" /></font></td>
				</tr>

				<tr>
					<td><input type="submit" value="Enroll Patient" /></td>
				</tr>
			</table>
		</form:form>
		<center>
</body>
</html>