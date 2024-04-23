package testcase;

import org.testng.annotations.Test;

import baseClass.Psm;
import pages.Academy;

public class TC_002_Academy extends Psm {
	@Test
	public void AcademyData() {
		Academy a = new Academy();
		a.enterFirstName()
		.enterLastName()
		.enterPassword()
		.enterConfirmPassword()
		.clickOnSignUp();
		
	}

}
