package JAVA;

public class Bank {
	public static void main(String args[]) {
		SavingsAccount s1=new SavingsAccount(2000,0);
		SavingsAccount s2=new SavingsAccount(3000,0);
		s1.ModifyInterest(0.04);
		System.out.println("saver1:"+s1.Inter());
		s2.ModifyInterest(0.04);
		System.out.println("saver2:"+s2.Inter());
		System.out.println("changed");
		s1.ModifyInterest(0.05);
		System.out.println("saver1:"+s1.Inter());
		s2.ModifyInterest(0.05);
		System.out.println("saver2:"+s2.Inter());
	}
	

}
