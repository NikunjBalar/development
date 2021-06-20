package com.nik.nikapp.Batch;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BatchWithPreParedStatement {
	public static void main(String[] args) {
 
		String sql = "insert into army_table values(?,?,?)";
		String sql2 = "insert into army_table values(?,?,?)";
		String sql3 = "insert into army_table values(?,?,?)";
		// String sql4 = "update army_table set no_of_army=50 where idarmy";
		Connection con = null;
		PreparedStatement pst = null;
		PreparedStatement pst2 = null;
		PreparedStatement pst3 = null;
	//	PreparedStatement pst4= null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jee?" + "user=root&password=kunj97");
			pst = con.prepareStatement(sql);
			pst.setInt(1, 15);
			pst.setString(2, "INDIA");
			pst.setString(3, "140");
			pst.addBatch();
			
			pst2 = con.prepareStatement(sql2);
			pst2.setInt(1, 16);
			pst2.setString(2, "INDIA");
			pst2.setString(3, "140");
			pst2.addBatch();
			
			pst3 = con.prepareStatement(sql3);
			pst3.setInt(1, 17);
			pst3.setString(2, "INDIA");
			pst3.setString(3, "140");
			pst3.addBatch();
			
			/*pst4 = con.prepareStatement(sql4);
			pst4.setInt(1, 18);
			pst4.setString(2, "INDIA");
			pst4.setString(3, "140");
			pst4.addBatch();*/
			
			int[] a = pst.executeBatch();
			System.out.println(a.length);

			int[] a2 = pst2.executeBatch();
			System.out.println(a2.length);
			
			int[] a3 = pst3.executeBatch();
			System.out.println(a3.length);
			
			/*int[] a4 = pst4.executeBatch();
			System.out.println(a4.length);*/
			con.close();
			pst.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
