package com.nik.nikapp.Stadium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StadiumDMLDemo {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pr=null;
		String sql="drop table ayusg";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jee?"
					+ "user=root&password=kunj97");
			pr=con.prepareStatement(sql);
			int i =pr.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(con!=null || pr!=null ) {
				try {
					con.close();
					pr.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
