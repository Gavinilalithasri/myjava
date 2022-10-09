package JAVA;

public class Box {
	double width;
	double depth;
	double height;
	Box(Box ob) {
		width=ob.width;
		depth=ob.depth;
		height=ob.height;
	}
	Box(double w,double d,double h) {
		width=w;
		depth=d;
		height=h;
	}
	Box() {
		width=-1;
		depth=-1;
		height=-1;
	}
	Box(double len) {
		width=depth=height=len;
	}
	double volume() {
		return width*depth*height;
	}

}
