package pages;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod {
	
	public MyHomePage clickOnCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		return new MyHomePage();
	}
	
	public LoginPage clickOnLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage();
	}

}
