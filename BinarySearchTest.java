package JAVA;
import java.util.*;

public class BinarySearchTest {
	public static void main(String args[]) {
		BinarySearch ob=new BinarySearch();
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array:");
		n=sc.nextInt();
		int[] array=new int[20];
		System.out.println("enter elements:");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		int x;
		System.out.println("enter key:");
		x=sc.nextInt();
		int res=ob.BinarySearch(array, x, 0, n-1);
		if(res==-1)
			System.out.println("element not found");
		else
			System.out.println("element found at"+res);
	}

}
