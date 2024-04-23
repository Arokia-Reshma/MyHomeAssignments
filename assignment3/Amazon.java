package home.assignment3;

public class Amazon extends CanaraBank {
	

	public static void main(String[] args) {
		Amazon a =new Amazon();
		a.cardPayments();
		a.cashOnDelivery();
		a.upiPayments();
		a.internetBanking();
		a.recordPaymentDetails();
		

	}

	@Override
	public void recordPaymentDetails() {
		System.out.println("record payment details");
		
	}

}
