package testcase;

import org.testng.annotations.Test;

import baseClass.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_002_LogOut extends ProjectSpecificMethod {
	@Test
	public void LogOut(){
		
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickOnLogin()
		.clickOnLogout();
		
		
		
		
		}

}
