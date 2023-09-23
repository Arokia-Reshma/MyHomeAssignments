package marathon.first;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRCINEMAS {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.pvrcinemas.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[@class='icon-glow cursor_pointer']")).click();
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		WebElement select = driver.findElement(By.name("city"));
		Select opt = new Select (select);
		opt.selectByVisibleText("Chennai");
		
	WebElement select1 = driver.findElement(By.name("genre"));
	Select opt1 =new Select (select1);
	opt1.selectByVisibleText("ANIMATION");
	
	WebElement select2 = driver.findElement(By.name("lang"));
	Select opt2=new Select (select2);
	opt2.selectByVisibleText("ENGLISH");
	
	driver.findElement(By.xpath("//button[text()='Apply']")).click();
	WebElement findElement = driver.findElement(By.xpath("//div[text()='Paw Patrol']"));
	driver.executeScript("arguments[0].click();", findElement);
	driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
	WebElement select3 = driver.findElement(By.id("cinemaName"));
	Select opt3=new Select (select3);
	opt3.selectByVisibleText("INOX The Marina Mall, OMR, Chennai");
	driver.findElement(By.xpath("//input[@class ='ng-untouched ng-pristine ng-valid']")).click();
	driver.findElement(By.xpath("//span[@class ='day-unit ng-star-inserted']")).click();
	WebElement findElement2 = driver.findElement(By.name("timings"));
	Select opt4= new Select (findElement2);
	opt4.selectByVisibleText("09:00 AM - 12:00 PM");
	
	driver.findElement(By.name("noOfTickets")).sendKeys("2");
	
	driver.findElement(By.name("name")).sendKeys("Reshma");
	Thread.sleep(2000);
	driver.findElement(By.name("email")).sendKeys("reshma.peter7@gmail.com");
	driver.findElement(By.name("mobile")).sendKeys("8220640538");
	WebElement option = driver.findElement(By.name("food"));
	Select opt5 = new Select(option);
	opt5.selectByVisibleText("No");
	driver.findElement(By.name("comment")).sendKeys("Nil");
	driver.findElement(By.xpath("//label[@class = 'custom-control custom-radio']")).click();
	driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
	driver.findElement(By.xpath("//button[text()='×']")).click();
	
	String title = driver.getTitle();
	System.out.println(title);
	
	
	
	
	
	
	
			
	
	
	
	
	
	
	
	
	
	

		
		
	

	}

}
