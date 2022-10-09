package JAVA;
import java.util.*;
public class BookTest {
	public static void main(String args[]) {
		Scanner s1=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		System.out.println("enter name:");
		String n=s1.nextLine();
		System.out.println("enter isbn:");
		int i=s1.nextInt();
		System.out.println("enter author:");
		String a=s2.nextLine();
		System.out.println("enter publisher:");
		String p=s2.nextLine();
		Book b[]=new Book[30];
		b[1]=new Book(n,i,a,p);
		b[1].getBookInfo();
	}
}
