package testcase;

import org.testng.annotations.Test;

import baseClass.ProjectSpecificMethod;
import page.LoginPage;

public class TC_001_Login1 extends ProjectSpecificMethod {


	@Test
	public void logindata() {
		LoginPage lp = new LoginPage(driver);
	System.out.println(driver);
		lp.enterUserName()
		.enterPassword()
		.clickOnLogin()
		.clickOnCRMSFA()
		.clickOnLeads();
}


}

