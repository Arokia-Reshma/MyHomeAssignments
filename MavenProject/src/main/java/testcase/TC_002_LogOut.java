package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_002_LogOut extends ProjectSpecificMethod {
	@Test(dataProvider="fetchdata")
	public void LogOut(String uname,String pass){
		System.out.println(driver);
		
		new LoginPage(driver)
		.enterUserName(uname)
		.enterPassword(pass)
		.clickOnLogin()
		.clickOnLogout();
		
		
		
		
		}

}
