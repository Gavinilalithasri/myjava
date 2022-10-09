package JAVA;

public class Invoice {
	String number;
	String des;
	int quantity;
	double price;
	Invoice(){
		number="";
		des="";
		quantity=0;
		price=0.0;
	}
	void setnumber(String number) {
		this.number=number;
	}
	String getnumber() {
		return number;
	}
	void setdes(String des) {
		this.des=des;
	}
	String getdes() {
		return des;
	}
	void setquantity(int quantity) {
		if(quantity<0)
			quantity=0;
			else
				this.quantity=quantity;
	}
	int getquantity() {
		return quantity;
	}
	void setprice(double price) {
		if(price<0)
			price=0.0;
		else
			this.price=price;
	}
	double getrice() {
		return price;
		
	}
	double getInvoiceAmount() {
		return quantity*price;
	}
	

}
