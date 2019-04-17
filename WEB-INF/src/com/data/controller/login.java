package com.data.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class login extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	String name=req.getParameter("name");
	String pass=req.getParameter("pass");
	if(name.equals("admin")&& pass.equals("admin")){
		resp.sendRedirect("home.jsp");
	}
	else{
		req.setAttribute("errorMessage", "Invalid username or password"); 
	    RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
	    dispatcher.forward( req, resp);
		
	}
}
}
