package JAVA;

public class SamePackage {
	SamePackage() {
		Protection p=new Protection();
		System.out.println("same package constructor");
		System.out.println(p.n);
		//System.out.println(p.npri);
		System.out.println(p.npro);
		System.out.println(p.npub);
	}

}
