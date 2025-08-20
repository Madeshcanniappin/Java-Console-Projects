package LibraryManagement;

public class Book {
       
	private int bookID;
	private String title;
	private String author;
	private boolean isIssued;
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isIssued() {
		return isIssued;
	}
	public void setIssued(boolean isIssued) {
		this.isIssued = isIssued;
	}
	
	public Book(int bookID, String title, String author, boolean isIssued) {
		super();
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.isIssued = isIssued;
	}
	
	
	
}
