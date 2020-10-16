<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>View Patient History</title>
<style type="text/css">
body {
	background-image:
		url('https://th.bing.com/th/id/OIP.Mp2hYW3hQKPLcuNXVMNs2gHaHa?w=178&h=180&c=7&o=5&dpr=1.5&pid=1.7');
	background-size: cover;
}

center {
	margin: auto;
	width: 50%;
}

tr {
	background-color: green;
	color: white;
}

th {
	background-color: yellow;
	color: black;
}

h3 {
	color: maroon;
	font-size: 60px;
}
</style>
</head>
<body>
	<center>
		<h3>Patient details</h3>
		<table border="1">
			<tr>
				<th>Patient Id</th>
				<th>First name</th>
				<th>Last name</th>
				<th>password</th>
				<th>Date of Birth</th>
				<th>Email</th>
				<th>Contact Number</th>
				<th>Status</th>
				<th>Insurance Plan</th>

			</tr>

			<tr>
				<td>${viewForm.pid}</td>
				<td>${viewForm.firstName}</td>
				<td>${viewForm.lastName}</td>
				<td>${viewForm.password}</td>
				<td>${viewForm.dob}</td>
				<td>${viewForm.email}</td>
				<td>${viewForm.conNum}</td>
				<td>${viewForm.status}</td>
				<td>${viewForm.insPlan}</td>
		</table>
</body>
</html>