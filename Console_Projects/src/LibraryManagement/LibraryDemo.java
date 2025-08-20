package LibraryManagement;

import java.util.Scanner;

public class LibraryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library l=new Library();
        
        
        
        while(true)
        {
        	System.out.println("----------Welcome to Library---------");
            System.out.println("1. Add Books");
            System.out.println("2. View Books");
            System.out.println("3. Issue Books");
            System.out.println("4. Return Books");
            System.out.println("5. Remove Book");
            System.out.println("6. Exit");
            
            Scanner sc=new Scanner(System.in);
            System.out.println("Choose an option: ");
            int choice=sc.nextInt();
            sc.nextLine();
        	switch(choice)
        	{
        	case 1:
        		l.addBook();
        		break;
        	case 2:
        		l.viewBook();
        		break;
        	case 3:
        		l.issueBook();
        		break;
        	case 4:
        		l.returnBook();
        		break;
        	case 5:
        		l.removeBook();
        		break;
        	case 6:
        		System.out.println("Exiting....");
        		return;
        	default:
        		System.out.println("Invalid Choice...");
        	   
        	}
        }
	}

}
