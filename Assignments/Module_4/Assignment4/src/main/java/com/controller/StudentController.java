package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.dao.StudentDao;
import com.model.StudentModel;

public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("register"))
		{
			StudentModel rmodel=new StudentModel();
			rmodel.setFirstname(request.getParameter("firstname"));
			rmodel.setLastname(request.getParameter("lastname"));
			rmodel.setEmail(request.getParameter("email"));
			rmodel.setMobile(request.getParameter("mobile"));
			rmodel.setGender(request.getParameter("gender"));
			rmodel.setPassword(request.getParameter("password"));
			
			int x= new StudentDao().registerStudent(rmodel);
			if(x>0)
			{
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			else
			{
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}
		}
		
		else if(action.equalsIgnoreCase("login"))
		{
			StudentModel lmodel=new StudentModel();
			lmodel.setEmail(request.getParameter("email"));
			lmodel.setPassword(request.getParameter("password"));
			
			StudentModel model=new StudentDao().studentLogin(lmodel);
			if(model!=null)
			{
				HttpSession session=request.getSession(true);
				session.setAttribute("model", model);
				response.sendRedirect("HomeController?action=showuser&userid="+model.getStudentid());
			}
			else
			{
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}
	}

}
