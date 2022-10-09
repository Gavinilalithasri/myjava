package JAVA;

public class SimpleInheritance {
	public static void main(String args[]) {
	  A superOb=new A();
	  B subOb=new B();
	  superOb.i=10;
	  superOb.j=20;
	  System.out.println("Contents of superOb:");
	  superOb.showij();
	  System.out.println("Contents of subOb:");
	  subOb.i=7;
	  subOb.j=8;
	  subOb.k=9;
	  subOb.showij();
	  subOb.showk();
	  System.out.println("sum of i,j& k in subOb:");
	  subOb.sum();
	   
	
	}
}
