package home.assignment8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RedHat extends BaseClass {
	
	@BeforeTest
	
	public void setData() {
		filename="RedHatData";
	}
	
	
	@Test(dataProvider = "fetchData")
	
	public  void runRedHat(String uname, String Pswd, String cnfrmpswd, String fName, String lName, String email, String phNum, String adrs1, String adrs2,String pCode, String city, String state ) {
		
	WebElement reg = driver.findElement(By.id("rh-registration-link"));
		Actions obj = new Actions(driver);
		obj.moveToElement(reg).click().perform();
		boolean displayed = driver.findElement(By.id("kc-register-form")).isDisplayed();
		 if(displayed) {
			 System.out.println("registration form is displayed");
		 }else {
			 System.out.println("registration form not displayed");
		 }
		 driver.findElement(By.id("username")).sendKeys(uname);
		 driver.findElement(By.id("password")).sendKeys(Pswd);
		 driver.findElement(By.id("confirmPassword")).sendKeys(cnfrmpswd);
		 driver.findElement(By.id("firstName")).sendKeys(fName);
		 driver.findElement(By.id("lastName")).sendKeys(lName);
		 driver.findElement(By.id("email")).sendKeys(email);
		 driver.findElement(By.id("user.attributes.phoneNumber")).sendKeys(phNum);
		 driver.findElement(By.id("personal")).click();
		 WebElement country = driver.findElement(By.id("user.attributes.country"));
		 Select option = new Select(country);
		 (option).selectByVisibleText("India");
		 driver.findElement(By.id("user.attributes.addressLine1")).sendKeys(adrs1);
		  driver.findElement(By.id("user.attributes.addressLine2")).sendKeys(adrs2);
		  driver.findElement(By.id("user.attributes.addressPostalCode")).sendKeys(pCode);
		  driver.findElement(By.id("user.attributes.addressCityText")).sendKeys(city);
		  driver.findElement(By.id("user.attributes.addressState")).sendKeys(state);
	}
	
	
	 
		
	
	}


	

