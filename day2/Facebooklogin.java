package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

		public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("reshma.peter7@gmail.com");
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Arokia@123");
			driver.findElement(By.name("login")).click();
			String title = driver.getTitle();
			String actual = "Facebook - Log in or Signup";
			
			System.out.println(title);
			
			if (title.equals(actual))
			
			{
				System.out.println(" login success");
			}
			else
				
			{
				System.out.println("login not success");
				
			
			}
		  String currentUrl = driver.getCurrentUrl();
		  System.out.println(currentUrl);
		}
}
	
		 

			


