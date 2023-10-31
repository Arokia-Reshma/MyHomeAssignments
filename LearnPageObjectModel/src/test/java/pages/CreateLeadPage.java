package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod {
	
	public CreateLeadPage(RemoteWebDriver driver) {
		this.driver=driver;
		}
	public CreateLeadPage entercompName(String compName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compName);
		return this;
	}
public CreateLeadPage enterfName(String fName) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
return this;

}
public CreateLeadPage enterlName(String lName) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
return this;
}
public ViewLeadPage clickOnsubmit() {
	driver.findElement(By.name("submitButton")).click();
	return new ViewLeadPage();
}
}
