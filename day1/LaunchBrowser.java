package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//driver.close();
		
		
		driver.findElement(By.id("email")).sendKeys("reshma.peter7@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Wilsonresh@123");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Find your account and login")).click();
		
					
		

	}

}
