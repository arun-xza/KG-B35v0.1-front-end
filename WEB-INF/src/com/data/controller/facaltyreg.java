package com.data.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.data.model.data;
@WebServlet("/facaltyreg")
public class facaltyreg extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String sem=req.getParameter("sem");
		String add=req.getParameter("address");
		String branch=req.getParameter("branch");
		String sslc=req.getParameter("sslc");
		String puc=req.getParameter("puc");
		String ug=req.getParameter("ug");
		String pg=req.getParameter("pg");
		new data().facalty(name,email,add,branch,sslc,puc,ug,pg,sem);
		resp.sendRedirect("home.jsp");
		
	}

}
