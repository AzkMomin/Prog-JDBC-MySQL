package com.student.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class studentDao {
	public static boolean InsertStudentToDB(student st) {
		boolean f =false;
		try {
			//jdbc connection
			Connection conn = CP.createC();
			String q = "insert into students(sname ,sphone , scity) " + "values (?,?,?)";
			
			//Prepared statement
			PreparedStatement pstmt = conn.prepareStatement(q);
			
			//Set the values of parameter
			pstmt.setString(1, st.getSname());
			pstmt.setString(2, st.getSphone());
			pstmt.setString(3, st.getScity());
			
			pstmt.execute();
			
			conn.close();
			
			f =true;
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
}
