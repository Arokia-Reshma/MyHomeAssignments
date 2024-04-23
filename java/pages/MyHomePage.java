package pages;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod{
	
	public void clickOnLeads() {
		driver.findElement(By.linkText("Leads")).click();
	}

}
