package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_001_Login extends ProjectSpecificMethod {
	
	
	@BeforeTest
	public void setData(){
		
		filename ="Login1";
		
	}
	
	
	
	
	
@Test(dataProvider ="fetchData")
	public void logindataTC(String uname , String pass) {
		LoginPage lp =new LoginPage(driver);
	System.out.println(driver);
		lp.enterUserName(uname)
		.enterPassword(pass)
		.clickOnLogin()
		.clickOnCRMSFA()
		.clickOnLeads();
		
		
		
		
		
		
		
		
		
		
		
	}
}

