package com.servlet.joker;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/puliyogare")
public class PuliyogareServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String brand=req.getParameter("brand");
		String shenga=req.getParameter("shenga");

		
		req.setAttribute("scope", brand);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("puliyogare.jsp");
		
		dispatcher.forward(req, resp);
	}
}
