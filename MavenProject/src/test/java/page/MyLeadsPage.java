package page;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class MyLeadsPage extends ProjectSpecificMethod {
	
	public MyLeadsPage(RemoteWebDriver driver){
		this.driver=driver;
		
	}
	
	public void CreateLeadTap() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

}
