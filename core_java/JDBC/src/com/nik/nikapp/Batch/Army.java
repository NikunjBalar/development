package com.nik.nikapp.Batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Army {
	public static void main(String[] args) {
		String sq1 = "insert into army_table values(5,'india',10)";
		String sq2 = "insert into army_table values(6,'india',20)";
		String sq3 = "insert into army_table values(7,'india',30)";
		String sq4 = "update army_table set no_of_army=50 where idarmy";

		Connection con = null;
		java.sql.Statement st = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jee?" + "user=root&password=kunj97");
			st = con.createStatement();
			st.addBatch(sq1);
			st.addBatch(sq2);
			st.addBatch(sq3);
			st.addBatch(sq4);
			int[] a = st.executeBatch();
			System.out.println(a.length);

			con.close();
			st.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
