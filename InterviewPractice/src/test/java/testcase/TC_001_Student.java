package testcase;

import org.testng.annotations.Test;

import baseClass.Psm;
import pages.Student;

public class TC_001_Student  extends Psm{
	@Test
	public void Studentdata() {
		Student s = new Student();
		s.enterFirstName()
		.enterLastName()
		.enterEmail()
		.enterPassword()
		.enterConfirmPassword()
		.clickOnSignUp();
		
	}

}
