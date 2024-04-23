package week6.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {
	
	public RemoteWebDriver driver;
	
	public String filename;
	
	@Parameters({"url","username","password" ,"browser"})

	@BeforeMethod
	public void preCondition(String url, String username, String password, String browser) {
		
		if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			}
		else if (browser.equalsIgnoreCase("chrome")){
			driver=new ChromeDriver();
			
		}
	
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		

	}

	@AfterMethod()
	
	public void postCondition() {
		driver.close();
		
}
	@DataProvider(name="fetchData" ,indices = {0,2})
	
public String[][]sendData() throws IOException{
	
	
	return IntegrationwithTC.excelData(filename);
}

}
