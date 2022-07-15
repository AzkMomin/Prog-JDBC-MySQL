package com.student.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class studentUpdate {
	public static boolean updateRecords(student st) {
		boolean f = false;
//		System.out.println(st.getS_id());
	
		
		try {
			Connection conn = CP.createC();
			
			String q = "update students set S_id = ?, sname = ? , sphone = ? , scity = ?  where S_id =?";
			
			PreparedStatement pstmt = conn.prepareStatement(q);
			
			
			pstmt.setInt(1,st.getS_idUpdate());
			pstmt.setString(2,st.getSname());
			pstmt.setString(3, st.getSphone());
			pstmt.setString(4, st.getScity());
			pstmt.setInt(5,st.getS_id());
			
			pstmt.execute();
			
			conn.close();
			
			f= true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}
