package JAVA;

public class ElectricityBill {
	String cnumber;
	String cname;
	int premonr;
	int curmonr;
	int typeEB;
	ElectricityBill(String num,String name,int p,int c,int t) {
		cnumber=num;
		cname=name;
		premonr=p;
		curmonr=c;
		typeEB=t;
	}
	double getbill() {
		double units=curmonr-premonr;
		if(typeEB==1) {
			if(units<=100)
				return units*1;
			else if(units<=200)
				return 100+(units-100)*2.5;
			else if(units<=500)
				return 100+250+(units-200)*4;
			else
				return 100+250+800+(units-500)*6;
	     }
		else {
			if(units<=100) 
				return units*2;
			else if(units<=200)
				return 200+(units-100)*4.5;
			else if(units<=500) 
				return 200+900+(units-200)*6;
			else 
				return 200+450+1200+(units-500)*7;
		}
		
	}

}
