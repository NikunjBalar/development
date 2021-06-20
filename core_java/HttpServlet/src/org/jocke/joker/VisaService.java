package org.jocke.joker;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "visa", urlPatterns = "/visa", loadOnStartup = 2)
public class VisaService extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {

			String name = req.getParameter("name");
			String dob = req.getParameter("dob");
			String fathername = req.getParameter("fathername");
			String ptv = req.getParameter("ptv");
			String duration = req.getParameter("duration");

			String action = req.getParameter("action");
			SimpleDateFormat dateFormat = new SimpleDateFormat(dob);

			PrintWriter printWriter = resp.getWriter();
			resp.setContentType("text/html");
			printWriter.print(name + " " + fathername + " birth date " + dob + " and visite the " + ptv + " for "
					+ duration + " year");
		} catch (Exception e) {
			System.err.println("exception in http servlet" + e.getMessage());
		}

	}
}
