package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod {
	public MyHomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public MyLeadsPage clickOnLeads(){
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver);
		
	}

}
