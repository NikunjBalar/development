package com.nik.nikapp.ChandaCollection;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ChandaCollection {
	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jee?"
					+ "user=root&password=kunj97");
			statement = connection.createStatement();
			statement.execute("insert into Chanda_Collectio_Table "
					+ "values(102,'nik',500.00,9737366556)");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(connection != null && statement!=null) {
				try {
					connection.close();
					statement.close();
					System.out.println("finally block execute successfully");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
