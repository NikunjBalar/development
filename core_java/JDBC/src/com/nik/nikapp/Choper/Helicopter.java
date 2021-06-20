package com.nik.nikapp.Choper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Statement;

public class Helicopter {
	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jee?user=root&password=kunj97");
			statement=connection.createStatement();
			statement.execute("insert into  Helicopter_info values (1,'indianarmy','5000km/h',1000000)");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if(statement != null && connection !=null) {
				try {
					connection.close();
					statement.close();
					System.out.println("Finally block execute successfully");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
