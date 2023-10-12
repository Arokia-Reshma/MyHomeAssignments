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

public class Hotels {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http:www.tripozo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement Hotels = driver.findElement(By.xpath("//span[text()=' Hotels']"));
		Actions obj = new Actions(driver);
		obj.moveToElement(Hotels).click().perform();
	    driver.findElement(By.xpath("//input[@id='CityData']")).click();
	    driver.findElement(By.xpath("(//div[contains(@class,'airport_name f-vcenter')])[2]")).click();
	    WebElement checkin = driver.findElement(By.xpath("//td[@class='ant-picker-cell ant-picker-cell-in-view ant-picker-cell-today']/following::td"));
	    String text2 = checkin.getText();
	    checkin.click();
	    
	  //  driver.findElement(By.xpath("//input[@placeholder='Check-Out']")).click();
	    driver.findElement(By.xpath("//td[@title='2023-10-13']//div[1]")).click();
	    driver.findElement(By.xpath("//span[text()=' Search']")).click();
	    WebElement Amenities = driver.findElement(By.xpath("//span[text()=' Amenities']"));
	    obj.moveToElement(Amenities).perform();
	    driver.findElement(By.xpath("//input[@class='ant-checkbox-input']")).click();
	    driver.findElement(By.xpath("//span[text()='15']/following::input")).click();
	    WebElement parking = driver.findElement(By.xpath("html[1]/body[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/p[10]/label[1]/span[1]/input[1]"));
	    obj.moveToElement(parking).click().perform();
	    driver.findElement(By.xpath("//span[text()='43']/following::input")).click();
	    WebElement ratings = driver.findElement(By.xpath("//span[text()=' Star Rating']"));
	    obj.moveToElement(ratings).perform();
	    driver.findElement(By.xpath("html[1]/body[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[2]/div[1]/div[6]/label[1]/span[1]/input[1]")).click();
	    driver.findElement(By.xpath("//span[text()='Choose']")).click();
	   
	    String text = driver.findElement(By.xpath("//span[text()=' Check In : ']/..")).getText();
	    System.out.println(text);
	    if(text.contains(text2)) {
	    	System.out.println("checkin verified");
	    }else {
	    	System.out.println("checkin not verified");
	    	
	    }
	   driver.findElement(By.xpath("//button[text()='View Rooms']")).click();
	    driver.findElement(By.xpath("(//button[@type='button']//span)[2]")).click();
	    WebElement room= driver.findElement(By.xpath("//span[contains(@class,'blocklink blnk-small')]/following-sibling::span[1]"));
	    obj.moveToElement(room).click().perform();
	    Thread.sleep(2000);
	    File scr2 = driver.getScreenshotAs(OutputType.FILE);
        
        //step-2-folder
        File des2=new File("./snaps/img3.png");
        FileUtils.copyFile(scr2, des2);
        driver.close();
	}

}
