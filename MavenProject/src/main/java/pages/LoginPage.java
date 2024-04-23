package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
	public LoginPage(RemoteWebDriver driver){
		this.driver=driver;
		
	}
	
	

	public LoginPage enterUserName(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
		return this;
		
		}
	public LoginPage enterPassword(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
		return this;
	}
	
	public HomePage clickOnLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);
	}

}
