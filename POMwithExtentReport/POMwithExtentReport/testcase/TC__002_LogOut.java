package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.ProjectSpecificMethod;
import pages.LoginPage;

public class TC__002_LogOut extends ProjectSpecificMethod {

	@BeforeTest
	public void setData() {
		
		testName="LogOut";
		testDesc="LeafTaps Application";
		testAuthor="Dilip";
		testCategory="Smoke";
		
		
	}
	
	
	@Test
	public void logOut() throws IOException {
		System.out.println(driver);
		new LoginPage(driver,node)
		.enterUserName("DemoCsr")
		.enterPassword("crmsfa")
		.clickOnLogin()
		.clickOnLogOut();
	}
}
