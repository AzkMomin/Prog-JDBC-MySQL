package com.student.manager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class studentDisplay {
	
	public static void PrintStudentDetails() {
		try {
			//Establishing connection
			Connection conn = CP.createC();
			
			//Querry
			String q = "select * from students";
			
			Statement st = conn.createStatement();
			
			ResultSet set = st.executeQuery(q);
			
			while(set.next()) {
				int id = set.getInt(1);
				String sname = set.getString(2);
				String sphone = set.getString(3);
				String scity = set.getString("scity");
				
				System.out.println("Id : " + id);
				System.out.println("Name : " + sname);
				System.out.println("Phone Number : " + sphone);
				System.out.println("City : " + scity);
				System.out.println("-------------------");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
