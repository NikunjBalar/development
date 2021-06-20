package org.jocker.jokerapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="login",urlPatterns="/login",
	initParams= {
			@WebInitParam(name="name",value="i am nikunj"),
			@WebInitParam(name="name",value="i am nikunj"),
			@WebInitParam(name="name",value="i am nikunj")

	}
		)
public class LoginServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		try {
			String name=req.getParameter("name");
			String password=req.getParameter("password");
			PrintWriter pw=res.getWriter();
			pw.print("welcome"+name);
			pw.close();
		}
		catch(Exception e) {
			System.err.println("exception in servelate server"+e.getMessage());
		}
	}

}
