package LibraryManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

	ArrayList<Book> book=new ArrayList<>();
	
	public void addBook()
	{
		System.out.print("Enter Book Title to Add: ");
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		
		System.out.print("\nEnter Book ID: ");
		int bookID=sc.nextInt();
		sc.nextLine();
		
		System.out.print("\nEnter Author Name: ");
		String author=sc.nextLine();
		
		System.out.print("\nBook issued? Yes/No : ");
		String issued=sc.nextLine();
		boolean isIssued=issued.toLowerCase().equals("yes");
		
		book.add(new Book(bookID,title,author,isIssued));
		System.out.println("Book Added Successfully....");
		
	}
	
	public void viewBook()
	{
		if(book.isEmpty())
		{
			System.out.println("No Books are available");
			return;
		}
		
			System.out.println("-----------BOOKS----------");
			for(Book bk:book)
			{
				System.out.println("Book ID: "+ bk.getBookID()+ " Title: "+ bk.getTitle()+" Author: "+bk.isIssued());
				System.out.println();
			}
		
		System.out.println("------------------------");
	}
	
	public void issueBook()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book ID to issue: ");
		int bookID=sc.nextInt();
		sc.nextLine();
		
		for (Book b:book)
		{
			if(b.getBookID()==bookID)
			{
				if(!b.isIssued())
				{
					b.setIssued(true);
					System.out.println("Book "+b.getTitle()+"is Issued");
				}
				else {
					System.out.println("Sorry Book is not Currently Available...");
				}
				return;
			}
			 
		}
		System.out.println("Book Not Found...");
	}
	
	public void returnBook()
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter Book ID to return: ");
		int bookID=sc.nextInt();
		sc.nextLine();
		
		for(Book b:book)
		{
			if(b.getBookID()==bookID)
			{
				if(b.isIssued())
				{
					b.setIssued(false);
					System.out.println("Book "+b.getTitle()+"is returned succesfully");
				}
				else {
					System.out.println("Book "+b.getTitle()+" is not issued yet to return");
				}
			}
			return;
		}
		System.out.println("Book with "+bookID+" Not Found");
		
	}
	
   public void removeBook()
   {
	   Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter Book ID to return: ");
		int bookID=sc.nextInt();
		sc.nextLine();
		
		for(Book b:book)
		{
			if(b.getBookID()==bookID)
			{
				book.remove(b);
				System.out.println("Book removed successfully");
				return;
			}
		}
		System.out.println("Book Not Found");
   }
	
}
