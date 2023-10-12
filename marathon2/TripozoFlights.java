package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TripozoFlights {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http:www.tripozo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='  Flights']")).click();
		driver.findElement(By.xpath("//input[@id='search-form_origin']")).sendKeys("MAA");
		driver.findElement(By.xpath("//span[text()='Chennai International Airport']")).click();
		driver.findElement(By.xpath("//input[@id='search-form_destination']")).sendKeys("GOX");
		driver.findElement(By.xpath("//span[text()='New Goa Manohar International Airport']")).click();
		driver.findElement(By.id("search-form_fromDate")).click();
		driver.findElement(By.xpath("//input[@class='calBtn'][1]")).click();
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		WebElement fare = driver.findElement(By.xpath("//span[text()=' Fare Type']"));
		Actions obj = new Actions(driver);
		obj.moveToElement(fare).perform();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		WebElement departure = driver.findElement(By.xpath("//span[text()=' Departure Time']"));
		obj.moveToElement(departure).perform();
		driver.findElement(By.xpath("//span[text()='6 AM - 12PM']")).click();
		WebElement Airlines = driver.findElement(By.xpath("//span[text()=' Airlines']"));
		obj.moveToElement(Airlines).perform();
		driver.findElement(By.xpath("html[1]/body[1]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[2]/div[1]/p[1]/label[1]/span[1]/input[1]")).click();
		WebElement Airlines1 = driver.findElement(By.xpath("//div[@class='airline-name']"));
		if(Airlines1.getText().contains("Air India")) {
			System.out.println("Displayed Airlines contains Air India");
		
			}else {
				System.out.println("Displayed Airlines doesn't contain Air India");
			}
		driver.findElement(By.xpath("//button[text()='Choose'][1]")).click();
String refundable = driver.findElement(By.xpath("(//span[@class='ant-tag ant-tag-green'])[2]")).getText();
		
		if (refundable.contains("Refundable")) {
			
			System.out.println("selected airline is 'Refundable'");
			
		}
		
		else {
			
			System.out.println("selected airline is not 'Refundable'");
		}
		driver.findElement(By.xpath("//span[text()='Flight Info']")).click();
		Thread.sleep(2000);
		 File scr = driver.getScreenshotAs(OutputType.FILE);
         
         //step-2-folder
         File des=new File("./snaps/img1.png");
         
         //step3
         FileUtils.copyFile(scr, des);
         
         driver.findElement(By.xpath("(//button[@type='button']//span)[3]")).click();
         driver.findElement(By.xpath("//span[text()='Fare Info']")).click();
         Thread.sleep(2000);
 File scr1 = driver.getScreenshotAs(OutputType.FILE);
         
         //step-2-folder
         File des1=new File("./snaps/img2.png");
         FileUtils.copyFile(scr1, des1);
         driver.close();
         
         
         
		
		
		
		
		
		
		

	}

}
