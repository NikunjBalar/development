package com.nik.nikapp.Stadium;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Stadium {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "insert into stadium values(?,?,?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jee?" + "user=root&password=kunj97");
			ps = con.prepareStatement(sql);
			/*ps.setInt(1, 1);
			ps.setString(2, "Lalbhai Stadium");
			ps.setString(3, "surat");
			ps.setString(4, "50000");
			ps.setInt(5, 1000);
			int i = ps.executeUpdate();
			*/
			ps.setInt(1, 3);
			ps.setString(2, "LalbhaiStadium");
			ps.setString(3, "surat(guj)");
			ps.setString(4, "500000");
			ps.setInt(5, 100);
			int i1 = ps.executeUpdate();
			
			//System.out.println(i);
			System.out.println(i1);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (ps != null && con != null) {
				try {
					ps.close();
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	void ScannerpreStatement() {
		
	}
}
