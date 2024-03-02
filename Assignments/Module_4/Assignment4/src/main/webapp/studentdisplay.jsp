<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Data</title>
</head>
<body>
    <h2>Student Information</h2>
    <table border="1">
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Mobile</th>
            <th>Gender</th>
        </tr>
        <%
            ResultSet rs = (ResultSet) request.getAttribute("resultSet");
            while (rs.next()) {
                out.println("<tr>");
                out.println("<td>" + rs.getString("firstname") + "</td>");
                out.println("<td>" + rs.getString("lastname") + "</td>");
                out.println("<td>" + rs.getString("email") + "</td>");
                out.println("<td>" + rs.getString("mobile") + "</td>");
                out.println("<td>" + rs.getString("gender") + "</td>");
                out.println("</tr>");
            }
            rs.close();
        %>
    </table>
</body>
</html>