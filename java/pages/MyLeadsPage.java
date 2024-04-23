package pages;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificMethod;

public class MyLeadsPage extends ProjectSpecificMethod {
	
	public void CreateLeadTap() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

}
