package com.practicals;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Practical_3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Practical_3() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String fname = request.getParameter("fname");
	        String lname = request.getParameter("lname");
	        String email = request.getParameter("email");
	        String mobile = request.getParameter("mobile");
	        String gender = request.getParameter("gender");
	        String password = request.getParameter("password");

	        // Print the student information to the console
	        System.out.println("First Name: " + fname);
	        System.out.println("Last Name: " + lname);
	        System.out.println("Email: " + email);
	        System.out.println("Mobile: " + mobile);
	        System.out.println("Gender: " + gender);
	        System.out.println("Password: " + password);

	        // Set response content type
	        response.setContentType("text/html");

	        // Write response content
	        PrintWriter out = response.getWriter();
	        out.println("<html><body>");
	        out.println("<h2>Student Information Received</h2>");
	        out.println("<p>First Name: " + fname + "</p>");
	        out.println("<p>Last Name: " + lname + "</p>");
	        out.println("<p>Email: " + email + "</p>");
	        out.println("<p>Mobile: " + mobile + "</p>");
	        out.println("<p>Gender: " + gender + "</p>");
	        out.println("<p>Password: " + password + "</p>");
	        out.println("</body></html>");
	}

}
