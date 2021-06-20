package org.jocker.Shopping.cart;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/kart")
public class Product1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String productName= req.getParameter("pn");
		String productQuantity=req.getParameter("pq");
		
		req.setAttribute("prName", productName);
		req.setAttribute("prQuantity", productQuantity);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("kart2");
		dispatcher.forward(req, resp);
	}
}
