package home.assignment6;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionClassAmazon {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
search.sendKeys("oneplus 9 pro");
search.submit();
WebElement Price = driver.findElement(By.xpath("//span[text()='37,999']"));
String productPrice = Price.getText();
System.out.println("Price of the first product: " + productPrice);


WebElement ratings = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]"));
String customerratings = ratings.getText();
System.out.println("no of customerrating for the first product :" +customerratings);
driver.findElement(By.xpath("//span[text()='(Refurbished) OnePlus 9 Pro 5G (Pine Green, 12GB RAM, 256GB Storage)']")).click();
for (String obj : driver.getWindowHandles()) {
	driver.switchTo().window(obj);
	}

ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(tabs.get(1));


File scr = driver.getScreenshotAs(OutputType.FILE);

File des=new File("./snaps/img1.png");

FileUtils.copyFile(scr, des);




 WebElement AddToCart = driver.findElement(By.id("add-to-cart-button"));
 AddToCart.click();
 WebElement cartsubtotal = driver.findElement(By.xpath("//span[@id ='attach-accessory-cart-subtotal']"));
 String total = cartsubtotal.getText();
 String cartTotal = "SubTotal(1 item) :" +Price;
 if (total.equals(cartTotal)){
	 System.out.println("Cart total is correct :" +total);
	 
 }else {
	 System.out.println("Cart total is incorrect:" +total);
 
	 
 }
 Set<String> windowHandles = driver.getWindowHandles();

	List<String>windows = new ArrayList<String>(windowHandles);
	driver.switchTo().window(windows.get(1));
	driver.close();
	}
}

