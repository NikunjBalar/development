package com.nik.nikapp.Gadgets;

import java.sql.*;

public class Gadgets {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jee";
		String user="root";
		String password="kunj97";
		Connection con=null;
		Statement st=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,user,password);
			con.setAutoCommit(false);
			st=con.createStatement();
			int i1=st.executeUpdate("insert into gadget_table value(3,'Dlaptop','electronic','P25F',48000.00)");
			int i2=st.executeUpdate("delete from gadget_table where brand='laptop'");
			int i3=st.executeUpdate("update gadget_table set price=30000 where model_num = 'P25F'");

			System.out.println(i1);
			System.out.println(i2);
			System.out.println(i3);

			con.commit();
		} catch (ClassNotFoundException | SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		finally {
			if(con!= null || st!=null) {
				try {
					con.close();
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
