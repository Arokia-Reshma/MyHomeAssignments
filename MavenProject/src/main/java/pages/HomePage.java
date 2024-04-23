package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod {
	
	public HomePage(RemoteWebDriver driver){
		this.driver=driver;
		
	}
	
	public MyHomePage clickOnCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		return new MyHomePage(driver);
	}
	
	public LoginPage clickOnLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver);
	}

}
