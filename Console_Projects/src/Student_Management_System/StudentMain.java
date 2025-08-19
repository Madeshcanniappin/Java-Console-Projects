package Student_Management_System;

import java.util.*;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StudentManagementSystem sms= new StudentManagementSystem();
        Scanner sc=new Scanner(System.in);
        
        while(true)
        {
        	System.out.println("----------STUDENT MANAGEMENT SYSTEM------------");
        	System.out.println("1. Add Student");
        	System.out.println("2. View All Student");
        	System.out.println("3. Search Student");
        	System.out.println("4. Update Student");
        	System.out.println("5. Delete Student");
        	System.out.println("6. Exit");
        	System.out.println("Enter Your Choice: ");
        	int choice =sc.nextInt();
        	sc.nextLine();
        	
        	switch(choice)
        	{
        	case 1:
        		sms.addStudent();
        		break;
        	case 2:
        		sms.viewAll();
        		break;
        	case 3:
        		sms.searchByStudentID();
        	    break;
        	case 4:
        		sms.updateStudentByID();
        		break;
        	case 5:
        		sms.deleteStudentByID();
        		break;
        	case 6:
        		System.out.println("Exiting..."); 
        		return;
        	default: 
        		System.out.println("Invalid Choice");
        	}
        	
        }
	}

}
