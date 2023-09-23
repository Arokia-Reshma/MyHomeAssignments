package marathon.first;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']")).sendKeys("Bags for b");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label ='bags for boys']")).click();
		String Bags = driver.findElement(By.xpath("//div[@class ='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println("number of results:" +Bags);
		driver.findElement(By.xpath("//span[text()='Skybags']")).click();
		driver.findElement(By.xpath("//span[text()='ADISA']")).click();
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		String text = driver.findElement(By.xpath("//span[text()='Unisex Printed School Backpack For Kids, Black (Ironman Marvel)']")).getText();
		System.out.println(text);
		String discount = driver.findElement(By.xpath("//span[text()='(32% off)']")).getText();
		System.out.println(discount);
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
