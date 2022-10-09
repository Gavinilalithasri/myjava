package JAVA;

public class DemoBoxWeight {
	public static void main(String args[]) {
		BoxWeight b1=new BoxWeight(10,20,15,34.3);
		double vol;
		vol=b1.volume();
		System.out.println(vol);
		System.out.println(b1.weight);
		BoxWeight b2=new BoxWeight();
		System.out.println(b2.volume());
		System.out.println(b2.weight);
		BoxWeight b3=new BoxWeight(3,2);
		System.out.println(b3.volume());
		System.out.println(b3.weight);
		BoxWeight b4=new BoxWeight(b1);
		System.out.println(b4.volume());
		System.out.println(b4.weight);
		
		}

}
