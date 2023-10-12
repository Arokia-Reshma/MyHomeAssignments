package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tatacliq {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tatacliq.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("wzrk-cancel")).click();
		WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions obj = new Actions(driver);
		obj.moveToElement(brands).click().perform();
		WebElement watch = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		obj.moveToElement(watch).click().perform();
		WebElement watchbrand = driver.findElement(By.xpath("//div[text()='Casio']"));
		obj.moveToElement(watchbrand).click().perform();
		
		WebElement sort = driver.findElement(By.className("SelectBoxDesktop__hideSelect"));
		Select option = new Select(sort);
        (option).selectByIndex(3);
		driver.findElement(By.xpath("//div[@class='FilterDesktop__newFilCheckbox']//div")).click();
		Thread.sleep(5000);
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']//h3"));
		String text2 = price.get(0).getText();
		String watchPriceMainWindow = text2.replaceAll("[^0-9]", "");
		for (WebElement data : price) {
			System.out.println(data.getText());
			}
		driver.findElement(By.xpath("//div[@class='ProductModule__dummyDiv']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String>windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
	    String text = driver.findElement(By.xpath("//h3[text()='MRP:  ₹9195']")).getText();
	   Thread.sleep(2000);
	   String watchPriceChildWindow = text.replaceAll("[^0-9]", "");
	    if(watchPriceMainWindow.equals(watchPriceChildWindow)) {
			System.out.println("prices are same");
		}else {
			System.out.println("prices are different");
		}
		driver.findElement(By.xpath("(//div[@class='Button__base'])[3]")).click();
		String cart = driver.findElement(By.xpath("//span[text()='1']")).getText();
		System.out.println("cart value :" +cart);
		driver.findElement(By.xpath("//span[text()='1']")).click();
		Thread.sleep(2000);
		File scr2 = driver.getScreenshotAs(OutputType.FILE);
        File des2=new File("./snaps/img3.png");
        FileUtils.copyFile(scr2, des2);
        driver.switchTo().window(windows.get(1));
        driver.close();
        driver.switchTo().window(windows.get(0));
        driver.close();
		
		
		
			

	}
}

