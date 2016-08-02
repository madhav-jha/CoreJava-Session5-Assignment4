package session5.assignment4;

public class BankSBI extends Bank {
	
	void getRateOfInterest(double roi) {
		this.roi = roi;
		System.out.println("Rate of interest of SBI ="+roi+"%");
	}

	public static void main(String[] args) {
		BankSBI sbi = new BankSBI();
		sbi.getRateOfInterest(8);
		

	}

}
