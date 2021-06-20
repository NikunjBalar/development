package com.nik.JDBC.1loadDriver.CreatingObjectOfDriverClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class FrindInformation {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			connection = DriverManager
					.getConnection("jdbc:mysql://localhost" + ":3306/jee?" + "user=root&password=kunj97");
			statement = connection.createStatement();
			statement.execute("insert into frinds_info " + "VALUES(4,'mohit',9925365110,'mohitdhola98@gmail.com'),"
					+ "(5,'priyen',4545679845,'pilosurani11@gmail.com'),"
					+ "(6,'nikunj',9737366556,'nikunjbalar15@gmail.com')");

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (connection != null || statement != null) {
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
