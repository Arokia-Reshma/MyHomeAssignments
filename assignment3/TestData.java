package home.assignment3;

public class TestData extends LoginTestData {
	public void enterCredentials() {
		System.out.println(" Enter your Credentials");
	}
		public void navigateToHomePage() {
			System.out.println("Home");
			
		}

	public static void main(String[] args) {
		TestData td = new TestData();
		td.enterCredentials();
		td.navigateToHomePage();
		td.enterUsername();
		td.enterPassword();

	}

}
