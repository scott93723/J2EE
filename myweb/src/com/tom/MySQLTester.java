package com.tom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLTester {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://j.snpy.org/a105?user=a105&password=a105.33");

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select*from users");

				while(rs.next()){
					
					int id=rs.getInt("id");
					String userid=rs.getString("userid");
					String passwd=rs.getString("passwd");
					String email=rs.getString("email");
					
					System.out.println(id);
					System.out.println(userid);
					System.out.println(passwd);
					System.out.println(email);
			
					
					
				}
									
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}