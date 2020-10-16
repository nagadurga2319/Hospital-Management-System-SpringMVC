<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Patient details</title>
<style type="text/css">
body {
	background-image:
		url('http://www.imperialcrs.com/blog/wp-content/uploads/2015/09/photodune-3418930-leader-s.jpg');
		background-size: cover;
}

center {
	margin: auto;
	width: 50%;
}
table{
background-color:#C0E8D5;
}
h3{
color:maroon;
	font-size: 50px;
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
				<th>ViewHistory</th>
			</tr>
			<c:forEach items="${patientList}" var="patient">
				<tr>
					<td>${patient.pid}</td>
					<td>${patient.firstName}</td>
					<td>${patient.lastName}</td>
					<td>${patient.password}</td>
					<td>${patient.dob}</td>
					<td>${patient.email}</td>
					<td>${patient.conNum}</td>
					<td>${patient.status}</td>
					<td>${patient.insPlan}</td>
					<td><a href="<c:url value="/view/${patient.pid}"/>">View History</a></td>
					
			</c:forEach>
		</table>

	</center>
</body>
</html>