package JAVA;

public class Book {
	String bname;
	int isbn;
	String author;
	String publisher;
	Book(String bname,int isbn,String author,String publisher) {
		this.bname=bname;
		this.isbn=isbn;
		this.author=author;
		this.publisher=publisher;
		}
	void setbname(String bname) {
		this.bname=bname;
	}
	String getbname() {
		return bname;
	}
	void setisbn(int isbn) {
		this.isbn=isbn;
	}
	int getisbn() {
		return isbn;
	}
	void setauthor(String author) {
		this.author=author;
	}
	String getauthor() {
		return author;
	}
	void setpublisher(String publisher) {
		this.publisher=publisher;
	}
	String setpublisher() {
		return publisher;
	}
	void getBookInfo() {
		System.out.println("Description of book");
		System.out.println("Name of book:"+bname);
		System.out.println("ISBN:"+isbn);
		System.out.println("Authorname:"+author);
		System.out.println("Publisher:"+publisher);
	}

}
