<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<style>
body {
	background-image:
		url('https://th.bing.com/th/id/OIP.Eq1Sb2ikebVC5Sy5MQQ8tAHaFj?pid=Api&rs=1');
	background-size: cover;
}

center {
	margin: auto;
	width: 50%;
	padding: 10px;
}
</style>
</head>
<body>
	<center>
		<h3>HOSPITAL MANAGEMENT SYSTEM</h3>
		<table>

			<tr>
				<td>
				<img src="https://th.bing.com/th/id/OIP.8kLjJs6WahG0M3hrYliGdQAAAA?pid=Api&rs=1"
					alt="enroll" width="100" height="100"></td>
				<td><h3>
						<a href="<c:url value="/patient"/>">Enroll Patient</a>
					</h3></td>
			</tr>

			<tr>
				<td>
				<img src="https://image.flaticon.com/icons/png/512/206/206875.png"
					alt="physician" width="100" height="100"></td>
				<td>
					<h3>
						<a href="<c:url value="/physician"/>">Add Physician</a>
					</h3>
				</td>
			</tr>

			<tr>
				<td>
				<img src="https://cdn1.iconfinder.com/data/icons/medical-services-4/64/x-18-512.png"
					alt="search" width="100" height="100"></td>
				<td><h3>
						<a href="<c:url value="/search"/>">Physician Search</a>
					</h3></td>
			</tr>

			<tr>
				<td>
				<img src="https://cdn4.iconfinder.com/data/icons/medical-checkup/275/patient-treatment-01-004-512.png"
					alt="diagnosis" width="100" height="100"></td>
				<td><h3>
						<a href="<c:url value="/diagnosis"/>">Patient Diagnosis
							Details</a>
					</h3></td>
			</tr>
		</table>
	</center>
</body>
</html>