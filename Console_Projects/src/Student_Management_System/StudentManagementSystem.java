package Student_Management_System;

import java.util.*;

public class StudentManagementSystem {
     
	private ArrayList<Student> students=new ArrayList<>();
	private Scanner sc=new Scanner(System.in);
	
	public void addStudent()
	{
		System.out.println("Enter Name: ");
		String name=sc.nextLine();
		System.out.println("Enter ID: ");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Age: ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Course: ");
        String course = sc.nextLine();
        
        students.add(new Student(name,id,age,course));
        System.out.println("Student Added Successfully");
	}
	
	public void viewAll()
	{
		if(students.isEmpty())
		{
			System.out.println("No students found");
			return;
		}
		for(Student s:students) {
			System.out.println(s);
		}
		System.out.println();
	}
	
	
	public void searchByStudentID()
	{
		System.out.println("Enter student ID: ");
		int id=sc.nextInt();
		sc.nextLine();
		
		for(Student s:students)
		{
			if(s.getId()==id)
			{
				System.out.println("Student Found:"+s+"\n");
				return;
			}
		}
		System.out.println("Student Not Found");
	}
	
	
	public void updateStudentByID()
	{
		System.out.println("Enter Student ID to update: ");
		int id =sc.nextInt();
		sc.nextLine();
		
		for(Student s:students)
		{
			if(s.getId()==id)
			{
				System.out.println("Enter New Name: ");
				s.setName(sc.nextLine());
				System.out.println("Enter New ID: ");
				s.setId(sc.nextInt());
				System.out.println("Enter New Age: ");
				s.setAge(sc.nextInt());
				System.out.println("Enter New Course: ");
				s.setCourse(sc.nextLine());
				System.out.println("Updated Successfully!!");
				return;
			}
		}
		System.out.println("Not Found");
	}
	
	
	public void deleteStudentByID() {
		System.out.println("Enter Student ID to remove: ");
		int id=sc.nextInt();
		sc.nextLine();
		
		for(Student s:students)
		{
			if(s.getId()==id)
			{
				students.remove(s);
				System.out.println("Student deleted successfully");
				return;
			}
		}
		System.out.println("Student Not Found");
	}
	
}
