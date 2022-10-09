package JAVA;
public class Test43 {
	public static void main(String args[]) {
		BinSearch ag=new BinSearch();
		int[] l= {1,2,3,4};
		int n=l.length;
		int key=2;
		int res=ag.search(l,key);
		if (res==-1) 
			System.out.println("element not found");
		else
			System.out.println("element found at"+res);
		
		
	}

}
