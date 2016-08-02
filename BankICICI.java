package session5.assignment4;

public class BankICICI extends Bank {
	
	void getRateOfInterest(double roi) {
		this.roi = roi;
		System.out.println("Rate of interest of ICICI Bank ="+roi+"%");
	}

	public static void main(String[] args) {
		BankICICI icici = new BankICICI();
		icici.getRateOfInterest(7);

	}

}
