package session5.assignment4;

public class BankAxis extends Bank{
	
	void getRateOfInterest(double roi) {
		this.roi = roi;
		System.out.println("Rate of interest of Axis Bank ="+roi+"%");
	}

	public static void main(String[] args) {
		
		BankAxis axis = new BankAxis();
		axis.getRateOfInterest(9);

	}

}
