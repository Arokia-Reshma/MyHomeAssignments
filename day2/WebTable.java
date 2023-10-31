package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement findElement = driver.findElement(By.xpath("//input[@id ='txtStationFrom']"));
		findElement.clear();
		findElement.sendKeys("MAS" ,Keys.ENTER);

		WebElement findElement2 = driver.findElement(By.xpath("//input[@id = 'txtStationTo']"));
		findElement2.clear();
		findElement2.sendKeys("MDU" ,Keys.ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		List<WebElement> trainnames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));
		  int trainSize = trainnames.size();
	        
	        for (int i = 1; i <=trainSize; i++) {
	            String text = trainnames.get(i).getText();
	            System.out.println(text);
	            
	        }
		
	

}
}