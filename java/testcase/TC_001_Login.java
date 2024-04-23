package testcase;

import org.testng.annotations.Test;

import baseClass.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_001_Login extends ProjectSpecificMethod {
@Test
	public void logindata() {
		LoginPage lp =new LoginPage();
	
		lp.enterUserName()
		.enterPassword()
		.clickOnLogin()
		.clickOnCRMSFA()
		.clickOnLeads();
		
		
		
		
		
		
		
		
		
		
		
	}
}

