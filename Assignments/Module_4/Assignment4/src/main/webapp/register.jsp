<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>
</head>
<body>
    <h2>Student Registration Form</h2>
    <form action="StudentController" method="post">
        <label for="fname">First Name:</label><br>
        <input type="text" id="fname" name="firstname" required><br>
        
        <label for="lname">Last Name:</label><br>
        <input type="text" id="lname" name="lastname" required><br>
        
        <label for="email">Email:</label><br>
        <input type="email" id="email" name="email" required><br>
        
        <label for="mobile">Mobile:</label><br>
        <input type="text" id="mobile" name="mobile" required><br>
        
        <label for="gender">Gender:</label><br>
        <select id="gender" name="gender" required>
            <option value="male">Male</option>
            <option value="female">Female</option>
            <option value="other">Other</option>
        </select><br>
        
        <label for="password">Password:</label><br>
        <input type="password" id="password" name="password" required><br>
        
        <input type="submit" value="Register" name="action">
    </form>
</body>
</html>