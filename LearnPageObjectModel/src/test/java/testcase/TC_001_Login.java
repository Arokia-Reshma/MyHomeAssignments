package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_001_Login extends ProjectSpecificMethod {
	
	@BeforeTest
	public void setData() {
		filename="POM";
	}
	
	@Test(dataProvider="fetchData")
	public void logindata(String uname, String pass, String compName, String fName, String lName) {
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName(uname)
		.enterPassword(pass)
		.clickOnLogin()
		.clickOnCRMSFA()
		.clickOnLeads()
		.CreateLeadTap()
		.entercompName(compName)
		.enterfName(fName)
		.enterlName(lName)
		.clickOnsubmit();
		
		
		
		
		
		
		
	}
}
