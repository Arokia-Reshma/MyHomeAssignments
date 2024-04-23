package pages;

import org.openqa.selenium.By;

import baseClass.Psm;

public class Student extends Psm {
	public Student enterFirstName(){
		driver.findElement(By.xpath("//input[@placeholder='Firstname']")).sendKeys("Arokia");
		return this;
		}
	public Student enterLastName() {
		driver.findElement(By.xpath("//input[@placeholder='Lastname']")).sendKeys("Reshma");
		return this;
		}
	public Student enterEmail() {
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("arokiareshma@gmail.com");
		return this;
	}
		
		public Student enterPassword() {
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Arokia@123");
			return this;
		}
		public Student enterConfirmPassword() {
			driver.findElement(By.xpath("//input[@placeholder='confirmPassword']")).sendKeys("Arokia@123");
			return this;
			}
		public HomePage clickOnSignUp() {
			driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
			return new HomePage();
			
		}
		
	}


