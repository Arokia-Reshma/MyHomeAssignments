package home.assignment3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		int totallinks = Links.size();
		System.out.println("total no of links:" +totallinks);
		for ( int i =0 ; i< totallinks; i++) {
			System.out.println(Links.get(i).getText());
		}
		
		
		}
	}


	


