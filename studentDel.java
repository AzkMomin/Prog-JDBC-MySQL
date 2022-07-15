package com.student.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class studentDel {
	public static boolean DeleteStdFromDb(String user) {
		boolean f = false;
		
		try {
			//jdbc connection
			Connection conn = CP.createC();
			
			//Querry for delete
			String q = "delete from students where sname =?";
			
			//Prepared statement for dynamic name
			PreparedStatement pstmt = conn.prepareStatement(q);
			pstmt.setString(1, user);
			
			//Executing
			pstmt.execute();
			//Closing connection
			conn.close();
			
			f = true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return f;
		
	}

}
