<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Physician details</title>
<style type="text/css">
body {
	background-image:
		url('https://mdxvitals-res.cloudinary.com/image/upload/q_auto/f_auto/w_300,dpr_auto/v1539099898/homepage_vector_doctors-02.png');
	background-size: cover;
}

center {
	margin: auto;
	width: 50%;
}

h3 {
	color: #DA1884;
	font-size: 60px;
}

table {
	background-color: #7BB661;
}
</style>
</head>
<body>
	<center>
		<h3>Physician Details</h3>
		<table border="1">
			<tr>
				<th>Physician Id</th>
				<th>Physician First name</th>
				<th>Physician Last name</th>
				<th>Department</th>
				<th>Educational qualification</th>
				<th>Years of Experience</th>
				<th>State</th>
				<th>Insurance Plan</th>
			</tr>
			<c:forEach items="${physicianList}" var="physician">
				<tr>
					<td>${physician.physiacianid}</td>
					<td>${physician.firstName}</td>
					<td>${physician.lastName}</td>
					<td>${physician.department}</td>
					<td>${physician.qualification}</td>
					<td>${physician.experience}</td>
					<td>${physician.state}</td>
					<td>${physician.insPlan}</td>
			</c:forEach>
		</table>

	</center>
</body>
</html>