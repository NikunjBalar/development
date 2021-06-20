package com.nik.JDBCPracaticale.1loadDriver.ForNameMethod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FrindInformation {
public static void main(String[] args) {
	Connection connection=null;
	Statement statement=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost"
				+ ":3306/jee?"
				+ "user=root&password=kunj97");
		statement=connection.createStatement();
		statement.execute("insert into frinds_info "
				+ "VALUES(1,'mohit',9925365110,'mohitdhola98@gmail.com'),"
				+ "(2,'priyen',4545679845,'pilosurani11@gmail.com'),"
				+ "(3,'nikunj',9737366556,'nikunjbalar15@gmail.com')");
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	finally {
		if(connection!=null || statement != null) {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
}
