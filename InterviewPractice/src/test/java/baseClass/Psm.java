package baseClass;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Psm {
	public static RemoteWebDriver driver;
	@BeforeMethod
	public void preCondition() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://beta.tecdemy.com/signup");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		

	}

	@AfterMethod
	
	public void postCondition() {
		driver.close();
		
	}

}
