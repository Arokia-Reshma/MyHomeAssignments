package pages;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
	

	public LoginPage enterUserName() {
		driver.findElement(By.id("username")).sendKeys("DemosalesManager");
		return this;
		
		}
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	
	public HomePage clickOnLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage();
	}

}
