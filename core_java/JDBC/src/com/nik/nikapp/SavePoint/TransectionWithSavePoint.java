package com.nik.nikapp.SavePoint;

import java.sql.*;

public class TransectionWithSavePoint {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jee";
		String user = "root";
		String password = "kunj97";
		Connection con = null;
		Statement st = null;
		Savepoint sp=null;
		String delete="delete from gadget_table where brand=laptop'";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			con.setAutoCommit(false);
			st = con.createStatement();
			int i=st.executeUpdate("insert into gadget_table value(99,'Llaptop','electronic','P25c',18000.00)");
			//con.commit();
			//sp=con.setSavepoint();
			int i1 = st.executeUpdate(delete);
			//con.commit();
			sp=con.setSavepoint(delete);
			int i2=st.executeUpdate("update gadget_table set price=90000 where model_num = 'P25F'");
		//	sp=con.setSavepoint();
			//con.commit();
			System.out.println(i);
			System.out.println(i1);
			System.out.println(i2);

		//con.rollback(sp);
		//con.commit();
		} catch (ClassNotFoundException | SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (st != null || con != null) {
				try {
					st.close();
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
