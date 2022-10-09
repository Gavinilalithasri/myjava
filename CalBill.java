package JAVA;
import java.util.*;
public class CalBill {
	public static void main(String args[]) {
		Scanner s1=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		System.out.println("enter consumer number:");
		String num=s1.nextLine();
		System.out.println("enter consumer name:");
		String name=s1.nextLine();
		System.out.println("enter previous month reading:");
		int pmr=s2.nextInt();
		System.out.println("enter current month reading:");
		int cmr=s2.nextInt();
		System.out.println("enter type(1.domestic,2.commerical):");
		int ty=s1.nextInt();
		ElectricityBill b=new ElectricityBill(num,name,pmr,cmr,ty);
		System.out.println("bill:"+b.getbill());
	}

}



