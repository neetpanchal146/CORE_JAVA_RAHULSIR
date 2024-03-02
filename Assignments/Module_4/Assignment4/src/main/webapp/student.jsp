<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Information Form</title>
</head>
<body>
    <h2>Student Information Form</h2>
    <form action="display.jsp" method="post">
        <label for="fname">First Name:</label><br>
        <input type="text" id="fname" name="fname"><br>
        
        <label for="lname">Last Name:</label><br>
        <input type="text" id="lname" name="lname"><br>
        
        <label for="email">Email:</label><br>
        <input type="email" id="email" name="email"><br>
        
        <label for="mobile">Mobile:</label><br>
        <input type="text" id="mobile" name="mobile"><br>
        
        <label for="gender">Gender:</label><br>
        <select id="gender" name="gender">
            <option value="male">Male</option>
            <option value="female">Female</option>
            <option value="other">Other</option>
        </select><br>
        
        <label for="password">Password:</label><br>
        <input type="password" id="password" name="password"><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>