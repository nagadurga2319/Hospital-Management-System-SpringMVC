<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Patient Diagnosis Details</title>
<style type="text/css">
body {
	background-image:
		url('https://th.bing.com/th/id/OIP.aYYlLF7LBJAAEdZLCiMflAHaFk?w=206&h=180&c=7&o=5&dpr=1.5&pid=1.7');
	background-size: cover;
}

center {
	margin: auto;
	width: 50%;
}

table {
	background-color: #96C8A2;
}

td {
	color: #014421;
}

h3 {
	color: #CC474B;
	font-size: 50px;
}
</style>
</head>
<body>

	<center>
		<h3>Patient Diagnosis Details</h3>
		<c:url var="action" value="/dia"></c:url>
		<form:form action="${action}" method="post"
			commandName="diagnosisForm" novalidate="novalidate">
			<table>
				<tr>
					<td>Patient Id:</td>
					<td><form:input path="pid" /><font color="red"><form:errors
								path="pid" /></font></td>
				</tr>

				<tr>
					<td>Symptoms:</td>
					<td><form:input path="symptom" /><font color="red"><form:errors
								path="symptom" /></font></td>
				</tr>
				<tr>
					<td>Diagnosis Provided :</td>
					<td><form:input path="diagnosis" /><font color="red"><form:errors
								path="diagnosis" /></font></td>
				</tr>

				<tr>
					<td>Administered by :</td>
					<td><form:input path="doctor" /><font color="red"><form:errors
								path="doctor" /></font></td>
				</tr>
				<tr>
					<td>Date of Diagnosis :</td>
					<td><form:input type="date" path="dod" /><font color="red"><form:errors
								path="dod" /></font></td>
				</tr>

				<tr>
					<td>Follow-up Required :</td>
					<td><form:radiobutton path="followup" value="YES" />YES <form:radiobutton
							path="followup" value="NO" />NO</td>
				</tr>

				<tr>
					<td>Date of Follow up :</td>
					<td><form:input type="date" path="dof" /></td>
				</tr>

				<tr>
					<td>Bill Amount:</td>
					<td><form:input type="text" path="bill" /><font color="red"><form:errors
								path="bill" /></font></td>
				</tr>
				<tr>
					<td>Card Number:</td>
					<td><form:input type="text" path="cardNum" /><font
						color="red"><form:errors path="cardNum" /></font></td>
				</tr>
				<tr>
					<td>Mode of payment :</td>
					<td><form:radiobutton path="pay" value="CASH" />CASH <form:radiobutton
							path="pay" value="CREDITCARD" />CREDITCARD <form:radiobutton
							path="pay" value="DEBITCARD" />DEBITCARD <form:radiobutton
							path="pay" value="CHECK" />CHECK</td>
				</tr>

				<tr>
					<td><input type="submit" value="Register" /></td>
					<td><input type="reset" value="Reset" /></td>
				</tr>

			</table>
		</form:form>
		<center>
</body>
</html>