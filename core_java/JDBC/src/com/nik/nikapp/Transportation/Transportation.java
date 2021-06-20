package com.nik.nikapp.Transportation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Transportation {
	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql:"
					+ "//localhost:3306/jee?"
					+ "user=root&password=kunj97");
			statement=connection.createStatement();
			statement.execute("insert into TRANSPORTATION_INFO "
					+ "VALUES(7,'Bus','1500'),(8,'Train','750'),(9,'Airplane','5000')");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(connection!=null && statement!=null) {
				try {
					connection.close();
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
