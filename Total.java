package JAVA;
import java.util.*;
public class Total {
	public static void main(String args[]) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter number:");
		String num=s1.nextLine();
		System.out.println("enter des:");
		String des=s1.nextLine();
		System.out.println("enter quantity:");
		int q=s1.nextInt();
		System.out.println("enter price:");
		double p=s1.nextDouble();
		Invoice item1=new Invoice();
		System.out.println("bill of item:"+item1.getInvoiceAmount());
		
			
		
	}
	
	

}

