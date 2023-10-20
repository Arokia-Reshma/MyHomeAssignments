package marathon3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.sukgu.Shadow;

public class ProjectSpecificMethod {

	public ChromeDriver driver;
	public Shadow shadow;
	public static String incNum;
	@BeforeMethod
	public void preCondition() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev63112.service-now.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		shadow = new Shadow(driver);
		shadow.setImplicitWait(5);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Hu@4Y6cU-Gqb");
		driver.findElement(By.id("sysverb_login")).click();
		Thread.sleep(10000);
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Incidents");
		shadow.findElementByXPath("//span[@class ='item-icon']").click();
		WebElement frame= shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		
	}

	@AfterMethod()
	
	public void postCondition() {
		driver.close();
		
	}
}