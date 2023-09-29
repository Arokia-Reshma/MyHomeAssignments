package home.assignment4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.ajio.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.findElement(By.xpath("//input[@name = 'searchVal']")).sendKeys("bags");
	driver.findElement(By.xpath("//span[@class='ic-search']")).click();
	driver.findElement(By.xpath("//li[@class ='rilrtl-list-item'][3]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//label[@class ='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
Thread.sleep(2000);
	String Links = driver.findElement(By.xpath("//div[@class='length']")).getText();
	
	
	System.out.println(Links);
	
	List<WebElement> BrandName = driver.findElements(By.xpath("//div[@class='brand']"));
	
	
	int size = BrandName.size();
	System.out.println("total no of links =:" +size);
	List <String>list = new ArrayList<String>();
	for (WebElement data : BrandName) {
		String text = data.getText();
		System.out.println(text);
		
	}
	
	

	
	
	
	
		
		

	}
	

}
