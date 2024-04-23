package pages;

import org.openqa.selenium.By;

import baseClass.Psm;

public class LoginPage extends Psm {
	public LoginPage clickOnStudent() {
		driver.findElement(By.xpath("//div[@class='card']//img")).click();
		return new LoginPage();
		
	
		
	}
	public LoginPage clickOnAcademy(){
		driver.findElement(By.className("(//img[@class='card-img-top'])[2]")).click();
		return new LoginPage();
		
	}
}
 