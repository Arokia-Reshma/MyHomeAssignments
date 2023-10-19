package home.assignment8;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass1 {
public RemoteWebDriver driver;
	
	public String filename;
	
	@DataProvider(name= "fetchData")
	public String[][]excelData() throws IOException {
		
		return ExcelIntegration.excelData(filename);
	}
	
	@Parameters({"url"})
	
	@BeforeMethod
	
	public  void preCondition(String url ) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().frame("iframeResult");
		

	}
	
@AfterMethod()

public void postCondition() {
	driver.close();

}

}



