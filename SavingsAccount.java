package JAVA;

public class SavingsAccount {
	private static double annir;
	private double savbal;
	SavingsAccount(double bal,double annir) {
		savbal=bal;
		annir=0;
	}
	double Inter() {
		double mi=(savbal*annir)/12;
		savbal=savbal+mi;
		return savbal;
	}
	void ModifyInterest(double newin) {
		annir=newin;
	}

}
