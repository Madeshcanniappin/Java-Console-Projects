package HospitalManagement;

import java.util.Scanner;

public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("-------Welcome to the Hospital---------");
        System.out.println("1. Add Patient");
        System.out.println("2. View Patient");
        System.out.println("3. Remove Patient");
        System.out.println("3. Add Doctor");
        System.out.println("4. Viw  Doctor");
        System.out.println("5. Remove Doctor");
        System.out.println("5. Schedule Appointment");
        System.out.println("6. View Appointments");
        System.out.println("7. Cancel Appointment");
        System.out.println("8. Exit");
        System.out.println("Choose an option: ");
        int choice=sc.nextInt();
        sc.nextLine();
        
        

	}

}
