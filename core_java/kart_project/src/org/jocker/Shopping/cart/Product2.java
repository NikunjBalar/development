package org.jocker.Shopping.cart;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/product2")
public class Product2 extends HttpServlet{

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String productName= req.getParameter("pn2");
		String productQuantity=req.getParameter("pq2");
		
		req.setAttribute("prName2", productName);
		req.setAttribute("prQuantity2", productQuantity);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("kart2");
		dispatcher.forward(req, resp);
	}
}
