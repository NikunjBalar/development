package org.nik.nikapp.register;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet{
	public RegisterServlet() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("initialisatoin done");
		super.init();
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		
		super.service(arg0, arg1);
	}
}
