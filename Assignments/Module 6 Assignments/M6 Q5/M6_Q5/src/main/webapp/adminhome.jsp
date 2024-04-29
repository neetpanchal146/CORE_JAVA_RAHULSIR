<%@page import="com.dao.AdminDao"%>
<%@page import="com.model.User"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.UserDao"%>
<%@page
	import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User List</title>
</head>
<body>
	<%
	ApplicationContext a = new ClassPathXmlApplicationContext("Beans.xml");
	UserDao userDao = (UserDao) a.getBean("userDao");
	AdminDao adminDao = (AdminDao) a.getBean("adminDao");
	List<User> list = userDao.getAllUser();
	%>
	<h1>User Profile</h1>
	<table border="1">
		<tr>
			<th>User id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Password</th>
			<th>Gender</th>
			<th>Actions</th>
		</tr>
		<%
		for (User user : list) {
		%>
		<tr>
			<td><%=user.getId()%></td>
			<td><%=user.getFirstname()%></td>
			<td><%=user.getLastname()%></td>
			<td><%=user.getEmail()%></td>
			<td><%=user.getMobile()%></td>
			<td><%=user.getPassword()%></td>
			<td><%=user.getGender()%></td>
			<td>
				<form name="delete" method="post" action="AdminController">
					<input type="hidden" name="sid" value="<%=user.getId()%>">
					<input type="submit" name="action" value="DELETE">
				</form>
			</td>
		</tr>
		<%
		}
		%>

	</table>
</body>
</html>