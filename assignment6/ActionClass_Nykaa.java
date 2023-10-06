package home.assignment6;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_Nykaa {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement moveover = driver.findElement(By.xpath("(//a[@class='css-1mavm7h'])[2]"));
		Actions obj = new Actions(driver);
		obj.moveToElement(moveover).perform();
		driver.findElement(By.xpath("//span[text()='Help']/following::input")).sendKeys("L'Oréal Paris");
		Thread.sleep(3000);
		driver.findElement(By.linkText("L'Oréal Paris")).click();
		if (driver.getTitle().contains("L'Oreal Paris")) {
            System.out.println("Title contains 'L'Oreal Paris'");
		}
            WebElement mouseOver = driver.findElement(By.xpath("//span[@class = 'sort-name']"));
		
		obj.moveToElement(mouseOver).click(mouseOver).perform();
		WebElement radiobutton = driver.findElement(By.xpath("//div[@id='filter-sort']/div[1]/div[1]/ul[1]/div[4]/label[1]/div[2]"));
		obj.moveToElement(radiobutton).click(radiobutton).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@class='control-indicator checkbox ']")).click();
		WebElement concern = driver.findElement(By.xpath("(//span[@class='title '])[3]"));
		obj.moveToElement(concern).click(concern).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@for='checkbox_Colour Protection_229250']//div)[2]")).click();
		WebElement filtersApplied = driver.findElement(By.xpath("//span[text()='Filters Applied']/../following-sibling::div[1]"));
		if(filtersApplied.getText().contains("Shampoo")) {
			System.out.println("Filter Applied contains Shampoo");
		
			}else {
				System.out.println("Filter Applied doesn't contain Shampoo");
			}
		driver.findElement(By.xpath("//div[@class='css-ifdzs8']//div")).click();
		Set<String> windowHandles = driver.getWindowHandles();

		List<String>windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		driver.findElement(By.xpath("//span[text()='180ml']")).click();
		String price = driver.findElement(By.xpath("//span[text()='₹209']")).getText();
		System.out.print("MRP:" +price);
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		driver.findElement(By.className("cart-count")).click();
		driver.switchTo().frame(0);
	
		String total = driver.findElement(By.xpath("//span[text()='₹279']")).getText();
		System.out.println("Grand total:" +total);
		
		Thread.sleep(2000);
	
		WebElement findElement = driver.findElement(By.xpath("//div[@class='css-15vhhhd e25lf6d1']/following-sibling::div[1]"));
		findElement.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		driver.findElement(By.xpath("//div[@class='css-gecnnw eqr1d9n12']")).click();
		String text = driver.findElement(By.xpath("//p[@class='css-1e59vjt eka6zu20']")).getText();
		System.out.println(text);
			if(total.equals(text)) {
				System.out.println("Grand total and cart total are equal");
			}else {
				System.out.println("Grand total and cart total are equal");
			}
				
				
				
		}
		}
	

		
		
		
		
		
	
	
		

	


