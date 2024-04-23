package testcase;

import org.testng.annotations.Test;

import baseClass.ProjectSpecificMethod;
import page.LoginPage;

public class TC_002_LogOut1 extends ProjectSpecificMethod {
	@Test
	public void LogOut(){
		System.out.println(driver);
		
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickOnLogin()
		.clickOnLogout();
		
		
		
		
		}

}
