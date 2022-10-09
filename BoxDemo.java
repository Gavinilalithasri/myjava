package JAVA;

public class BoxDemo {
	public static void main(String args[]) {
		Box b1=new Box();
		b1.width=10;
		b1.depth=20;
		b1.height=30;
		System.out.println("vol of box:"+b1.volume());
	}

}
