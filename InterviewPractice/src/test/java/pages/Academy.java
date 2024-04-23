package pages;

import org.openqa.selenium.By;

import baseClass.Psm;

public class Academy extends Psm{
public Academy enterFirstName(){
	driver.findElement(By.xpath("//span[text()='or use your email for registration']/following::input")).sendKeys("Arokia");
	return this;
}
	public Academy enterLastName() {
		driver.findElement(By.xpath("(//span[text()='or use your email for registration']/following::input)[2]")).sendKeys("Reshma");
		return this;
	}
	
	public Academy enterEmail() {
		driver.findElement(By.xpath("(//span[text()='or use your email for registration']/following::input)[3]")).sendKeys("arokiareshma@gmail.com");
		return this;
		
	}
	
	public Academy enterPassword() {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Arokiag@123");
		return this;
		
	}
	
	public Academy enterConfirmPassword() {
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Arokiag@123");
		return this;
		
	}
	
	public HomePage clickOnSignUp() {
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		return new HomePage();
		
	}
}

