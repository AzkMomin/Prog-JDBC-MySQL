package com.student.manager;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	static Connection conn;
	
	public static Connection createC() {
		try {
			
			//Load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Creating the connection
			String user = "root";
			String password = "Arham@123";
			String url = "jdbc:mysql://localhost:3306/student_manage";
			
			conn = DriverManager.getConnection(url,user,password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
