package org.jocker.Shopping.cart;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/kart2")
public class Cart extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String proName=(String) req.getAttribute("prName");
		String proQuantity=(String) req.getAttribute("prQuantity");
		
		String proName2=(String)req.getAttribute("prName2");
		String proQuantity2=(String) req.getAttribute("prQuantity");

		int pq2=Integer.parseInt(proQuantity2);
		int pq=Integer.parseInt(proQuantity);
		double price=1000.00;
		double total=pq*price;
		total+=(pq2*price);
		
		ServletOutputStream out=resp.getOutputStream();
		out.println("Thank you for pressing the submit button \t"+total);

	}
}
