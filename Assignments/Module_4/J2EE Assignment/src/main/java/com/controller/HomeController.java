package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.dao.HomeDao;
import com.model.StudentModel;

public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("showuser"))
		{
			int userid=Integer.parseInt(request.getParameter("userid"));
			StudentModel model=new HomeDao().verifyLogin(userid);
			request.setAttribute("model", model);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}
		
		else if(action.equalsIgnoreCase("edituser"))
		{
			int userid=Integer.parseInt(request.getParameter("studentid"));
			StudentModel hmodel=new HomeDao().verifyLogin(userid);
			request.setAttribute("hmodel", hmodel);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}
		
		else if(action.equalsIgnoreCase("deleteuser"))
		{
			int userid=Integer.parseInt(request.getParameter("userid"));
			int x=new HomeDao().deleteUser(userid);
			
			request.setAttribute("msg", "Record Deleted...");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
