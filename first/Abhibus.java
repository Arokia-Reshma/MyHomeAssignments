package marathon.first;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http:www.abhibus.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Bus']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//li[@class='collection-item auto-complete-list-item ']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='collection-item auto-complete-list-item ']")).click();
		driver.findElement(By.xpath("//a[@class = 'btn active text tertiary md active button']")).click();
	 String Bus = driver.findElement(By.xpath("//h5[text()='Yolo Bus']")).getText();
	 System.out.println("Bus Name:"+Bus);
	 driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
	 String Seat = driver.findElement(By.xpath("//div[@class ='text-grey']/small")).getText();
	 System.out.println("Available Seat"+Seat);
	 driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
	 driver.findElement(By.xpath("//span[text()='DU3']")).click();
	 driver.findElement(By.xpath("//p[text()='Sirsuri']")).click();
	 driver.findElement(By.xpath("//p[text()='Attibele Toll Gate']")).click();
	 String text = driver.findElement(By.id("seating-selected-seat-details")).getText();
	 System.out.println(text);
	 String title = driver.getTitle();
	 System.out.println(title);
	 
	 
	
	
	 
	 
	 
	 
	 
	 
		
	
	
		
		
		
		
		
		
	
		
		

		
		
		
		
		

	}

}

