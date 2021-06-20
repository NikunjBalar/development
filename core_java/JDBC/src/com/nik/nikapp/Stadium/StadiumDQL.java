package com.nik.nikapp.Stadium;

import java.sql.*;
public class StadiumDQL {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet r=null;
		String sql="select * from Stadium";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jee?"
					+ "user=root&password=kunj97");
			ps=con.prepareStatement(sql);
			//ps.setInt(1, 2);
			r=ps.executeQuery();
			while(r.next()) {
				// String name =r.getString(1);
				System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString("Stadium_capacity"));
			}
		//	System.out.println(r);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		finally {
			if(con !=null || ps != null || r!=null) {
				try {
					con.close();
					ps.close();
					r.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

	
