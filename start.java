import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.student.manager.student;
import com.student.manager.studentDao;
import com.student.manager.studentDel;
import com.student.manager.studentDisplay;
import com.student.manager.studentUpdate;

public class start {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Welcome to Student Management System");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Press 1 to add student");
			System.out.println("Press 2 to delete student");
			System.out.println("Press 3 to display");
			System.out.println("Press 4 to update");
			
			int c = Integer.parseInt(br.readLine());
			
			if( c == 1) {
				System.out.println("Enter Your Name");
				//Getting name of user
				String name = br.readLine();
				
				System.out.println("Enter Your Phone Number");
				// Getting User Phone Number
				String phoneNo = sc.nextLine();
				
				System.out.println("Enter Your City Name");
				//Getting City Name
				String cityName = br.readLine();
				
				//Creating object of student class
				student sd = new student(name , phoneNo , cityName);
				boolean ans = studentDao.InsertStudentToDB(sd);
				if (ans == true) {
					System.out.println("Data Added Successfully ");
				}
				else {
					System.out.println("Something wnt wrong please try again...");
				}
				
//				sd.printDetail();
				
			}	
			else if(c == 2) {
				//Delete the record
				System.out.println("Enter the name of student you want to delete");
				
				//Getting name
				String getName = sc.nextLine();
				
				boolean ans = studentDel.DeleteStdFromDb(getName);
				
				if(ans == true) {
					System.out.println("Data successfully deleted..");
				}
				else {
					System.out.println("Something went wrong.. try again..");
				}
			}
			else if(c == 3) {
				//Student details
				studentDisplay.PrintStudentDetails();
			}
			else if(c == 4) {
				//Update details
				
				//Getting S_id
				System.out.println("Enter the id of record which you want to update");
				int getId = sc.nextInt();
				
				//Getting S_id
				System.out.println("Enter the which you want to update");
				int getUpdateId = sc.nextInt();
				
				//Getting name
				System.out.println("Enter the name");
				String sname = sc.next();
				
				//Getting phone number
				System.out.println("Enter you phone number");
				String sphone = sc.next();
				
				//Getting city
				System.out.println("Enter you city");
				String scity = sc.next();
				
				//object of student class
				student st = new student(getUpdateId , sname , sphone,scity,getId);
				
				boolean ans = studentUpdate.updateRecords(st);
				
				if(ans == true) {
					System.out.println("Record has been updated successfully.....");
				}
				else {
					System.out.println("Someting went wrong please try again....");
				}
			}
			else if(c == 5) {
				break;
			}
			else {
				System.out.println("Enter the valid details");
				
			}
		}

	}

}
