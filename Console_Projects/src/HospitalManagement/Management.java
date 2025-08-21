package HospitalManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Management {

	
    ArrayList<Patient> patients=new ArrayList<>();
	ArrayList<Doctor> doctors=new ArrayList<>();
	ArrayList<Appointment> apps=new ArrayList<>();
	
	public void addPatient()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Patient Name: ");
		String name=sc.nextLine();
		
		System.out.print("\nEnter Patient ID: ");
		int PID=sc.nextInt();
		sc.nextLine();
		
		System.out.print("\nEnter Patient Age: ");
		int age =sc.nextInt();
		sc.nextLine();
		
		System.out.print("\nEnter Patient Disease: ");
		String disease=sc.nextLine();
		
		patients.add(new Patient(name,PID,age,disease));
		
		System.out.println("Patient Added Successfully....");
	}
	
	public void viewByPatientID() {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Patient ID: ");
		int id=sc.nextInt();
		for()
	}
	
	public void addDoctor()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Doctor Name: ");
		String name=sc.nextLine();
		
		System.out.print("\nEnter Doctor ID: ");
		int DID=sc.nextInt();
		sc.nextLine();
		
		
		
		System.out.print("\nEnter Specialization: ");
		String special=sc.nextLine();
		
		doctors.add(new Doctor(name,DID,special));
		
		System.out.println("Doctor Added Successfully....");
	}
}
