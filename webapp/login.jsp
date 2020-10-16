<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
<style type="text/css">
body {
	background-image:
		url('https://www.webinventiv.com/images/services/hospital-management-system.png');
}

p {
	color: blue;
	text-align: justify;
	font-family: Comic sans MS;
}

center {
	margin: auto;
	width: 50%;
	border: 3px solid green;
	padding: 10px;
	background-color: lightblue;
}

h1 {
	color: Black;
	font-family: sans-serif;
}
</style>
</head>
<body>
	<br>
	<br>
	<br>
	<br>
	<br>

	<center>

		<h1>Welcome to Hospital Management System</h1>
		<p>Our hospital is a health care institution providing patient
			treatment with specialized medical and nursing staff and medical
			equipment. The best-known type of hospital is the general hospital,
			which typically has an emergency department to treat urgent health
			problems ranging from fire and accident victims to a sudden illness</p>

		<table>
			<tr>
				<td>Admin Name:</td>
				<td><input type="text" name="name" /></td>
			</tr>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td><a href="home.jsp"><input type="submit" value="submit" /></a></td>
		</table>
	</center>


</body>
</html>