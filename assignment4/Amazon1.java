package home.assignment4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phones");
		driver.findElement(By.xpath("//div[@aria-label = 'phones']")).click();
		List<WebElement> links = driver.findElements(By.xpath("//span[@class ='a-price-whole']"));
		int totallinks=links.size();
		System.out.println( " total no of links:" +totallinks);
		List <Integer> list = new ArrayList<Integer>();
		for (WebElement data : links) {
			String text = data.getText();
		String lowPrice = text.replaceAll("[^0-9]", "");
			int price= Integer.parseInt(lowPrice);
	list.add(price);

		}
		Collections.sort(list);
		System.out.println(list);
	System.out.println("Lowest Price :" +list.get(0));
		
			
		}
	
		
		
		

	}


