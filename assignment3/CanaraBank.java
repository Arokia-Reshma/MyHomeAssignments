package home.assignment3;

public abstract class CanaraBank implements Payments {
	public void cashOnDelivery()
	{
		System.out.println(" Cash on delivery");
	}
	public void upiPayments() {
		System.out.println(" upi payments - gpay/phonepe");
	}
	public void cardPayments() {
		System.out.println(" Enter card details");
	}
	public void internetBanking() {
		System.out.println("use internet banking");
	}
public abstract void recordPaymentDetails();
{
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
