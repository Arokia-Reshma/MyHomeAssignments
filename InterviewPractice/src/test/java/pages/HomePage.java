package pages;

import org.openqa.selenium.By;

import baseClass.Psm;

public class HomePage extends Psm{

	public HomePage clickOnGetStarted() {
	driver.findElement(By.linkText("Get Started")).click();
	return new HomePage();
	

	}

}
