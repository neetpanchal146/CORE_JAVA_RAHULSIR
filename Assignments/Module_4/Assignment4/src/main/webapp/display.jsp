<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Submitted Student Information</title>
</head>
<body>
    <h2>Submitted Student Information</h2>
    <%
        // Retrieve student information from request parameters
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String gender = request.getParameter("gender");
        String password = request.getParameter("password");
    %>
    <p>First Name: <%= fname %></p>
    <p>Last Name: <%= lname %></p>
    <p>Email: <%= email %></p>
    <p>Mobile: <%= mobile %></p>
    <p>Gender: <%= gender %></p>
    <p>Password: <%= password %></p>
</body>
</html>