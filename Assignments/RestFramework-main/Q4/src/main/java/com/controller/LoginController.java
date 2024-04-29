package com.controller;

import java.io.IOException;

import com.dao.RegisterDao;
import com.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		User user=new User();
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		
		User huser=new RegisterDao().getLogin(user);
		if(huser != null)
		{
			HttpSession session=request.getSession(true);
			session.setAttribute("huser", huser);
			session.setAttribute("id", huser.getId());
			response.sendRedirect("HomeController?action=showuser&id="+huser.getId());
		}
		else
		{
			response.sendRedirect("error.jsp");
		}
	}

}