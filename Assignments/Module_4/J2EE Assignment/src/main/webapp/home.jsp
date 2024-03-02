<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
	<th>Student ID</th>
	<th>Firstname</th>
	<th>Lastname</th>
	<th>Email</th>
	<th>Mobile</th>
	<th>Gender</th>
	<th>Password</th>
</tr>

<tr>
	<td>${model.studentid}</td>
	<td>${model.firstname}</td>
	<td>${model.lastname}</td>
	<td>${model.email}</td>
	<td>${model.mobile}</td>
	<td>${model.gender}</td>
	<td>${model.password}</td>
		
</tr>

<tr>
	<td colspan="2"><a href="HomeController?action=edituser&userid=${model.studentid}">Edit User</a></td>
	<td colspan="3"><a href="HomeController?action=deleteuser&userid=${model.studentid}">Delete User</a></td>	
</tr>

</table>
<br><br>

<form method="post" action="HomeController">
	<table>
		<tr>
			<td>First Name</td>
			<td><input type="text" name="firstname" value="${hmodel.firstname }"> </td>
		</tr>
		
		<tr>
			<td>Last Name</td>
			<td><input type="text" name="lastname" value="${hmodel.lastname }"> </td>
		</tr>
		
		<tr>
			<td>Email</td>
			<td><input type="text" name="email" value="${hmodel.email }"> </td>
		</tr>
		
		<tr>
			<td>Mobile</td>
			<td><input type="text" name="mobile" value="${hmodel.mobile }"> </td>
		</tr>
		
		<tr>
			<td>Gender</td>
			<td><input type="text" name="gender" value="${hmodel.gender }"> </td>
		</tr>
		
		<tr>
			<td>Password</td>
			<td><input type="password" name="password" value="${hmodel.password }"><input type="hidden" name="studentid" value="${hmodel.studentid }"> </td>
		</tr>
		
		<tr>
			<td><input type="submit" value="Update" ></td>
		</tr>
	</table>
</form>

</body>
</html>